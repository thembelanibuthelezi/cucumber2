package stepDefinations;

import io.cucumber.java.Before;

public class Hooks {
    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("hiiiiii");

    }
}
