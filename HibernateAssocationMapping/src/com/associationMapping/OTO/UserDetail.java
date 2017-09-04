package com.associationMapping.OTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAIL")
public class UserDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@OneToOne
	@JoinColumn(name = "VEHICLE_ID_FK")
	private Vechile vechile;
	
	public Vechile getVechile() {
		return vechile;
	}
	public void setVechile(Vechile vechile) {
		this.vechile = vechile;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
