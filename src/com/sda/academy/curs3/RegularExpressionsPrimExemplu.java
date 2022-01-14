package com.sda.academy.curs3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsPrimExemplu {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a+bcd");
        Matcher matcher = pattern.matcher("bcd1");

        if (matcher.matches()) {
            System.out.println("Am facut match");
        } else {
            System.out.println("Nu am facut match");
        }
    }
}
