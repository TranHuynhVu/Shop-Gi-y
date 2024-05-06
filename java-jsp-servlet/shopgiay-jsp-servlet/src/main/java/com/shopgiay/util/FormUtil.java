package com.shopgiay.util;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FormUtil {
	@SuppressWarnings("deprecation")
	public static <T> T toModel(Class<T> clazz, HttpServletRequest request) {
	    T object = null;
	    try {
	        object = clazz.getDeclaredConstructor().newInstance();
	        BeanUtils.populate(object, request.getParameterMap());
	    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
	        System.err.println("Error occurred: " + e.getMessage());
	    }
	    return object;
	}

}
