package org.example;

import org.testng.annotations.Test;
import org.example.HomePage;

import static org.testng.AssertJUnit.assertTrue;

@Test
public class Test1 extends TestBase{
    public void test1(){
        HomePage hp = new HomePage();
        getDriver().get("http://watir.com/examples/shadow_dom.html");

        assertTrue("some text".equals(hp.getShadowDomText()));
        assertTrue("nested text".equals(hp.getNestedShadowText()));
        assertTrue("nested text".equals(hp.getNestedText()));
        assertTrue("nested text".equals(hp.getNestedTextUsingJSExecutor()));


        assertTrue(getDriver().getTitle().equals("Shadow DOM"));
    }
}
