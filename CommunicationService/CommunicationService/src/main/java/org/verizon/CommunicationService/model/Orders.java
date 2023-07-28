package org.verizon.CommunicationService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	
	@Id 
	private int order_id;
	@ManyToOne
	@JoinColumn(name = "plan_id")
	private Catalog catalog;
	
	public Orders() {
		
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	
	
	
	
	

}
