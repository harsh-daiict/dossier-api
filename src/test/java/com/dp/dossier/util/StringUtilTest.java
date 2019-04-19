package com.dp.dossier.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.demo.util.StringUtil;
import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void isBlankOrNullShouldReturnTrueWithNullString() {
		assertTrue(StringUtil.isBlankOrNull(null));
	}
	
	@Test
	public void isBlankOrNullShouldReturnTrueWithBlankString() {
		assertTrue(StringUtil.isBlankOrNull(""));
	}
	
	@Test
	public void isBlankOrNullShouldReturnFalseWithNonEmptyString() {
		assertFalse(StringUtil.isBlankOrNull("Test String"));
	}
	
}
