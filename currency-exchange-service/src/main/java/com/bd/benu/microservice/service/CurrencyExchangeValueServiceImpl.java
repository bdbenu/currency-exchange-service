package com.bd.benu.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.microservice.model.CurrencyExchangeValue;
import com.bd.benu.microservice.repo.CurrencyExchangeValueRepositary;

@Service
public class CurrencyExchangeValueServiceImpl implements CurrencyExchangeValueService{
	
	@Autowired
	private CurrencyExchangeValueRepositary currencyExchangeValueRepositary;

	@Override
	public CurrencyExchangeValue findByFromAndTo(String from, String to) {
		
		return currencyExchangeValueRepositary.findByFromAndTo(from, to);
	}

	@Override
	public CurrencyExchangeValue currencyExchangeValePost(CurrencyExchangeValue currencyExchangeValue) {
		
		return currencyExchangeValueRepositary.save(currencyExchangeValue);
	}

}
