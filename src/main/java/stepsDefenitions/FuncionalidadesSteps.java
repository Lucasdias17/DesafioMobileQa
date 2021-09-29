package stepsDefenitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.FuncionalidadesPage;
import pageObjects.LoginPage;

public class FuncionalidadesSteps {
	
	FuncionalidadesPage f = new FuncionalidadesPage(driver);
	
	@Quando("acionar o bota nova lista")
	public void acionarOBotaNovaLista() {
		f.AcionarBotaoNovaLista();
	}

	@Quando("preecher nome a nova lista {string}")
	public void preecherNomeANovaLista(String nomeLista) {
		f.preencherCampoNomeLista(nomeLista);
	}

	@Quando("acionar o botao criar lista")
	public void acionarOBotaoCriarLista() {
		f.acionarBotaoAddNovaLista();
	}

	@Quando("acionar o botao add tarefa")
	public void acionarOBotaoAddTarefa() {
		f.acionarBotaoNovaTarefa();
	}

	@Quando("preencher nome da nova tarefa {string}") 
	public void preencherNomeDaNovaTarefa(String nomeTarefa) {
		f.preencherCampoNomeTerefa(nomeTarefa);
	}

	@Quando("acionar o botao adicionar tarefa")
	public void acionarOBotaoAdicionarTarefa() {
		f.acionarBotaoAddNovaTarefa();
	}

//	@Entao("Sera criado uma tarefa")
//	public void seraCriadoUmaTarefa() {
//	
//	}

	@Quando("selecionar a tarefa que desejo atualizar")
	public void selecionarATarefaQueDesejoAtualizar() {
		f.acionarBotaoSelecaoTarefa();
	}

	@Quando("acionar a opcao meu dia a tarefa")
	public void acionarAOpcaoMeuDiaATarefa() {
		f.botaoAttTarefa();
	}
	@Quando("acionar o botao de volta")
	public void acionarOBotaoDeVolta() {
		f.acionarBotaoVoltaTarefa();
	}

//	@Entao("a tarefa sera atualizada")
//	public void aTarefaSeraAtualizada() {
//	
//	}

	@Quando("acionar o botao de conclusao da tarefa")
	public void acionarOBotaoDeConclusaoDaTarefa() {
		f.acionarBotaoConcluirTarefa();
	}

//	@Entao("tarefa sera concluida")
//	public void tarefaSeraConcluida() {
//	
//	}

	@Quando("selecionar a tarefa concluida")
	public void selecionarATarefaConcluida() {
		f.selecionaTarefaConcluida();
	}

	@Quando("acionar o botao de delete")
	public void acionarOBotaoDeDelete() {
		f.acionarBotaoDeleta();
	}

	@Quando("acionar o botao de confirmacao")
	public void acionarOBotaoDeConfirmacao() {
		f.acionarBotaConfirDeleta();
	}

	@Entao("sera efetuado todas as funcionalidade do App Microsoft To Do")
	public void seraEfetuadoTodasAsFuncionalidadeDoAppMicrosoftToDo() {

	}

}
