package com.management.hospital;

import java.util.Date;

public class InvoiceBuilder {
	private Invoice invoice;
	
	InvoiceBuilder(){
		invoice = new Invoice();
	}
	
	public void buildId() {
		invoice.setId(null);
	}
	
	public void buildDate() {
		Date date = new Date();
		invoice.setDate(date);
	}
	
	public void buildAmount() {
		invoice.setAmount("2000");
	}
	
	public void buildPatientId() {
		invoice.setPatientId("501");
	}
	
	public Invoice getInvoice() {
		return invoice;
	}

}
