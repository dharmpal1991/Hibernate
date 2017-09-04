package com.associationMapping.MTM;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VECHILE_MTM")
public class Vechile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VECHILE_ID")
	private int vechileId;
	
	@Column(name = "VECHILE_NAME")
	private String vechileName;
	
	@ManyToMany(mappedBy = "vechile",cascade = CascadeType.ALL)
	private Collection<UserDetail> user = new ArrayList<UserDetail>();
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
	public Collection<UserDetail> getUser() {
		return user;
	}
	public void setUser(Collection<UserDetail> user) {
		this.user = user;
	}
	

}
