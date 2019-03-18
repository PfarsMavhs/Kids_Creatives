package com.kids.creatives.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int adminUid;
	@Column(name="admin_name")
    private String adminName;
	@Column(name="admin_surname")
    private String adminSurname;
	@Column(name="admin_id_no")
    private long admin_id_No;
	@Column(name="admin_gender")
    private String adminGender;
	@Column(name="admin_contact")
    private long adminContact;
	@Column(name="admin_role")
    private String adminRole;
	@Column(name="admin_email")
    private String email;
	@Column(name="admin_org_name")
    private String orgName;
	@Column(name="admin_city")
    private String userCity;
	@Column(name="admin_org_id")
    private int userOrgId;
	

	public int getAdminUid() {
		return adminUid;
	}
	public void setAdminUid(int adminUid) {
		this.adminUid = adminUid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminSurname() {
		return adminSurname;
	}
	public void setAdminSurname(String adminSurname) {
		this.adminSurname = adminSurname;
	}
	public long getAdminIdNo() {
		return admin_id_No;
	}
	public void setAdminIdNo(long adminIdNo) {
		this.admin_id_No = adminIdNo;
	}
	public String getAdminGender() {
		return adminGender;
	}
	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}
	public long getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(long adminContact) {
		this.adminContact = adminContact;
	}
	public String getAdminRole() {
		return adminRole;
	}
	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public int getUserOrgId() {
		return userOrgId;
	}
	public void setUserOrgId(int userOrgId) {
		this.userOrgId = userOrgId;
	}
	@Override
	public String toString() {
		return "Admin [adminUid=" + adminUid + ", adminName=" + adminName + ", adminSurname=" + adminSurname
				+ ", admin_id_No=" + admin_id_No + ", adminGender=" + adminGender + ", adminContact=" + adminContact
				+ ", adminRole=" + adminRole + ", email=" + email + ", orgName=" + orgName + ", userCity=" + userCity
				+ ", userOrgId=" + userOrgId + "]";
	}
	
	

    
}
