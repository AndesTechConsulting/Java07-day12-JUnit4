package org.andestech.learning.rfb18.at.day2;

import org.andestech.learning.rfb18.at.Customer;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CTest {

    public CTest(String name, String sname, String login) {
        this.name = name;
        this.sname = sname;
        this.login = login;
    }

    private String name, sname, login;

    @Parameterized.Parameters
    public static Collection getParams()
    {
        //.....
        return Arrays.asList(
                new Object[][]{
        {"Gray ","Holmes ", "GHOLMES"},
        {"Tomas ","  Ull ", "TULL"},
        {"Gray ","  HoLMes ", "GHOLMES"} });

    }

    @Test
    public void TestC66()
    {
        String realLogin = new Customer(name,sname).getLogin();
        Assert.assertEquals(login, realLogin);
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }

    //@Ignore
    //@Test
    public void TestC77()
    {
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }
}
