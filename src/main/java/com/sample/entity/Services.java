package com.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Services {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String sku;
	String category;
	String description;
	double salesprice;
	String incomeaccount;
	double salestax;
	String purchasinginformation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSalesprice() {
		return salesprice;
	}
	public void setSalesprice(double salesprice) {
		this.salesprice = salesprice;
	}
	public String getIncomeaccount() {
		return incomeaccount;
	}
	public void setIncomeaccount(String incomeaccount) {
		this.incomeaccount = incomeaccount;
	}
	public double getSalestax() {
		return salestax;
	}
	public void setSalestax(double salestax) {
		this.salestax = salestax;
	}
	public String getPurchasinginformation() {
		return purchasinginformation;
	}
	public void setPurchasinginformation(String purchasinginformation) {
		this.purchasinginformation = purchasinginformation;
	}
	
	

}
