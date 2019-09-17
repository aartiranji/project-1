package com.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mvc.entity.NonMpOnlineTransaction;
import com.mvc.repository.NonMpOnlineTransactionRepository;
import com.mvc.utility.ConversionUtils;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/nmpo")
public class NonMpOnlineTransactionController {

	@Autowired
	NonMpOnlineTransactionRepository nonMpOnlineTransactionRepository;
	
	
	@GetMapping(value = "/txn", produces = "application/json")
	public List<Map<String,Object>> getAll() {
		List<Map<String,Object>> list =new ArrayList<>();
		Map<String,Object> map =new HashMap<>();
		map.put("id", 1);map.put("task", "photocpy");map.put("quantity",2);map.put("price", 10);
		list.add(map);
		//return list;
		return nonMpOnlineTransactionRepository.getAll();
	}
	
	@PostMapping(value = "/txn", produces = "application/json")
	public String save(@RequestBody Map<String, Object> context) {
		NonMpOnlineTransaction nmpoTxn = (NonMpOnlineTransaction) ConversionUtils.convertMapToEntity(context, NonMpOnlineTransaction.class);
		nonMpOnlineTransactionRepository.save(nmpoTxn);
		return JSONObject.quote("Hello World");
	}
	
	@PostMapping(value = "/txn/all", produces = "application/json")
	public String saveAll(@RequestBody List<Map<String, Object>> context) {
		List<NonMpOnlineTransaction> nmpoTxnlist= ConversionUtils.convertMapListToEntityList(context, NonMpOnlineTransaction.class);	
		nonMpOnlineTransactionRepository.saveAll(nmpoTxnlist);
		return JSONObject.quote("Hello World");
	}
}
