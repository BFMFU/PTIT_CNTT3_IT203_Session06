public class PTIT_CNTT3_IT203_Session06_Ex06 {
	static class User {
		private int id;
		private String username;
		private String password;
		private String email;

		public User(int id, String username, String password, String email) {
			this.id = id;
			this.username = username;
			setPassword(password);
			setEmail(email);
		}

		public int getId() {
			return id;
		}

		public String getUsername() {
			return username;
		}

		public String getEmail() {
			return email;
		}

		public void setPassword(String password) {
			if (password != null && !password.trim().isEmpty()) {
				this.password = password;
			} else {
				System.out.println("Password is invalid");
			}
		}

		public void setEmail(String email) {
			if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
				this.email = email;
			} else {
				System.out.println("Email is invalid");
			}
		}

		public void displayInfo() {
			System.out.println("ID: " + id);
			System.out.println("Username: " + username);
			System.out.println("Email: " + email);
			System.out.println("Password: ******");
			System.out.println("--------------------");
		}
	}

	public static void main(String[] args) {

		User u1 = new User(1, "admin", "123456", "admin@gmail.com");
		User u2 = new User(2, "user01", "", "invalid-email");

		u1.displayInfo();
		u2.displayInfo();

		u2.setPassword("newpass");
		u2.setEmail("user01@mail.com");

		u2.displayInfo();
	}
}
