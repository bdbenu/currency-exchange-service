package com.bd.benu.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bd.benu.microservice.model.CurrencyExchangeValue;
import com.bd.benu.microservice.service.CurrencyExchangeValueService;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeValueService currencyExchangeValueService;
	
	@PostMapping("/createcurrency")
	public CurrencyExchangeValue createCurrencyExchange(@RequestBody CurrencyExchangeValue currencyExchangeValue) {
		return currencyExchangeValueService.currencyExchangeValePost(currencyExchangeValue);
	}
	
	@GetMapping("/exchangeValue/from/{from}/to/{to}")
	public CurrencyExchangeValue fetchAllcurrencyExchangeValues(@PathVariable("from")String  from, @PathVariable("to")String  to) {
		return currencyExchangeValueService.findByFromAndTo(from, to);
		//return new CurrencyExchangeValue(100L, "USD", "INR", 70, 8000L);
	}

}
