package com.example.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Release_date_type")
// AccountGroup
public class ReleaseDateType {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private Integer id;

    @Column
    private String acctNum;

    @Column
    private String description;
    
    //@Column(nullable = true) 
    //private Integer media_Id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="acctNum", nullable=true, insertable=false, updatable=false)
    private CacheMedia cacheMedia;
    
	public Integer getId() {
		return id;
	}
	
	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CacheMedia getCacheMedia() {
		return cacheMedia;
	}
	public void setCacheMedia(CacheMedia cacheMedia) {
		this.cacheMedia = cacheMedia;
	}
   
    
}