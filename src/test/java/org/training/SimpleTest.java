package org.training;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mykola_Ohoiko on 3/14/2017.
 */
public class SimpleTest {

    @Test
    public void testApp(){
        Assert.assertEquals(App.getValue(),4);
    }
}
