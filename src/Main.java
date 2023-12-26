import GUI.CreatAccountPage;
import GUI.LoginPage;
import GUI.MainGUI;
import Main.IDandPasswords;
import Moveis.Move1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IDandPasswords idandPasswords = new IDandPasswords();

//        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
        MainGUI mainGUI=new MainGUI();
        CreatAccountPage cap=new CreatAccountPage();
//        Move1 move1=new Move1();


    }
}
