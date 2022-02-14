package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickOnKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickOnKeyPresses();
        keyPage.enterPi();
    }
}
