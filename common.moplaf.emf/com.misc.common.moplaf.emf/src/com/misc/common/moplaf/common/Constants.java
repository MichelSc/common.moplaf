package com.misc.common.moplaf.common;

/**
 * The Constant shared by all components of the Moplaf framework
 * <p>
 * <ul>
 *   <li>traits values</li>
 *   <li>horizontal/vertical alignment values</li>
 *   <li>aggregation types</li>
 *   <li>data types</li>
 * </ul>
 * </p>
 * 
 */public interface Constants {
	
	static int TRAITS_NONE      = 0;
	static int TRAITS_BARCHART  = 1; // a bunch of rows with a few columns 
	static int TRAITS_KEY       = 2; // is part of the identity of the object 
	static int TRAITS_HIGHLIGHT = 4;

	static int NO_ALIGN                = 0;
	static int HORIZONTAL_ALIGN_LEFT   = 1;
	static int HORIZONTAL_ALIGN_RIGHT  = 2;
	static int HORIZONTAL_ALIGN_CENTER = 4;
	static int VERTICAL_ALIGN_TOP      = 8;
	static int VERTICAL_ALIGN_BOTTOM   = 16;
	static int VERTICAL_ALIGN_CENTER   = 32;

	static int AGGREGATE_NONE   =   8;
	static int AGGREGATE_COUNT  =  16;
	static int AGGREGATE_SUM    =  32;
	static int AGGREGATE_MIN    =  64;
	static int AGGREGATE_MAX    = 128;

	static int DATA_TYPE_UNKOWN   = 0;
	static int DATA_TYPE_STRING   = 1;
	static int DATA_TYPE_DATE     = 2;
	static int DATA_TYPE_FLOAT    = 3;
	static int DATA_TYPE_DOUBLE   = 4;
	static int DATA_TYPE_INT      = 5;
	static int DATA_TYPE_LONG     = 6;
	static int DATA_TYPE_BOOLEAN  = 7;
	static int DATA_TYPE_EMF_ENUM = 8;
}
