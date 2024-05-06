package com.cicd.nick;

public class StringFormatter {

    public String toNameFormat(String input){
        return input = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }

}
