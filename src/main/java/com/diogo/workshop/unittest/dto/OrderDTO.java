package com.diogo.workshop.unittest.dto;

import java.util.List;

public class OrderDTO {
	int total;
	List<ItemDTO> items;
	int deliveryPrice;
	int userId;
	int cardId;
	
	public OrderDTO(int total, List<ItemDTO> items, int deliveryPrice, int userId, int cardId) {
		super();
		this.total = total;
		this.items = items;
		this.deliveryPrice = deliveryPrice;
		this.userId = userId;
		this.cardId = cardId;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public int getDeliveryPrice() {
		return deliveryPrice;
	}
	public void setDeliveryPrice(int deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	
	
	
}
