package com.dcs.entity;
//
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.Table;
//
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="user")
//@Table
//public class User {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer userId;
//	private String userName;
//	private String userPassword;
//	//Admin, Developers
//	private String userRole;
//	public User(Integer userId, String userName, String userPassword, String userRole) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.userPassword = userPassword;
//		this.userRole = userRole;
//	}
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Integer getUserId() {
//		return userId;
//	}
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getUserPassword() {
//		return userPassword;
//	}
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}
//	public String getUserRole() {
//		return userRole;
//	}
//	public void setUserRole(String userRole) {
//		this.userRole = userRole;
//	}
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userRole="
//				+ userRole + "]";
//	}
//	
//	
//}



//package com.devcommunity.entity;
 
import java.time.LocalDate;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.JOINED)  
 
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
 
    private Integer userId;
    private String userName;
    private String userPassword;
  
    private String userRole;
}
