public class Main {
    public static void main(String[] args) {
       IDandPasswords iDandPassword = new IDandPasswords();
       new LoginPage(iDandPassword.getLoginInfo());
    }
}