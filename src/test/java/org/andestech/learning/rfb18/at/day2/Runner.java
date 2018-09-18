package org.andestech.learning.rfb18.at.day2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Runner {

    public static void main(String[] args)
    {

       Result res = JUnitCore.runClasses(TestSuit01.class, AppTest.class);

       for(Failure fail: res.getFailures())
       {
           System.err.print(fail.getTrace() + ", " + fail.getMessage());
       }

       if(res.wasSuccessful()) System.out.println("All is Ok!!!");
       else{
           System.out.println("smth wrong.. see info above..");
       }

    }

}
