package com.diogo.workshop.unittest.dto;

public class ItemDTO {
	int id;
	int price;
	int qtd;
	int total;
	
	public ItemDTO(int id, int price, int qtd, int total) {
		super();
		this.id = id;
		this.price = price;
		this.qtd = qtd;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}
