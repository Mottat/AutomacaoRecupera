package recupera.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import recupera.pages.ConsultaPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ConsultaTasks extends ConsultaPage {
    private final WebDriver driver;

    public ConsultaTasks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

    }

    public void aguardarMenuOperacao() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(menuOperacao));
    }

    public void menuOperacao(){
        menuOperacao.click();
    }


    public void codCliente(){
        campoCliente.click();
        campoCliente.sendKeys("05286578365");
    }

    public void bntConsult(){
        lupaCliente.click();
    }

    public void abaDivida(){
        divida.click();
    }


    public void validProduto(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement campo = wait.until(ExpectedConditions.visibilityOf(validarProduto));
        String valorCampo = campo.getAttribute("value");
        assertEquals("CCRCFI", valorCampo);
    }

    public void botaoSair(){
        btnSair.click();
    }


    public void aguardarBotaoSair() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(btnSair));
    }
}
