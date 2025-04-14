package org.prog.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyFirstTest extends ParentTest {

    @Test
    public void test() {
        System.out.println("Testing MyFirst");
    }

    @Test(dataProvider = "getData")
    public void badPasswordTest(String password) {
        System.out.println("go to ukr.net");
        System.out.println("press register btn");
        System.out.println("set password to " + password);
        System.out.println("fill other stuff");
        System.out.println("click register btn");
        System.out.println("We fail!");
        Assert.assertNotEquals(password, "password1", "Bad password!");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"AnH1234"},
                {"my.mail.box@ukr.net"},
                {"password1"},
                {"1234567890"},
                {"NaH 12"}
        };
    }
}

//AnH1234 -> bad password!
//my.mail.box@ukr.net -> bad password!
//password1 -> bad password!
//1234567890 -> bad password!
//NaH 12 -> bad password!
//
//Пароль повинен містити:
//щонайменше 8 символів
//У вашому паролі не повинно бути:
//імені скриньки
//        простих слів, поєднань букв і цифр (наприклад, password, abrakadabra, mamapapa, 55555555 або 10101010, 20222022)
//пробілів та будь-яких послідовностей
