package com.bd.benu.microservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.benu.microservice.model.CurrencyExchangeValue;


public interface CurrencyExchangeValueRepositary extends JpaRepository<CurrencyExchangeValue, Long>{
	
	CurrencyExchangeValue findByFromAndTo(String from, String to);

}
