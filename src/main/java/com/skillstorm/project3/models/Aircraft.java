package com.skillstorm.project3.models;

import javax.persistence.*;


@Entity
@Table(name = "aircraft")


public class Aircraft {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Part_ID")
	private int part_id;

	@Column(name = "Nomenclature")
	private String nomenclature;
	
	@Column(name = "Engine_Manufacturer")
	private String engine_manufacturer;
	
	@Column(name = "In_Stock")
	private int in_stock;
	
	@Column(name = "Qty")
	private int qty;
	
	@Column(name = "Price")
	private int price;

	@Column(name = "Warehouse_ID")
	private boolean warehouse_id;

	public int getPart_id() {
		return part_id;
	}

	public void setPart_id(int part_id) {
		this.part_id = part_id;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
	}

	public String getEngine_manufacturer() {
		return engine_manufacturer;
	}

	public void setEngine_manufacturer(String engine_manufacturer) {
		this.engine_manufacturer = engine_manufacturer;
	}

	public int getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(int in_stock) {
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

	public boolean isWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(boolean warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	@Override
	public String toString() {
		return "Aircraft [part_id=" + part_id + ", nomenclature=" + nomenclature + ", engine_manufacturer="
				+ engine_manufacturer + ", in_stock=" + in_stock + ", qty=" + qty + ", price=" + price
				+ ", warehouse_id=" + warehouse_id + "]";
	}

}
