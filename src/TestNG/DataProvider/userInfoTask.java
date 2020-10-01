package TestNG.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class userInfoTask {

    @DataProvider
    public Object[][] getData(){

        Object[][] data= new Object[3][2];
        //user 1
        data[0][0] ="user1";
        data[0][1] ="password1";

        //user2

        data[1][0]="user2";
        data[1][1]="password2";
        //user3

        data[2][0]="user3";
        data[2][1]="password3";

        return data;
    }

    @Test(dataProvider = "getData")
public void setData(String username,String password){

        System.out.println("Username :  " + username);
        System.out.println("Password  :  "+ password);
    }


}
