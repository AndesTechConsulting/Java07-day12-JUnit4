package org.andestech.learning.rfb18.at.day2;

import javafx.scene.image.ImageViewBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BTest {


    @Test
    public void TestB44()
    {
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }

    @Category({IMarker1.class, IMarker2.class})
    @Test
    public void TestB55()
    {
        Assert.assertTrue(1==2+3-4);
        System.out.println( "++ " + Thread.currentThread().getStackTrace()[1].getMethodName() );

    }
}
