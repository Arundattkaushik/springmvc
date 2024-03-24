package com.spring.mvc.models;

public class Login {
		private String userEmail;
		private String userPassword;
		
		
		
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(String userEmail, String userPassword) {
			super();
			this.userEmail = userEmail;
			this.userPassword = userPassword;
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
}
