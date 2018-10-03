package com.misc.common.moplaf.gridview.emf.edit.util;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

public class Util {

	static public String getTextFromValue(Object cellValue, int cellType, String format) {
		if ( format!=null) {
			return String.format(format, cellValue);
		} else {
			switch ( cellType ) {
			case IItemGridsProvider.DATA_TYPE_STRING: 
				return cellValue == null ? "" : (String)cellValue;
			case IItemGridsProvider.DATA_TYPE_DATE: 
				return String.format("%1$tF %1$tT", cellValue);
			case IItemGridsProvider.DATA_TYPE_FLOAT:
			case IItemGridsProvider.DATA_TYPE_DOUBLE:
				return String.format("%1$.2f", cellValue);
			case IItemGridsProvider.DATA_TYPE_INT:
			case IItemGridsProvider.DATA_TYPE_LONG:
				return String.format("%1$d", cellValue);
			case IItemGridsProvider.DATA_TYPE_BOOLEAN:
				return String.format("%1$b", cellValue);
			default: 
				return "";
			}
		}
	}
	
	static public double getDoubleValue(Object cellValue, int cellType) {
		switch ( cellType ) {
		case IItemGridsProvider.DATA_TYPE_FLOAT:
			return (Float)cellValue;
		case IItemGridsProvider.DATA_TYPE_DOUBLE:
			return (Double)cellValue;
		case IItemGridsProvider.DATA_TYPE_INT:
			return (Integer)cellValue;
		case IItemGridsProvider.DATA_TYPE_LONG:
			return (Long)cellValue;
		case IItemGridsProvider.DATA_TYPE_BOOLEAN:
			boolean value_boolean = (Boolean)cellValue;
			return value_boolean ? 1.0d : 0.0d;
		case IItemGridsProvider.DATA_TYPE_STRING: 
		case IItemGridsProvider.DATA_TYPE_DATE: 
		default: 
			return 0.0;
		}
	}
	
	static public Object getTypeCellValue(Number cellValue, int cellType) {
		switch ( cellType ) {
		case IItemGridsProvider.DATA_TYPE_FLOAT:
			return cellValue.floatValue();
		case IItemGridsProvider.DATA_TYPE_DOUBLE:
			return cellValue.doubleValue();
		case IItemGridsProvider.DATA_TYPE_INT:
			return cellValue.intValue();
		case IItemGridsProvider.DATA_TYPE_LONG:
			return cellValue.longValue();
		case IItemGridsProvider.DATA_TYPE_BOOLEAN:
		case IItemGridsProvider.DATA_TYPE_STRING: 
		case IItemGridsProvider.DATA_TYPE_DATE: 
		default: 
			return null;
		}
	}
	
	static public float getFloatValue(Object cellValue, int cellType) {
		return (float)getDoubleValue(cellValue, cellType);
	}
}
