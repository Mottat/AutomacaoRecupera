package recupera.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcordoPage {

    @FindBy(id = "cmdDesmarcarDividas")
    public static WebElement desmarcarDivida;

    @FindBy(id = "objLista005Header_00006")
    public static WebElement campoPagamento;

    @FindBy(className = "CldObjDiaHoje")
    public static WebElement selecionarDiaHoje;

    @FindBy(xpath = "//*[@class='CldObjDiaHoje']/following::input[@class='CldObjDiasSemana'][1]")
    public static WebElement selecionarDiaAmanha;

    @FindBy(id = "objLista005Corpo_00000_00000")
    public static WebElement marcarDivida;

    @FindBy(id = "cmdMarcarDividas")
    public static WebElement marcarTodasDividas;

    @FindBy(id = "cmdParcelar")
    public static WebElement botaoParcelamento;

    @FindBy(id = "cmdAumentaParc")
    public static WebElement aumentarParcelamento;

    @FindBy(id = "cmdCalcular")
    public static WebElement calcular;

    @FindBy(id = "dtgParce_TextBox25_0")
    public static WebElement validarParcela;

    @FindBy(id = "cmdConfirmar")
    public static WebElement botaoConfirmar;

    @FindBy(id = "txtComplementoOcorrencia")
    public static WebElement inserirOcorrencia;

    @FindBy(id = "cmdOkComplOcorrencia")
    public static WebElement botaoConfirmarOcorrencia;

    @FindBy(id = "objLista005Corpo_00000_00001")
    public static WebElement validarParc;


}
