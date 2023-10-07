package com.mishkinstvo.gachiapi;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Client {
	BigInteger id;
	String name;
	String address;
	BigDecimal debt;

	public Client(BigInteger id, String name, String address, BigDecimal debt) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.debt = debt;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getDebt() {
		return debt;
	}

	public void setDebt(BigDecimal debt) {
		this.debt = debt;
	}
}
