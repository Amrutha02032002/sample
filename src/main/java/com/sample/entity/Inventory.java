package com.sample.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String sku;
    private int quantity;
    private String date;
    private String reorder;
    private String description;
    private double salesprice;
    private double salestax;
    private String purchasinginformation;
    private double cost;
    private int categoryid;
    private int assetaccountid;
    

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "asset_account_id")
    private Assetaccount assetAccount;

    @ManyToOne
    @JoinColumn(name = "income_account_id")
    private Incomeaccount incomeAccount;

    @ManyToOne
    @JoinColumn(name = "expense_account_id")
    private Expenseaccount expenseAccount;

    @ManyToOne
    @JoinColumn(name = "preferred_vendor_id")
    private Preferredvendor preferredVendor;

    // Getters and setters
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReorder() {
        return reorder;
    }

    public void setReorder(String reorder) {
        this.reorder = reorder;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

	public Assetaccount getAssetAccount() {
		return assetAccount;
	}

	public void setAssetAccount(Assetaccount assetAccount) {
		this.assetAccount = assetAccount;
	}


    public Incomeaccount getIncomeAccount() {
		return incomeAccount;
	}

	public void setIncomeAccount(Incomeaccount incomeAccount) {
		this.incomeAccount = incomeAccount;
	}

	public Expenseaccount getExpenseAccount() {
		return expenseAccount;
	}

	public void setExpenseAccount(Expenseaccount expenseAccount) {
		this.expenseAccount = expenseAccount;
	}

	public Preferredvendor getPreferredVendor() {
		return preferredVendor;
	}

	public void setPreferredVendor(Preferredvendor preferredVendor) {
		this.preferredVendor = preferredVendor;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getAssetaccountid() {
		return assetaccountid;
	}

	public void setAssetaccountid(int assetaccountid) {
		this.assetaccountid = assetaccountid;
	}

	
	
}



