package com.capgemini.capgapi;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.capgapi.service.CapgService;

class CapgapiApplicationTests {

	private CapgService service = new CapgService();


	@DisplayName("Standard Test")
	@Test
	void testStandard() {
	//	CapgService service = new CapgService();
		Integer[] testArray = { 5, 4, 6, 1 };
		BigDecimal result = service.getSqrtSumSqHigh3(Arrays.asList(testArray));
		Assertions.assertEquals(result.toString(), "8.77");
	}

	@DisplayName("Standard Test diff order")
	@Test
	void testStandardDiffOrder() {
		//CapgService service = new CapgService();
		Integer[] testArray = { 1, 6, 5, 4 };
		BigDecimal result = service.getSqrtSumSqHigh3(Arrays.asList(testArray));
		Assertions.assertEquals(result.toString(), "8.77");
	}

	@DisplayName("Simple Test")
	@Test
	void testSimple() {
	//	CapgService service = new CapgService();
		Integer[] testArray = { 1, 1, 1, 1 };
		BigDecimal result = service.getSqrtSumSqHigh3(Arrays.asList(testArray));
		Assertions.assertEquals(result.toString(), "1.73");
	}

	@DisplayName("Zero Test")
	@Test
	void testZero() {
	//	CapgService service = new CapgService();
		Integer[] testArray = { 1, 1, 0, 0 };
		BigDecimal result = service.getSqrtSumSqHigh3(Arrays.asList(testArray));
		Assertions.assertEquals(result.toString(), "1.41");
	}

	@DisplayName("Exception Test")
	@Test
	void testExceptionTest() {
		//CapgService service = new CapgService();
		Integer[] testArray = { 1, 6 };
		Assertions.assertThrows(RuntimeException.class, () -> {
			service.getSqrtSumSqHigh3(Arrays.asList(testArray));
		});
	}

}
