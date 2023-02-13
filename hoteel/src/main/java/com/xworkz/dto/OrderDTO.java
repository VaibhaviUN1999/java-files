package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_table")
public class OrderDTO {
	
	@Id
	@Column(name="e_id")
	private int id;
	@Column(name = "e_name")
	private String hotelName;
	@Column(name = "e_place")
	private String place;
	@Column(name = "e_items")
	private String items;
	@Column(name = "e_price")
	private Double price;
	@Column(name = "e_quantity")
	private Integer quantity;
	@Column(name = "e_takeAway")
    private boolean takeAway;

	public OrderDTO() {
		System.out.println("Order DTO Running");
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", hotelName=" + hotelName + ", place=" + place + ", items=" + items + ", price="
				+ price + ", quantity=" + quantity + ", takeAway=" + takeAway + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getTakeAway() {
		return takeAway;
	}

	public void setTakeAway(Boolean takeAway) {
		this.takeAway = takeAway;
	}

}

