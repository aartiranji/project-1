package com.mvc.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mvc.entity.NonMpOnlineTransaction;

public class ConversionUtils {
 
	public static Object convertMapToEntity(Map<String, Object> object, Class<?> objClass) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		return objectMapper.convertValue(object, objClass);		
//		Gson gson = new Gson();
//		JsonElement jsonElement = gson.toJsonTree(context);
//		NonMpOnlineTransaction pojo = gson.fromJson(jsonElement, NonMpOnlineTransaction.class);
	}
	
	public static List<NonMpOnlineTransaction> convertMapListToEntityList(List<Map<String, Object>> list, Class<?> objClass) {
		List<NonMpOnlineTransaction> listofEntity = new ArrayList<>();
		
		for(Map<String, Object> object : list) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		NonMpOnlineTransaction obj = objectMapper.convertValue(object, NonMpOnlineTransaction.class);
		listofEntity.add(obj);
		}
		
		return listofEntity;		
	}
}