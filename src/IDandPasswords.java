import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>(); // Hashmap to store key value pairs of userName and password

    IDandPasswords(){
        logininfo.put("aakash2050","zigzag900");// username and password
        logininfo.put("@iamaakash","USA1234");
        logininfo.put("Subin2002","ilovekatrina");
        logininfo.put("Hitler3344","HailHitler985");

    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
