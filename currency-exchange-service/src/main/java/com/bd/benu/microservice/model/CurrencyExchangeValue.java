package com.bd.benu.microservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCY_EXCHANGE")
public class CurrencyExchangeValue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "CURRENCY_FROM")
	private String from;
	@Column(name = "CURRENCY_TO")
	private String to;
	private long convestionMultiple;
	private Long port;
	
	public CurrencyExchangeValue() {
		super();
	}
	

	public CurrencyExchangeValue(Long id, String from, String to, long convestionMultiple, Long port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convestionMultiple = convestionMultiple;
		this.port = port;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public long getConvestionMultiple() {
		return convestionMultiple;
	}

	public void setConvestionMultiple(long convestionMultiple) {
		this.convestionMultiple = convestionMultiple;
	}

	public Long getPort() {
		return port;
	}

	public void setPort(Long port) {
		this.port = port;
	}
	
	

}
