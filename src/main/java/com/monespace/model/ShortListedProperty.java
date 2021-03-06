package com.monespace.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.google.gson.annotations.Expose;

@SuppressWarnings("serial")
@Entity
public class ShortListedProperty implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private int shortListedPropertyId;
	@Expose
	private int shortListId;
	@Expose
	private int userId;
	@Expose
	private int propertyId;
	@Expose
	private String propertyName;
	@Expose
	private String propertyDescription;
	@Expose
	private String propertyDiscount;
	@Expose
	private String propertyPrice;
//	@Expose
//	private String quantity;
	@Expose
	private Date orderDate;	/*orderDate*/
	@Expose
	private Boolean flag;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable=false, insertable=false, updatable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="propertyId", nullable=false, insertable=false, updatable=false)
	private Property property;
	
	@ManyToOne
	@JoinColumn(name="shortListId", nullable=false, insertable=false, updatable=false)
	private ShortList shortList;

	public int getShortListedPropertyId() {
		return shortListedPropertyId;
	}

	public void setShortListedPropertyId(int shortListedPropertyId) {
		this.shortListedPropertyId = shortListedPropertyId;
	}

	public int getShortListId() {
		return shortListId;
	}

	public void setShortListId(int shortListId) {
		this.shortListId = shortListId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getPropertyDiscount() {
		return propertyDiscount;
	}

	public void setPropertyDiscount(String propertyDiscount) {
		this.propertyDiscount = propertyDiscount;
	}

	public String getPropertyPrice() {
		return propertyPrice;
	}

	public void setPropertyPrice(String propertyPrice) {
		this.propertyPrice = propertyPrice;
	}

	public Date getDate() {
		return orderDate;
	}

	public void setDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public ShortList getShortList() {
		return shortList;
	}

	public void setShortList(ShortList shortList) {
		this.shortList = shortList;
	}
	
	
	
}
