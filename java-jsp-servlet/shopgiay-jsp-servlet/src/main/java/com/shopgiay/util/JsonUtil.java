package com.shopgiay.util;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.JSONObject;

public class JsonUtil {
	private JSONObject object;
	
	public JsonUtil(String value) {
		this.object = new JSONObject(value);
	}
	public JSONObject getObject() {
		return object;
	}

	public void setObject(JSONObject object) {
		this.object = object;
	}

	// chuyển dữ liệu kiêu json thành string
	public static JsonUtil of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		
		String line;
		try {
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb.toString());
		return new JsonUtil(sb.toString());
	}
}