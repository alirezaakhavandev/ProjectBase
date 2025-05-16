package com.application;

public class Sensitive {
    static protected String getUsername() {
        return "ethan";
    }
    static protected String getPassword() {
        return "980063653";
    }
    static protected String DatabaseName(){
        return "Company";
    }
    static String theConnectionUrl = "jdbc:postgresql://localhost:5432/";
    static String url = theConnectionUrl.concat(DatabaseName());


}
