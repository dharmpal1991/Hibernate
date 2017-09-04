package com.associationMapping.OTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VECHILE")
public class Vechile {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "VECHILE_ID")
	private int vechileId;
	
	@Column(name = "VECHILE_NAME")
	private String vechileName;
	
	@OneToOne(mappedBy = "vecile",cascade = CascadeType.ALL)
	private UserDetail userDetail;
	
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
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
	
	

}
