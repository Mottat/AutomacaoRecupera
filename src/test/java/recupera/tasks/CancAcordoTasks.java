package recupera.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import recupera.pages.CancAcordoPage;

import java.time.Duration;

public class CancAcordoTasks extends CancAcordoPage {
    private final WebDriver driver;

    public CancAcordoTasks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void marcAcordo(){
        marcarAcordo.click();
    }

    public void botaoExcluir(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(bntExcluir));
        bntExcluir.click();
    }

}
