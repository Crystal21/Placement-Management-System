package org.crce.interns.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails", catalog="user_schema")
@SuppressWarnings("serial")
public class UserDetails implements Serializable{
	
	@Id
	@Column(name = "username" )
	String userName;
	
	@Column(name = "user_password" )
	String userPassword;
	
	@Column(name = "account_active" )
	boolean accountActive;
	
	@Column(name = "current_state" )
	boolean currentState;
	
	@Column(name = "last_login" )
	Date lastLogin;
	
	@Column(name = "role_id" )
	int roleId;
	
	@Column(name = "created_by" )
	String createdBy;
	
	@Column(name = "created_date" )
	Date createdDate;
	
	@Column(name = "modified_by" )
	String modifiedBy;
	
	@Column(name = "modified_date" )
	Date modifiedDate;
	
	@ManyToOne
	@JoinTable(name="role_master",
			joinColumns = { @JoinColumn(name = "role_id") }, 
            inverseJoinColumns = { @JoinColumn(name = "role_id") })
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassWord() {
		return userPassword;
	}

	public void setUserPassWord(String userPassword) {
		this.userPassword = userPassword;
	}
	public boolean getAccountActive() {
		return accountActive;
	}

	public void setAccountActive(boolean accountActive) {
		this.accountActive = accountActive;
	}
	public boolean getCurrentState() {
		return currentState;
	}

	public void setCurrentState(boolean currentState) {
		this.currentState = currentState;
	}

}
