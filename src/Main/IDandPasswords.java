package Main;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    public IDandPasswords() {

        logininfo.put("MG22", "abc");
        logininfo.put("Mohammed", "PASSWORD");

    }

    public HashMap getLoginInfo() {
        return logininfo;
    }
}
