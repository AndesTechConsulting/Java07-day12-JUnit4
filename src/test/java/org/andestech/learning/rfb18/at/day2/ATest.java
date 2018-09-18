package org.andestech.learning.rfb18.at.day2;

import org.junit.Test;

public class ATest {


    @Test
    public void TestA22()
    {
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }

    @Test
    public void TestA33()
    {
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }

}
