package recupera.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsultaPage {

    @FindBy(xpath = "//td[text()='Operação']")
    public static WebElement menuOperacao;

    @FindBy(id = "txtCodigo")
    public static WebElement campoCliente;

    @FindBy(id = "cmdConsultar")
    public static WebElement lupaCliente;

    @FindBy(name = "name=\"txtCpfCnpj\"")
    public static WebElement campoCPF;

    @FindBy(id = "tbcDivida")
    public static WebElement divida;

    @FindBy(id = "objLista005Corpo_00000_00001")
    public static WebElement validarProduto;

    @FindBy(id = "cmdSair")
    public static WebElement btnSair;

}
