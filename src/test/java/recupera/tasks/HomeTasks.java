package recupera.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import recupera.pages.HomePage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

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

    public void loginSucesso() {
        user.click();
        user.sendKeys("AUTOM1");

        password.click();
        password.sendKeys("renner100");

        empresaDropdown.click();
        empresaOption.click();

        loginButton.click();

//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//            Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
//
//            if (alerta != null) {
//                String mensagem = alerta.getText();
//                System.out.println("Mensagem do alerta: " + mensagem);
//
//                assertEquals("LIC_RL006: O Operador já esta conectado no sistema.", mensagem);
//
//                alerta.accept();
//
//                user.clear();
//                user.sendKeys("AUTOM2");
//                password.clear();
//                password.sendKeys("renner100");
//                empresaDropdown.click();
//                empresaOption.click();
//                loginButton.click();
//
//            }
//        } catch (Exception e) {
//            System.out.println("Nenhum alerta foi exibido.");
//        }

    }

    public void aguardarBotaoSair() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(sair));
    }

    public void clicarSair() {
        sair.click();
    }


}