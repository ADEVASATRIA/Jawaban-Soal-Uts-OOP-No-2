//Adeva Stria Arif Wibawa
//2502012464 - LA20;
package restaurant_uts_no_2;
import java.util.Scanner;
import java.util.*;

public class LOGIN {
    private String Username;
    private String Password;
    
    LOGIN(String Username,String Password){
        this.Username = Username;
        this.Password = Password;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public String getPassword(){
        return Password;
    }
}
