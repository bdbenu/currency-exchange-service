package com.bd.benu.microservice.service;

import com.bd.benu.microservice.model.CurrencyExchangeValue;

public interface CurrencyExchangeValueService {

	public CurrencyExchangeValue currencyExchangeValePost(CurrencyExchangeValue currencyExchangeValue);
	
	CurrencyExchangeValue findByFromAndTo(String from, String to);
}
