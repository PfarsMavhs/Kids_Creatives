package com.kids.creatives.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teachers {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userKey;
	@Column(name="teacher_name")
	private String userName;
	@Column(name="teacher_surname")
    private String userSurname;
	@Column(name="teacher_contact")
    private long userContact;
	@Column(name="teacher_classroom")
    private String teacherClassroom;
	@Column(name="teacher_id_number")
    private long userIdNumber;
	@Column(name="teacher_gender")
    private String userGender;
	@Column(name="teacher_email")
    private String emailUser;
	@Column(name="teacher_password")
    private String passWordUser;
	@Column(name="teacher_role")
    private String role;
	@Column(name="is_verified")
    private String isVerified;
	@Column(name="org_Name")
    private String orgName;
	@Column(name="teacher_address")
	private String userAddress;
	@Column(name="teacher_province")
    private String userProvince;
	@Column(name="teacher_city")
    private String userCity;
	@Column(name="teacher_profile_pic")
    private String userProfilePic;
	@Column(name="teacher_org_id")
    private int userOrgId;
	


	public int getUserKey() {
		return userKey;
	}

	public void setUserKey(int userKey) {
		this.userKey = userKey;
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

	public long getUserContact() {
		return userContact;
	}

	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}

	public String getTeacherClassroom() {
		return teacherClassroom;
	}

	public void setTeacherClassroom(String teacherClassroom) {
		this.teacherClassroom = teacherClassroom;
	}

	public long getUserIdNumber() {
		return userIdNumber;
	}

	public void setUserIdNumber(long userIdNumber) {
		this.userIdNumber = userIdNumber;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPassWordUser() {
		return passWordUser;
	}

	public void setPassWordUser(String passWordUser) {
		this.passWordUser = passWordUser;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
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
