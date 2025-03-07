package recupera.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "txtOperador")
    public static WebElement user;

    @FindBy(id = "txtSenha")
    public static WebElement password;

    @FindBy(id = "cmdEmpresa")
    public static WebElement empresaDropdown;

    @FindBy(id = "dtgEmpresa_TextBox1_0")
    public static WebElement empresaOption;

    @FindBy(id = "cmdOk")
    public static WebElement loginButton;

    @FindBy(xpath = "//td[text()='Sair']")
    public static WebElement sair;
}
