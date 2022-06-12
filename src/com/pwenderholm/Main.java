package com.pwenderholm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Phone nokia = new Phone(2010,"Nokia","3510", 5.0,150.0);

        nokia.installAnApp("messenger","1.0.0","google.app", 50.0);
        nokia.installAnApp("Apach","1.0.1","google.app", 20.0);
        nokia.installAnApp("Netflix","1.0.1","google.app", 10.0);
//        nokia.installAnApp("youtube","1.2.0","google.app", 110.0);


//        instalowanie aplikacji

        List<String> appNames = new ArrayList<>();
        appNames.add("messenger");
        appNames.add("facebook");
        appNames.add("cyberbug 2077");

        nokia.installAnApp(appNames);
        nokia.showAllApp();
    }
}
