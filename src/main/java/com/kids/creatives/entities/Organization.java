package com.kids.creatives.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="organization")
public class Organization {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int uid;
	@Column(name="org_name")
    private String orgname;
	@Column(name="org_address")
    private String orgAddress;//add street name and postal code
	@Column(name="org_city")
    private String orgCity;
	@Column(name="org_province")
    private String orgProvince;
	@Column(name="org_email")
    private String orgEmail;
	@Column(name="org_phone_no")
    private long orgPhoneNo;
	@Column(name="org_password")
    private String orgPassword;
	@Column(name="admin_key")
    private int adminKey;
	@Column(name="org_reg_number")
    private int orgRegNumber;
	@Column(name="org_postal_code")
    private int orgPostalCode;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgAddress() {
		return orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	public String getOrgCity() {
		return orgCity;
	}
	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}
	public String getOrgProvince() {
		return orgProvince;
	}
	public void setOrgProvince(String orgProvince) {
		this.orgProvince = orgProvince;
	}
	public String getOrgEmail() {
		return orgEmail;
	}
	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}
	public long getOrgPhoneNo() {
		return orgPhoneNo;
	}
	public void setOrgPhoneNo(long orgPhoneNo) {
		this.orgPhoneNo = orgPhoneNo;
	}
	public String getOrgPassword() {
		return orgPassword;
	}
	public void setOrgPassword(String orgPassword) {
		this.orgPassword = orgPassword;
	}
	public int getAdminKey() {
		return adminKey;
	}
	public void setAdminKey(int adminKey) {
		this.adminKey = adminKey;
	}
	public int getOrgRegNumber() {
		return orgRegNumber;
	}
	public void setOrgRegNumber(int orgRegNumber) {
		this.orgRegNumber = orgRegNumber;
	}
	public int getOrgPostalCode() {
		return orgPostalCode;
	}
	public void setOrgPostalCode(int orgPostalCode) {
		this.orgPostalCode = orgPostalCode;
	}
	
	
}
