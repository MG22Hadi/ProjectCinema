import GUI.LoginPage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }
}
