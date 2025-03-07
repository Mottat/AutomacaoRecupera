package recupera.steps;

import io.cucumber.java.pt.E;
import recupera.TestBase;
import recupera.tasks.HomeTasks;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class HomeStep extends TestBase {

    HomeTasks homeTasks = new HomeTasks(getDriver());

    public HomeStep() {
    }

    @Dado("que estou na pagina de login")
    public void queEstouNaPaginaDeLogin() {
        trocarParaNovaJanela();
        homeTasks.aguardarCampoUser();
    }

    @Quando("informo dados validos")
    public void informoDadosValidos() {
        homeTasks.informarUser();
        homeTasks.informarpassword();
        homeTasks.clicarEmpresa();
    }

    @E("clico em logar")
    public void clicoEmLogar() {
        homeTasks.clicarLogar();
    }

    @Entao("realizo login com sucesso")
    public void realizoLoginComSucesso() {
        homeTasks.aguardarBotaoSair();
        homeTasks.clicarSair();
    }

    private void trocarParaNovaJanela() {
        String janelaOriginal = driver.getWindowHandle();
        for (String janela : driver.getWindowHandles()) {
            if (!janela.equals(janelaOriginal)) {
                driver.switchTo().window(janela);
                break;
            }
        }
    }
}
