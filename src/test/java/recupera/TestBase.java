package recupera;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;

    public static WebDriver startDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        return driver;
    }

    public static WebDriver getDriver(){
        if (driver == null){
            driver = startDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    protected void trocarParaNovaJanela() {
        String janelaOriginal = driver.getWindowHandle();
        for (String janela : driver.getWindowHandles()) {
            if (!janela.equals(janelaOriginal)) {
                driver.switchTo().window(janela);
                break;
            }
        }
    }

    protected void selectIframeOcorrencia(){
        try {
            WebElement iframe = driver.findElement(By.id("ifrmAppPrinc"));
            driver.switchTo().frame(iframe);
            driver.manage().window().fullscreen();
        } catch (Exception e) {
            System.out.println("Erro ao tentar trocar para o iframe de ocorrência: " + e.getMessage());
        }
    }

    protected void selectcIframeParcelamento(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement iframe1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cframe1")));
            driver.switchTo().frame(iframe1);
            System.out.println("Iframe 'cframe1' selecionado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao tentar trocar para o iframe 'cframe1': " + e.getMessage());
        }
    }

    protected void selectcIframeOcorrencia(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement iframe2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cframe3")));
            driver.switchTo().frame(iframe2);
            System.out.println("Iframe 'cframe2' selecionado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao tentar trocar para o iframe 'cframe1': " + e.getMessage());
        }
    }

    protected void defaultContent(){
        driver.switchTo().defaultContent();
    }
}
