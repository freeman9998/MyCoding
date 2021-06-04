package com.itwill.util;

import java.text.DecimalFormat;

public class StaticFunction {
	public static String numberPrint(double number,String pattern) {
		DecimalFormat decimalFormat=new DecimalFormat(pattern);
		return decimalFormat.format(number);
	}
}
