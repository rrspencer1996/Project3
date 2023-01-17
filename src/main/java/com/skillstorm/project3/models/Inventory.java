package com.skillstorm.project3.models;
import javax.persistence.*;

@Entity
@Table (name = "Inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "Inventory_id")
	private int id;
	
	@Column(name = "Warehouse_ID")
	private String warehouse_id;
	
	@Column(name = "Part_ID")
	private String part_id;
	
	@Column(name = "Nomenclature")
	private String nomenclature;
	
	@Column(name = "price")
	private int price;

	
	@Column(name = "qty")
	private int qty;

	public int getId() {
		return id;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
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


	public void setId(int id) {
		this.id = id;
	}


	
	
}
