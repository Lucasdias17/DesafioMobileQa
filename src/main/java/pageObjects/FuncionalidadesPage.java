package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FuncionalidadesPage {
	
	public FuncionalidadesPage (AppiumDriver <?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Adicionar 
	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement botaoNovaLista;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement campoNomeLista; 
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoAddNovaLista; 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/new_todo_fab")
	private MobileElement botaoNovaTarefa; 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement campoNomeTarefa;  
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_image_button")
	private MobileElement botaoAddNovaTarefa; 
	
	//Editar//
	
	@AndroidFindBy(id = "com.microsoft.todos:id/task_title")
	private MobileElement botaoSelecaoTarefa; 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/my_day_textview")
	private MobileElement botaoAttTerefa; 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/back")
	private MobileElement botaoVoltaTarefas; 
	
	//Cloncluir
	
	@AndroidFindBy(accessibility = "Tarefa incompleta Desafio, Botão")
	private MobileElement botaConcluirTarefa; 
	
	//Deletar
	
	@AndroidFindBy(id = "com.microsoft.todos:id/task_title")
	private MobileElement selecaoTarefaConcluida; 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/delete")
	private MobileElement botaoDeleta; 
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoConfirDeleta; 

	
	public void  AcionarBotaoNovaLista() {
		botaoNovaLista.click();
	}
	public void  preencherCampoNomeLista(String nomeLista) {
		campoNomeLista.sendKeys(nomeLista);
	}
	public void  acionarBotaoAddNovaLista() {
		botaoAddNovaLista.click();
	}
	public void  acionarBotaoNovaTarefa() {
		botaoNovaTarefa.click();
	}
	public void  preencherCampoNomeTerefa(String nomeTarefa) {
		campoNomeTarefa.sendKeys(nomeTarefa);
	}
	public void  acionarBotaoAddNovaTarefa() {
		botaoAddNovaTarefa.click();
	}
	public void  acionarBotaoSelecaoTarefa() {
		botaoSelecaoTarefa.click();
	}
	public void  botaoAttTarefa() {
		botaoAttTerefa.click();
	}
	public void  acionarBotaoVoltaTarefa() {
		botaoVoltaTarefas.click();
	}
	public void  acionarBotaoConcluirTarefa() {
		botaConcluirTarefa.click();
	}
	public void  selecionaTarefaConcluida() {
		selecaoTarefaConcluida.click();
	}
	public void  acionarBotaoDeleta() {
		botaoDeleta.click();
	}
	public void acionarBotaConfirDeleta() {
		botaoConfirDeleta.click();
	}
	
}
