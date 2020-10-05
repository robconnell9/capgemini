package com.capgemini.capgapi.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapgService {
	
	public BigDecimal getSqrtSumSqHigh3(List<Integer> data) {

    	if (data.size() < 3) {
    		throw new RuntimeException("Must be atleast 3 values");
    	}
    	
		Integer sum = data.stream().
				sorted(Comparator.reverseOrder()).
				limit(3).
				map(n -> n * n).
				reduce(0,(a,b) -> a + b);
		return new BigDecimal(Math.sqrt(new Double(sum))).setScale(2, BigDecimal.ROUND_HALF_UP);		
	}
	
	public static void main(String[] args) {
		CapgService service = new CapgService();
		Integer[] testArray = {1,6,5,4};
		Integer[] testArrayShort = {1,6};

		System.out.println("answer:" +service.getSqrtSumSqHigh3(Arrays.asList(testArray)));
		System.out.println("answer2:" +service.getSqrtSumSqHigh3(Arrays.asList(testArrayShort)));
		
		
	}

}
