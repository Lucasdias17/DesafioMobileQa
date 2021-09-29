package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static utils.Utils.driver;
import static utils.Utils.*;

public class LoginPage {
	
	public LoginPage (AppiumDriver <?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement campoUsuario;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/sign_in_button")
	private MobileElement botaoEntrarUsuario;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement campoSenha;
	
	@AndroidFindBy(xpath = "//android.widget.Button")
	private MobileElement botaoEntrarSenha;
	
	public void preencherCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}
	
	public void acionarBotaoEntrarUsuario() {
		botaoEntrarUsuario.click();
	}
	
	public void preencherCampoSenha(String senha) {
		campoSenha.sendKeys(senha);

	}
	
	public void acionarBotaoEntrarSenhar() {
		botaoEntrarSenha.click();
	}

}
