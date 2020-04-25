package calculator;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private AndroidDriver driver;
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue() throws MalformedURLException {
//        assertTrue( true );
//
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("deviceName", "Pixel 2 API 27");
//        desiredCapabilities.setCapability("app", "/Users/stevejobs/Downloads/teenatest/CalculatorP.apk");
//        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
//
//        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
//
//        //ok button
//        MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1");
//        el1.click();
//
//
//        //1
//        MobileElement el2 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_17");
//        el2.click();
//
//        //+
//        MobileElement el3 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_20");
//        el3.click();
//
//        //6
//        MobileElement el4 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_15");
//        el4.click();
//
//        //=
//        MobileElement el5 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_24");
//
//        //result
//        MobileElement el6 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/ll_digit_for_inflate");
//        el6.click();
//
//        //result small
//        MobileElement el7 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/id_digit");
//        el7.click();
//
//
//
//        driver.quit();
//    }


    @Given("^user is opened the app$")
    public void user_is_opened_the_app() throws Throwable {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel 2 API 27");
        desiredCapabilities.setCapability("app", "/Users/stevejobs/Downloads/teenatest/CalculatorP.apk");
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @When("^and select ok on intro screen$")
    public void and_select_ok_on_intro_screen() throws Throwable {
        //ok button
        MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1");
        el1.click();
    }

    @When("^tap 1 button$")
    public void tap_1_button() throws Throwable {
        //1
        MobileElement el2 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_17");
        el2.click();
    }

    @When("^tap plus button$")
    public void tap_buttonadd() throws Throwable {
        //+
        MobileElement el3 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_20");
        el3.click();
    }

    @When("^tap 6 button$")
    public void tap_6_button() throws Throwable {
        //6
        MobileElement el4 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_15");
        el4.click();
    }

    @When("^tap = button$")
    public void tap_buttonequal() throws Throwable {
        //=
        MobileElement el5 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/CheckBoxButton_24");
        el5.click();
    }

    @Then("^user should get correct answer$")
    public void user_should_get_correct_answer() throws Throwable {
        //result
        MobileElement el6 = (MobileElement) driver.findElementById("com.blogspot.turbocolor.magma_calc:id/ll_digit_for_inflate");
        System.out.println(el6.getText());
    }
    @Then("^close app$")
    public void close() throws Throwable {
        driver.quit();
    }
}
