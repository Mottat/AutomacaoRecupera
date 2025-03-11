package recupera.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import recupera.TestBase;
import recupera.tasks.AcordoTasks;
import recupera.tasks.CancAcordoTasks;
import recupera.tasks.ConsultaTasks;
import recupera.tasks.HomeTasks;

import java.time.Duration;

public class CancAcordoStep extends TestBase {

    CancAcordoTasks cancAcordoTasks = new CancAcordoTasks(getDriver());

    AcordoTasks acordoTasks = new AcordoTasks(getDriver());
    ConsultaTasks consultaTasks = new ConsultaTasks(getDriver());
    HomeTasks homeTasks = new HomeTasks(getDriver());

    public CancAcordoStep() {
    }

    @Dado("que estou no recupera")
    public void queEstouNoRecupera() {
        trocarParaNovaJanela();
        homeTasks.aguardarCampoUser();
        homeTasks.loginSucesso();
    }

    @Quando("pesquiso cliente com acordo")
    public void pesquisoClienteComAcordo() {
        consultaTasks.aguardarMenuOperacao();
        consultaTasks.menuOperacao();

        selectIframeOcorrencia();

        consultaTasks.codCliente();
        consultaTasks.bntConsult();
        consultaTasks.abaDivida();
    }

    @E("cancelo acordo")
    public void canceloAcordo() {
        cancAcordoTasks.marcAcordo();
        acordoTasks.bntParc();

        selectcIframeParcelamento();

        cancAcordoTasks.botaoExcluir();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
        alerta.accept();
    }

    @Entao("acordo cancelado com sucesso")
    public void acordoCanceladoComSucesso() throws InterruptedException {
        Thread.sleep(5000);

        defaultContent();
        selectIframeOcorrencia();

        consultaTasks.validProduto();

        // Sair da tela Ocorrencia
        consultaTasks.aguardarBotaoSair();
        consultaTasks.botaoSair();
        defaultContent();

        homeTasks.aguardarBotaoSair();
        homeTasks.clicarSair();

    }

}
