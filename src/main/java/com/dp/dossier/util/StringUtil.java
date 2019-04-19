package com.dp.dossier.util;

public class StringUtil {
	
	public static boolean isBlankOrNull(String str) {
		if(str != null && !str.equals("")) return false;
		return true;
	}

}
