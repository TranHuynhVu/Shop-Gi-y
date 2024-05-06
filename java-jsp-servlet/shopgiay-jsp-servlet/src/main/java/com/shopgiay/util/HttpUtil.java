package com.shopgiay.util;

import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtil {
	private String value;
	public HttpUtil(String value) {
		this.value = value;
	}

	// từ chuỗi string mapper vào đối tượng model
	public <T> T toModel(Class<T> cLass) {
	    try {
	           return new ObjectMapper().readValue(value.toLowerCase(), cLass);	       
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	// chuyển dữ liệu kiêu json thành string
	public static HttpUtil of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HttpUtil(sb.toString());
	}
}