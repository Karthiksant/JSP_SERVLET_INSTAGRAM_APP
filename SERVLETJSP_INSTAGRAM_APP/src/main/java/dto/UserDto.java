package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDto {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userId;
		private String userName;
		private String userEmail;
		private Long userPhoneNumber;
		private String userPassword;
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
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public Long getUserPhoneNumber() {
			return userPhoneNumber;
		}
		public void setUserPhoneNumber(Long userPhoneNumber) {
			this.userPhoneNumber = userPhoneNumber;
		}		
}
