package com.associationMapping.OTM;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "VECHILE")
public class Vechile {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "VECHILE_ID")
	private int vechileId;
	
	@Column(name = "VECHILE_NAME")
	private String vechileName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_ID_FK",referencedColumnName="USER_ID")
	private UserDetail user;
	public int getVechileId() {
		return vechileId;
	}
	public void setVechileId(int vechileId) {
		this.vechileId = vechileId;
	}
	public String getVechileName() {
		return vechileName;
	}
	public void setVechileName(String vechileName) {
		this.vechileName = vechileName;
	}
	public UserDetail getUser() {
		return user;
	}
	public void setUser(UserDetail user) {
		this.user = user;
	}
	
}
