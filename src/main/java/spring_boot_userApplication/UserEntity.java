package spring_boot_userApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//POJO CLASS
@Entity
@Table(name="Usertable")
public class UserEntity {

	@Id
	private int userId;
	
	private String userName;
	private String UserDescription;
	private String userEmail;
	
	
//	public UserEntity(int userId, String userName, String userDescription, String userEmail) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		UserDescription = userDescription;
//		this.userEmail = userEmail;
//	}
	 public UserEntity() {
		 
	 }


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


	public String getUserDescription() {
		return UserDescription;
	}


	public void setUserDescription(String userDescription) {
		UserDescription = userDescription;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	
	
	
	
	
	
	
}
