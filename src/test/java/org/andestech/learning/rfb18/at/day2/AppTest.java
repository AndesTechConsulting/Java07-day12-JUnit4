package org.andestech.learning.rfb18.at.day2;

import org.andestech.learning.rfb18.at.Customer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    @Category({IMarker2.class})
    public void customerTest() {
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

        Customer c = new Customer("Peter ", "  Diplomat");
        assertTrue("PDIPLOMAT".equals(c.getLogin()));
    }

    @Test
    public void Test11()
    {
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }


}
