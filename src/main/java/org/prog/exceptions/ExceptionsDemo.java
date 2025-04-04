package org.prog.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsDemo {

    public static void main(String[] args) throws MalformedURLException {
        smth1("this is bad url");
        System.out.println("================================");
        smth1(null);
        System.out.println("================================");
        smth1("https://www.google.com/");
        System.out.println("================================");
        System.out.println("this will now run");
    }

    public static void smth1(String s) throws MalformedURLException {
        try {
            smth2(s);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void smth2(String s) throws MalformedURLException {
        try {
            smth3(s);
        } catch (MalformedURLException me) {
            System.out.println("Malformed URL: " + s);
        } catch (MyEx me) {
        } finally {

        }
    }

    public static void smth3(String s) throws MalformedURLException, MyEx {
        if (s == null) {
            throw new MyEx();
        }
        System.out.println(s.equals("https://www.google.com/"));
        smth4(s);
    }

    public static void smth4(String s) throws MalformedURLException {
        try {
            URL url = new URL(s);
            System.out.println("Will not print on error");
        } finally {
            System.out.println("Will always print if got to smth4");
        }
    }
}
