package recupera.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import recupera.TestBase;
import recupera.tasks.AcordoTasks;
import recupera.tasks.ConsultaTasks;
import recupera.tasks.HomeTasks;

public class AcordoStep extends TestBase {

    AcordoTasks acordoTasks = new AcordoTasks(getDriver());
    ConsultaTasks consultaTasks = new ConsultaTasks(getDriver());
    HomeTasks homeTasks = new HomeTasks(getDriver());

    public AcordoStep() {
    }

    @Dado("que estou na pagina inicial do recupera")
    public void queEstouNaPaginaInicialDoRecupera() {
        trocarParaNovaJanela();
        homeTasks.aguardarCampoUser();
        homeTasks.loginSucesso();
    }

    @Quando("Clico no menu operacao")
    public void ClicoNoMenuOperacao() {
        consultaTasks.aguardarMenuOperacao();
        consultaTasks.menuOperacao();
    }

    @E("faço um acordo")
    public void facoUmAcordo() throws InterruptedException {
        selectIfrmAppPrinc();

        consultaTasks.codCliente();
        consultaTasks.bntConsult();
        consultaTasks.abaDivida();
        acordoTasks.desmDivida();
        acordoTasks.campoPagt();
//        acordoTasks.selectDiaHoje();
        acordoTasks.selectDiaAmanha();
        consultaTasks.validProduto();
        acordoTasks.marcTodasDividas();
        acordoTasks.bntParc();

//        consultaTasks.marcDivida();

        selectcCframe1();

        acordoTasks.aguardarBotaoConfirmar();

        acordoTasks.aumentParc();
        acordoTasks.bntCalc();
        acordoTasks.validarParcela();

        acordoTasks.bntConf();

        selectcCframe3();

        acordoTasks.insertOcorrencia();
        acordoTasks.bntConfOcorre();

        Thread.sleep(5000);

        defaultContent();
        selectIfrmAppPrinc();
    }

    @Entao("acordo criado com sucesso")
    public void acordoCriadoComSucesso() {
        acordoTasks.validParc();

        // Sair da tela Ocorrencia
        consultaTasks.aguardarBotaoSair();
        consultaTasks.botaoSair();
        defaultContent();

        homeTasks.aguardarBotaoSair();
        homeTasks.clicarSair();
    }

}
