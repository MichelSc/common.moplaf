/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.time.discrete.util;

import java.util.Date;

import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;

public class Util {
	/**
	 * Standard logic for refreshing an ObjetTimeLine?
	 * @param theTimeLine
	 */
	public static void refresh(ObjectWithTimeLine theTimeLine){
		if (theTimeLine.getStartBucket()==null ) { return; }
		if (theTimeLine.getEndBucket()==null ) { return; }
		
		int maxiterations = 30000;
		
		// remove the too much at the head
		while (theTimeLine.getFirstBucket()!=null 
			&& theTimeLine.getFirstBucket().getBucket().isBeforeStrictly(theTimeLine.getStartBucket())
			&& --maxiterations>0 ) {
			// remove first
			ObjectTimeBucket oldfirst = theTimeLine.getFirstBucket();
			ObjectTimeBucket newfirst = oldfirst.getNext();
			oldfirst.dispose();
			oldfirst.setNext(null);
			theTimeLine.setFirstBucket(newfirst);
			oldfirst.setBucket(null);
			theTimeLine.getBuckets().remove(oldfirst);
		}
		
		// remove the too much at the tail
		while (theTimeLine.getLastBucket()!=null 
			&& theTimeLine.getLastBucket().getBucket().isAfterStrictly(theTimeLine.getEndBucket())
			&& --maxiterations>0){
			// remove last
			ObjectTimeBucket oldlast = theTimeLine.getLastBucket();
			ObjectTimeBucket newlast = oldlast.getPrevious();
			oldlast.dispose();
			oldlast.setPrevious(null);
			theTimeLine.setLastBucket(newlast);
			oldlast.setBucket(null);
			theTimeLine.getBuckets().remove(oldlast);
		}
		
		if (   theTimeLine.getStartBucket().isAfterStrictly( theTimeLine.getEndBucket() )) {
			// empty period
			return;
		}
		
		if ( theTimeLine.getFirstBucket()==null)	{
			// the time line is presently empty
			// create an initial bucket
			ObjectTimeBucket initialbucket = theTimeLine.constructObjectTimeBucket();
			initialbucket.setBucket(theTimeLine.getStartBucket());
			theTimeLine.setFirstBucket(initialbucket);
			theTimeLine.setLastBucket(initialbucket);
			theTimeLine.getBuckets().add(initialbucket);
		}
		
		while  ( theTimeLine.getFirstBucket().getBucket().isAfterStrictly(theTimeLine.getStartBucket() )
			&& --maxiterations>0){
			// add a new first previous to the old first
			ObjectTimeBucket oldfirst = theTimeLine.getFirstBucket();
			ObjectTimeBucket newfirst = theTimeLine.constructObjectTimeBucket();
			newfirst.setNext(oldfirst);
			theTimeLine.setFirstBucket(newfirst);
			newfirst.setBucket(oldfirst.getBucket().getPrevious());
			theTimeLine.getBuckets().add(0, newfirst); // adds as first
		}
		
		while  ( theTimeLine.getLastBucket().getBucket().isBeforeStrictly(theTimeLine.getEndBucket() )
				&& --maxiterations>0){
			// add a new last next to the old last
			ObjectTimeBucket oldlast = theTimeLine.getLastBucket();
			ObjectTimeBucket newlast = theTimeLine.constructObjectTimeBucket();
			newlast.setPrevious(oldlast);
			theTimeLine.setLastBucket(newlast);
			newlast.setBucket(oldlast.getBucket().getNext());
			theTimeLine.getBuckets().add(newlast);  // adds as last
		}
		
	}

	/**
	 * If offset is zero, return start bucket.
	 * <p>
	 * If offset is greater than zero, returns the first bucket after startbucket 
	 * containing offset duration after the end of the bucket. It will thus return
	 * some bucket strictly after startbucket.
	 * <p>
	 * If offset is smaller than zero, returns the first bucket before startbucket 
	 * containing offset duration after the end of the bucket. It will thus return
	 * some bucket strictly before startbucket.
	 * <p>
	 * @param theTimeLine
	 * @param startbucket
	 * @param secondsOffset
	 * @return
	 */
	public static ObjectTimeBucket getBucketCeil(ObjectWithTimeLine theTimeLine, ObjectTimeBucket startbucket, float secondsOffset){
		if ( secondsOffset==0.0f){
			return startbucket;
		} else if ( secondsOffset>0.0f){
			Date currentTime = startbucket.getBucket().getBucketEnd();
			long targetTimeAslong = currentTime.getTime()+(long)(secondsOffset*1000);
			Date targetTime = new Date(targetTimeAslong);
			ObjectTimeBucket currentBucket = startbucket;
			while ( currentBucket != null && !currentBucket.getBucket().contains(targetTime)){
				currentBucket = currentBucket.getNext();
			}
			return currentBucket;
		} else {
			Date currentTime = startbucket.getBucket().getBucketStart();
			long targetTimeAslong = currentTime.getTime()+(long)(secondsOffset*1000);
			Date targetTime = new Date(targetTimeAslong);
			ObjectTimeBucket currentBucket = startbucket;
			while ( currentBucket != null && !currentBucket.getBucket().contains(targetTime)){
				currentBucket = currentBucket.getPrevious();
			}
			return currentBucket;
		}
	}
	
	/**
	 * If offset is zero, return start bucket.
	 * <p>
	 * If offset is greater than zero, returns the first bucket after startbucket 
	 * containing offset duration after the start of the bucket. It may thus return 
	 * startbucket for an Offset small enough.
	 * <p>
	 * If offset is smaller than zero, returns the first bucket before endbucket 
	 * containing offset duration after the end of the bucket. It may thus return 
	 * startbucket for an Offset small enough.
	 * <p>
	 * @param theTimeLine
	 * @param startbucket
	 * @param secondsOffset
	 * @return
	 */
	public static ObjectTimeBucket getBucketFloor(ObjectWithTimeLine theTimeLine, ObjectTimeBucket startbucket, float secondsOffset){
		if ( secondsOffset==0.0f){
			return startbucket;
		} else if ( secondsOffset>0.0f){
			Date currentTime = startbucket.getBucket().getBucketStart();
			long targetTimeAslong = currentTime.getTime()+(long)(secondsOffset*1000);
			Date targetTime = new Date(targetTimeAslong);
			ObjectTimeBucket currentBucket = startbucket;
			while ( currentBucket != null && !currentBucket.getBucket().contains(targetTime)){
				currentBucket = currentBucket.getNext();
			}
			return currentBucket;
		} else {
			Date currentTime = startbucket.getBucket().getBucketEnd();
			long targetTimeAslong = currentTime.getTime()-(long)(secondsOffset*1000);
			Date targetTime = new Date(targetTimeAslong);
			ObjectTimeBucket currentBucket = startbucket;
			while ( currentBucket != null && !currentBucket.getBucket().contains(targetTime)){
				currentBucket = currentBucket.getPrevious();
			}
			return currentBucket;
		}
	}
	/**
	 * Logic for efficiently getting a bucket.
	 * To be reused by concrete implementations
	 * @param theTimeLine
	 * @param bucket
	 * @param hint
	 * @return
	 */
	public static ObjectTimeBucket getBucket(ObjectWithTimeLine theTimeLine, TimeBucket bucket, ObjectTimeBucket hint){
		if ( bucket == null ) { return null; }
		// try to achieve constant time perfs if the target bucket is close 
		//    to the first bucket 
		//    or to the last bucket
		//    or to the previous target bucket
		ObjectTimeBucket current = hint == null ? theTimeLine.getFirstBucket() : hint;
				
		int dist_to_curr  = bucket.getBucketNr()-current.getBucket().getBucketNr();

		// compare current and first
		int dist_to_first = bucket.getBucketNr()-theTimeLine.getFirstBucket().getBucket().getBucketNr();
		if ( dist_to_first<0 ) { return null; }
		if ( dist_to_first<Math.abs(dist_to_curr)){
			current = theTimeLine.getFirstBucket();
			dist_to_curr = dist_to_first;
		}

		// compare current and last
		int dist_to_last  = bucket.getBucketNr()-theTimeLine.getLastBucket().getBucket().getBucketNr();
		if ( dist_to_last>0 ) { return null; }
		if ( dist_to_last>-Math.abs(dist_to_curr)){
			current = theTimeLine.getLastBucket();
			dist_to_curr = dist_to_last;
		}
		
		// walk from current to the target
		while ( Math.abs(dist_to_curr)>0){
			if ( dist_to_curr>0){
				current = current.getNext();
				dist_to_curr--;
			} else {
				current = current.getPrevious();
				dist_to_curr++;
			}
		}

		return current;
	}

}
