package com.capgemini.capgapi.web;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capgapi.service.CapgService;

@RestController
@RequestMapping(value = "/calculate")
public class CapgController {
	
	@Autowired
	private CapgService capgService;
    
    @ResponseBody
	@PostMapping(value = "/sqrtSumSqHigh3")
	public Output getSqrtSumSqHigh3(@Valid @RequestBody Input data) {
    	return new Output(capgService.getSqrtSumSqHigh3(data.getDataAsList()));
	}
    
    private static class Input {
    	@Valid
    	private Integer[] data;
    	
    	private List<Integer> getDataAsList() {
    		return Arrays.asList(data);
    	}

		public Integer[] getData() {
			return data;
		}

		public void setData(Integer[] data) {
			this.data = data;
		}
    	
    	
    }
    
    private static class Output {
    	private BigDecimal data;

		public Output(BigDecimal data) {
			super();
			this.data = data;
		}

		public BigDecimal getOutput() {
			return data;
		}

		public void setOutput(BigDecimal data) {
			this.data = data;
		}
		
		
		
    	
    }

}
