public class PTIT_CNTT3_IT203_Session06_Ex02 {
    static class Account {

        String username;
        String password;
        String email;


        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }


        public void changePassword(String newPassword) {
            this.password = newPassword;
            System.out.println("Password changed successfully!");
        }

        public void displayInfo() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
            System.out.println("----------------------");
        }
    }
    public static void main(String[] args) {
        Account account1 = new Account(
                "manhduy",
                "123456",
                "manhduy@gmail.com"
        );

        account1.displayInfo();

        account1.changePassword("abcdef");

        account1.displayInfo();
    }

}
