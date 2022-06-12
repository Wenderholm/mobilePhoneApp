package com.pwenderholm;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {
    public ArrayList<String> allApp = new ArrayList<String>();
    public final Double memoryCapacity;
    public final Double screenSize;
    public static final String DEFAULT_APP_VERSION = "LATEST";
    public static final String DEFAULT_APP_ADDRESS = "server.me.com";
    public static final Double DEFAULT_APP_SIZE = 0.5;
    public double allAppSize = 0.0;
    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize, Double memoryCapacity) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public void turnOn() {
        System.out.println("you pushed the button");
        System.out.println("black screen");
        System.out.println("beeep");
        System.out.println("helou");
        System.out.println("producer logo");
    }

    // dodawanie listy aplikacji
    public boolean installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            installAnApp(appName);
        }
        return true;
    }

    public boolean installAnApp(String appName) {
                return installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public boolean installAnApp(String appName, String version) {
        return installAnApp(appName, version, DEFAULT_APP_ADDRESS);
    }

    public boolean installAnApp(String appName, String version, String server){
        return installAnApp(appName,version,server,DEFAULT_APP_SIZE);
    }
    public boolean installAnApp(String appName, String version, String server, Double appSize ) {

        if((this.allAppSize + appSize) < this.memoryCapacity){
            this.allAppSize += appSize;
            System.out.println("Zainstalowano " + appName + " w wersji " + version + " z serwera " + server);
            allApp.add(appName);
            return true;

        }else{
            System.out.println("You dont have not enough memory in your phone");
            return false;

        }
        //weryfikacja wieku użytkownika
        //sprawdzenie czy mamy dość miejsca na telefonie

        //sprawdzenie czy płatne
        //przekierowanie do płatności
        //wykonanie płatności
        //weryfikacja płatności
        //pobranie aplikacji
        //skanowanie aplikacji/sprawdzenie sumy kontrolnej
        //rozpakowanie pliku z aplikacją
        //instalacja
    }

    public void showAllApp(){
        System.out.println("you have " + allApp.size() + " apps on your phone");
        for (int i = 0; i < allApp.size(); i++) {
            System.out.println((i+1) + ". " + allApp.get(i));
        }
    }


}
