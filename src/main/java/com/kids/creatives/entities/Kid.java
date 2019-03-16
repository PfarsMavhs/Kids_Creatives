package com.kids.creatives.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kids")
public class Kid {
	 	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		@Column(name="teachers_id")
	    private long teachersId;
		@Column(name="kid_name")
	    private String name;
		@Column(name="kid_surname")
	    private String surname;
		@Column(name="kid_address")
	    private String address;
		@Column(name="kid_id_number")
	    private Long idNumber;
		@Column(name="kid_parent_id")
	    private Long parentid;
		@Column(name="kid_gender")
	    private String gender;
		@Column(name="kid_org_name")
	    private String orgName;
		@Column(name="kid_grade")
	    private String kidsGrade;
		@Column(name="kid_registered")
	    private String kidsRegistered;
		@Column(name="kid_profile_pic")
	    private String profilePic;

	    //additional information
		@Column(name="allergies")
	    private String allergies;
	    @Column(name="diet_requirements")
		private String dietRequirements;
	    @Column(name="doctors_recomendations")
	    private String doctorsRecomendations;
	    @Column(name="kid_height")
	    private int kidHeight;
	    @Column(name="kid_weight")
	    private int bodyWeight;
	
	    
	  	public int getId() {
			return id;
		}

	    public void setId(int id) {
			this.id = id;
		}
		public long getTeachersId() {
			return teachersId;
		}
		public void setTeachersId(long teachersId) {
			this.teachersId = teachersId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getIdNumber() {
			return idNumber;
		}
		public void setIdNumber(long idNumber) {
			this.idNumber = idNumber;
		}
		public long getParentid() {
			return parentid;
		}
		public void setParentid(long parentid) {
			this.parentid = parentid;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getOrgName() {
			return orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public String getKidsGrade() {
			return kidsGrade;
		}
		public void setKidsGrade(String kidsGrade) {
			this.kidsGrade = kidsGrade;
		}
		public String getKidsRegistered() {
			return kidsRegistered;
		}
		public void setKidsRegistered(String kidsRegistered) {
			this.kidsRegistered = kidsRegistered;
		}
		public String getProfilePic() {
			return profilePic;
		}
		public void setProfilePic(String profilePic) {
			this.profilePic = profilePic;
		}
		public String getAllergies() {
			return allergies;
		}
		public void setAllergies(String allergies) {
			this.allergies = allergies;
		}
		public String getDietRequirements() {
			return dietRequirements;
		}
		public void setDietRequirements(String dietRequirements) {
			this.dietRequirements = dietRequirements;
		}
		public String getDoctorsRecomendations() {
			return doctorsRecomendations;
		}
		public void setDoctorsRecomendations(String doctorsRecomendations) {
			this.doctorsRecomendations = doctorsRecomendations;
		}
		public int getKidHeight() {
			return kidHeight;
		}
		public void setKidHeight(int kidHeight) {
			this.kidHeight = kidHeight;
		}
		public int getBodyWeight() {
			return bodyWeight;
		}
		public void setBodyWeight(int bodyWeight) {
			this.bodyWeight = bodyWeight;
		}
	    
	    
}
