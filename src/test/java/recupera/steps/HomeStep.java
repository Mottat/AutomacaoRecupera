package recupera.steps;

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

    @Quando("faço login com dados validos")
    public void facologincomdadosvalidos() {
        homeTasks.loginSucesso();
    }

    @Entao("realizo login com sucesso")
    public void realizoLoginComSucesso() {
        homeTasks.aguardarBotaoSair();
        homeTasks.clicarSair();
    }

}
