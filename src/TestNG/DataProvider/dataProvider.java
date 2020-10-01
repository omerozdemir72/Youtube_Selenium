package TestNG.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @DataProvider
    public Object[][] dataProviderMethod(){

        Object [] [] a = new Object[2][1];

        a[0][0] = "data 1";

        a[1][0]="data 2";

        return a;
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testMethod1(String data){
        System.out.println("Data :   " +  data);
    }

}
