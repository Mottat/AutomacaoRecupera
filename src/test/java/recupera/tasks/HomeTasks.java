package recupera.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import recupera.pages.HomePage;

import java.time.Duration;

public class HomeTasks extends HomePage {
    private final WebDriver driver;

    public HomeTasks(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void aguardarCampoUser() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(user));
    }

    public void informarUser() {
        user.click();
        user.sendKeys("AUTOM1");
    }

    public void informarpassword() {
        password.click();
        password.sendKeys("renner100");
    }

    public void clicarEmpresa() {
        empresaDropdown.click();
        empresaOption.click();
    }

    public void clicarLogar() {
        loginButton.click();
    }

    public void aguardarBotaoSair() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(sair));
    }

    public void clicarSair() {
        sair.click();
    }

    public void aguardarElementoVisivel(By by, int segundos) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}