package org.training;


import org.junit.Assert;
import org.junit.Test;

public class ITest

{
    @Test
    public void testApp(){
        Assert.assertEquals(App.getValue(),3);
    }

}
