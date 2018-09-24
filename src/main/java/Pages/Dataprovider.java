package Pages;


import org.testng.annotations.DataProvider;

public class Dataprovider {


    @DataProvider(name = "create")
    public static Object [][] testData(){
        return new Object [][] {
                new Object [] {"121" }
        };
    }



}