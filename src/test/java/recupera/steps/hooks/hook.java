package recupera.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static recupera.TestBase.getDriver;
import static recupera.TestBase.quitDriver;

public class hook {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = getDriver();
        driver.get("http://recuperahml.lojasrenner.com.br/recupera/");
    }

    @After
    public void finish(){
        quitDriver();
    }

}
