package com.associationMapping.MTM;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAIL_MTM")
public class UserDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TBL_USER_VEHICAL"
	, joinColumns = @JoinColumn(name = "USER_ID_FK", referencedColumnName = "USER_ID")
	, inverseJoinColumns = @JoinColumn(name = "VECHILE_ID_FK", referencedColumnName = "VECHILE_ID"))
	private Collection<Vechile> vechile = new ArrayList<Vechile>();
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
	public Collection<Vechile> getVechile() {
		return vechile;
	}
	public void setVechile(Collection<Vechile> vechile) {
		this.vechile = vechile;
	}
	

}
