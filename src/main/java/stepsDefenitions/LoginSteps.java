package stepsDefenitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static utils.Utils.acessarApp;
import static utils.Utils.driver;

import java.net.MalformedURLException;
import java.util.List;

public class LoginSteps {
	
	LoginPage lp = new LoginPage(driver);
	
	
	
	@Quando("preenche o usuario de acesso {string}")
	public void preencheOUsuarioDeAcesso() throws MalformedURLException {
		//lp.preencherCampoUsuario(usuario);
		acessarApp();

	}

	@Quando("acionar o botao de entrar")
	public void acionarOBotaoDeEntrar() {
		//lp.acionarBotaoEntrarUsuario();

	}

	@Quando("preencher o senha {string}")
	public void preencherOSenha(String senha) {
//		System.out.println("Senha");
//		// lp.preencherCampoSenha(senha);
//		System.out.println("Senh1");
	}

	@Entao("o login ser de sucesso")
	public void oLoginSerDeSucesso() {
	//	lp.acionarBotaoEntrarSenhar();

	}

}
