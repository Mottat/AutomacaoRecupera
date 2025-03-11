package recupera.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import recupera.pages.AcordoPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class AcordoTasks extends AcordoPage {
    private final WebDriver driver;

    public AcordoTasks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void desmDivida(){
        desmarcarDivida.click();
    }

    public void campoPagt(){
        campoPagamento.click();
    }

    public void selectDiaHoje(){
        selecionarDiaHoje.click();
    }

    public void selectDiaAmanha(){
        selecionarDiaAmanha.click();
    }

    public void marcDivida(){
        marcarDivida.click();
    }

    public void marcTodasDividas(){
        marcarTodasDividas.click();
    }


    public void bntParc(){
        botaoParcelamento.click();
    }

    public void aumentParc(){
        aumentarParcelamento.click();
    }

    public void bntCalc(){
        calcular.click();
    }

    public void validarParcela(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement campo = wait.until(ExpectedConditions.visibilityOf(validarParcela));
        String valorCampo = campo.getAttribute("value");
        assertEquals("000", valorCampo);
    }

    public void bntConf(){
        botaoConfirmar.click();
    }

    public void insertOcorrencia(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement campo = wait.until(ExpectedConditions.visibilityOf(inserirOcorrencia));
        inserirOcorrencia.sendKeys("Teste Automação");
    }

    public void bntConfOcorre(){
        botaoConfirmarOcorrencia.click();
    }

    public void validParc(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement campo = wait.until(ExpectedConditions.visibilityOf(validarParc));
        String valorCampo = campo.getAttribute("value");
        assertEquals("PARC", valorCampo);
    }


    public void aguardarBotaoConfirmar() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(botaoConfirmar));
    }
}
