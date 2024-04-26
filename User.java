public class User {
    public String email;
    public String password;
    public String fullName;
    public double balance;

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

    public void setEmail(String e) {

    }

    public void setPassword(String p) {

    }

    public void setFullName(String f) {

    }

    public void setBalance(double b) {

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }
}
