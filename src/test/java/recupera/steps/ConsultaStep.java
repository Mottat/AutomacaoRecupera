package recupera.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import recupera.TestBase;
import recupera.tasks.ConsultaTasks;
import recupera.tasks.HomeTasks;

public class ConsultaStep extends TestBase {

    ConsultaTasks consultaTasks = new ConsultaTasks(getDriver());
    HomeTasks homeTasks = new HomeTasks(getDriver());

    public ConsultaStep() {
    }

    @Dado("que estou na pagina do recupera")
    public void queEstouNaPaginaDoRecupera() {
        trocarParaNovaJanela();
        homeTasks.aguardarCampoUser();
        homeTasks.loginSucesso();
    }

    @Quando("Clico em operacao")
    public void clicoEmOperacao() {
        consultaTasks.aguardarMenuOperacao();
        consultaTasks.menuOperacao();
    }

    @E("pesquiso pelo cliente")
    public void pesquisoPeloCliente() {
        selectIfrmAppPrinc();

        consultaTasks.codCliente();
        consultaTasks.bntConsult();
        consultaTasks.abaDivida();
        consultaTasks.validProduto();

        consultaTasks.aguardarBotaoSair();
        consultaTasks.botaoSair();
        defaultContent();

    }
    @Entao("consulta realizada com sucesso")
    public void consultaRealizadaComSucesso() {
        homeTasks.aguardarBotaoSair();
        homeTasks.clicarSair();
    }


}
