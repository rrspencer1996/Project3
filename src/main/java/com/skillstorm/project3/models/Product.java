package com.skillstorm.project3.models;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "nomenclature")
	private String nomenclature;
	
	@Column(name = "in_stock")
	private boolean in_stock;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "location")
	private boolean location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
	}

	public boolean isIn_stock() {
		return in_stock;
	}

	public void setIn_stock(boolean in_stock) {
		this.in_stock = in_stock;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLocation() {
		return location;
	}

	public void setLocation(boolean location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nomenclature=" + nomenclature + ", in_stock=" + in_stock + ", qty=" + qty
				+ ", price=" + price + ", name=" + name + ", location=" + location + "]";
	}
	
}
