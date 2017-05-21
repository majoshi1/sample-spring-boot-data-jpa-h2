package com.example.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Cache_Media")
// Account
public class CacheMedia{
	
	//@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	@Id	
	@Column(name="acctNum")
	private String acctNum;
	@Column(name="description")
	private String media_Description;
	
	//@OneToOne(cascade=CascadeType.ALL, mappedBy="ReleaseDateType")
	//private ReleaseDateType releaseDateType;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMedia_Description() {
		return media_Description;
	}
	
	public void setMedia_Description(String media_Description) {
		this.media_Description = media_Description;
	}

	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}
	
	/*public ReleaseDateType getReleaseDateType() {
		return releaseDateType;
	}
	
	public void setReleaseDateType(ReleaseDateType releaseDateType) {
		this.releaseDateType = releaseDateType;
	}*/
	

}