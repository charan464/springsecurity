package com.thecodeveal.app.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Table(name="AUTH_USER_DETAILS")
@Entity
public class User implements UserDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="USER_NAME",unique = true)
	private String username;
	@Column(name="USER_KEY")
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="AUTH_USER_AUTHORITY",joinColumns = @JoinColumn(referencedColumnName = "id"),
	
	inverseJoinColumns = @JoinColumn(referencedColumnName = "id")
			)
	private List<Authority>authorites;
	
	private boolean emailGeneration;
	
	
	private String firstname;
	private String middlename;
	private String lastname;
	private String personalemail;
	private String dateofbirth;
	private String mobilenumber;
	private String alternatemobilenumber;
	
	private String fathername;
	private String mothername;
	private String fathermobilenumber;
	private String mothermobilenumber;
	private String addressone;
	private String addresstwo;
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getAlternatemobilenumber() {
		return alternatemobilenumber;
	}

	public void setAlternatemobilenumber(String alternatemobilenumber) {
		this.alternatemobilenumber = alternatemobilenumber;
	}

	private String pincode;
	
	
	
	
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPersonalemail() {
		return personalemail;
	}

	public void setPersonalemail(String personalemail) {
		this.personalemail = personalemail;
	}

	

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getFathermobilenumber() {
		return fathermobilenumber;
	}

	public void setFathermobilenumber(String fathernamemobilenumber) {
		this.fathermobilenumber = fathernamemobilenumber;
	}

	public String getMothermobilenumber() {
		return mothermobilenumber;
	}

	public void setMothermobilenumber(String mothernamemobilenumber) {
		this.mothermobilenumber = mothernamemobilenumber;
	}

	

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddressone() {
		return addressone;
	}

	public void setAddressone(String addressone) {
		this.addressone = addressone;
	}

	public String getAddresstwo() {
		return addresstwo;
	}

	public void setAddresstwo(String addresstwo) {
		this.addresstwo = addresstwo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	
	
	

	public boolean getEmailGeneration() {
		return emailGeneration;
	}

	public void setEmailGeneration(boolean emailGeneration) {
		this.emailGeneration = emailGeneration;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorites;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Authority> getAuthorites() {
		return authorites;
	}

	public void setAuthorites(List<Authority> authorites) {
		this.authorites = authorites;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
