package com.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "NonMpOnlineTransaction")
public class NonMpOnlineTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int userId;

	@Column(nullable = false)
	private String task;

	@Column(nullable = false)
	private String type;

	@Column(nullable = false)
	private String size;
	@Column
	private int quantity;
	@Column
	private int price;
	@Column
	private int totalPrice;
	@Column
	private String printoutSource;
	@Column
	private String laminationQuality;
	@Column
	private String duplicateCardType;
	@Column
	private String typingWork;
	@Column
	private String otherDescription;
	@Column
	private String transactionMasterId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPrintoutSource() {
		return printoutSource;
	}

	public void setPrintoutSource(String printoutSource) {
		this.printoutSource = printoutSource;
	}

	public String getLaminationQuality() {
		return laminationQuality;
	}

	public void setLaminationQuality(String laminationQuality) {
		this.laminationQuality = laminationQuality;
	}

	public String getDuplicateCardType() {
		return duplicateCardType;
	}

	public void setDuplicateCardType(String duplicateCardType) {
		this.duplicateCardType = duplicateCardType;
	}

	public String getTypingWork() {
		return typingWork;
	}

	public void setTypingWork(String typingWork) {
		this.typingWork = typingWork;
	}

	public String getOtherDescription() {
		return otherDescription;
	}

	public void setOtherDescription(String otherDescription) {
		this.otherDescription = otherDescription;
	}

	public String getTransactionMasterId() {
		return transactionMasterId;
	}

	public void setTransactionMasterId(String transactionMasterId) {
		this.transactionMasterId = transactionMasterId;
	}

}
