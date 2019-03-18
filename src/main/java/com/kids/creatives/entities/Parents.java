package com.kids.creatives.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parents")
public class Parents {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int userId;
	
	@Column(name="parent_name")
    private String userName;
	
	@Column(name="parent_surname")
    private String userSurname;
	
	@Column(name="parent_id_number")
    private long userIdNumber;
	
	@Column(name="parent_address")
    private String userAddress;
	
	@Column(name="parent_province")
    private String userprovince;
	
	@Column(name="parent_city")
    private String userCity;
	
	@Column(name="parent_contact")
    private long userContact;
	
	@Column(name="parent_gender")
    private String userGender;
	
	@Column(name="is_verified")
    private String isVerified;
	
	@Column(name="parent_profile_pic")
    private String userProfilePic;
	
	@Column(name="parent_org_id")
    private int userOrgId;
	
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
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public long getUserIdNumber() {
		return userIdNumber;
	}
	public void setUserIdNumber(long userIdNumber) {
		this.userIdNumber = userIdNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserprovince() {
		return userprovince;
	}
	public void setUserprovince(String userprovince) {
		this.userprovince = userprovince;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	public String getUserProfilePic() {
		return userProfilePic;
	}
	public void setUserProfilePic(String userProfilePic) {
		this.userProfilePic = userProfilePic;
	}
	public int getUserOrgId() {
		return userOrgId;
	}
	public void setUserOrgId(int userOrgId) {
		this.userOrgId = userOrgId;
	}
    
    
	
 
}
