package tests;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	ElementosWeb elementos = new ElementosWeb();
	Metodos metodos = new Metodos();

	@Given("que eu esteja na home do site {string}")
	public void que_eu_esteja_na_home_do_site(String string) {

		metodos.abrirNavegador(string, string);

	}

	@When("clicar em Formulario")
	public void clicar_em_formulario() {

		metodos.clicar(elementos.getFormulario());

	}

	@When("clicar em Criar Usuarios")
	public void clicar_em_criar_usuarios() {
		metodos.clicar(elementos.getCriarUsuario());

	}

	@When("preencher os campos obrigatorios corretamente")
	public void preencher_os_campos_obrigatorios_corretamente() {

		metodos.escrever(elementos.getNome(), "Leandro");
		metodos.escrever(elementos.getSobrenome(), "Bardelino");
		metodos.escrever(elementos.getEmail(), "teste@gmail.com");
		metodos.escrever(elementos.getEndereco(), "Novo Horizonte");
		metodos.escrever(elementos.getUniversidade(), "FIAP");
		metodos.escrever(elementos.getProfissao(), "QA Automation");
		metodos.escrever(elementos.getGenero(), "Masculino");
		metodos.escrever(elementos.getIdade(), "26");
		metodos.clicar(elementos.getCriar());
		metodos.screenShoot("cadastro-valido");

	}

	@Then("Valido login criado com sucesso")
	public void valido_login_criado_com_sucesso() {
		metodos.validarTexto(elementos.getNotice(), "Usuário Criado com sucesso", null);
		metodos.fecharNavegador();

	}

	@When("preencher os campos obrigatorios incorretamente")
	public void preencher_os_campos_obrigatorios_incorretamente() {

		metodos.escrever(elementos.getNome(), "Leandro");
		metodos.escrever(elementos.getSobrenome(), "Bardelino");
		metodos.escrever(elementos.getEmail(), "teste@gmail");
		metodos.escrever(elementos.getEndereco(), "Novo Horizonte");
		metodos.escrever(elementos.getUniversidade(), "FIAP");
		metodos.escrever(elementos.getProfissao(), "QA Automation");
		metodos.escrever(elementos.getGenero(), "Masculino");
		metodos.escrever(elementos.getIdade(), "26");
		metodos.clicar(elementos.getCriar());
		metodos.screenShoot("cadastro-invalido");

	}

	@Then("Valido a falha na criacao de login")
	public void valido_a_falha_na_criacao_de_login() {
		metodos.validarTexto(elementos.getEmailfail(),
				"Email translation missing: pt-BR.activerecord.errors.models.user.attributes.email.invalid", null);
		metodos.fecharNavegador();

	}

	@When("deixo os campos em branco")
	public void deixo_os_campos_em_branco() {

		metodos.escrever(elementos.getNome(), "");
		metodos.escrever(elementos.getSobrenome(), "");
		metodos.escrever(elementos.getEmail(), "");
		metodos.escrever(elementos.getEndereco(), "");
		metodos.escrever(elementos.getUniversidade(), "");
		metodos.escrever(elementos.getProfissao(), "");
		metodos.escrever(elementos.getGenero(), "");
		metodos.escrever(elementos.getIdade(), "");
		metodos.clicar(elementos.getCriar());
		metodos.screenShoot("cadastro-branco");

	}

	@Then("Valido a falha na criacao de login campos em branco")
	public void valido_a_falha_na_criacao_de_login_campos_em_branco() {

		metodos.validarTexto(elementos.getNotice(),
				"Name translation missing: pt-BR.activerecord.errors.models.user.attributes.name.blank", null);
		metodos.fecharNavegador();
	}

	@When("clicar em buscar elementos")
	public void clicar_em_buscar_elementos() {

		metodos.clicar(elementos.getBuscaelementos());
		metodos.clicar(elementos.getLinks());
	}

	@When("interagir com todos os elementos")
	public void interagir_com_todos_os_elementos() {

		metodos.clicar(elementos.getSucess());
		metodos.screenShoot("Link-Sucess");
		metodos.validarTexto(elementos.getSucesso(), "Success!!", null);
		metodos.clicar(elementos.getVoltar());
		metodos.clicar(elementos.getBadrequest());
		metodos.screenShoot("Link-BadRequest");
		metodos.validarTexto(elementos.getBadrequestext(), "Bad Request!!", null);
		metodos.clicar(elementos.getVoltar());
		metodos.clicar(elementos.getPagenotfound());
		metodos.screenShoot("Link-pagenotfound");
		metodos.validarTexto(elementos.getPagenotfoundtext(), "Page Not Found!!", null);
		metodos.clicar(elementos.getVoltar());
		metodos.clicar(elementos.getInternalerror());
		metodos.screenShoot("Link-internalerror");
		metodos.validarTexto(elementos.getInternaltext(), "Internal Server Error!!", null);

	}

	@Then("valido busca por elementos")
	public void valido_busca_por_elementos() {

		metodos.fecharNavegador();

	}

	@When("clicar em Inputs e TextField")
	public void clicar_em_inputs_e_text_field() {

		metodos.clicar(elementos.getBuscaelementos());

		metodos.clicar(elementos.getInputs());

	}

	@When("Preencher todas as informacoes validas")
	public void preencher_todas_as_informacoes_validas() {

		metodos.escrever(elementos.getFirstname(), "Leandrino");
		metodos.escrever(elementos.getLastname(), "Bardelino");
		metodos.escrever(elementos.getPassword(), "admin123");
		metodos.escrever(elementos.getEmailinput(), "teste@gmail.com");
		metodos.escrever(elementos.getTextarea1(), "Somos #biolovers #biomakers");
		metodos.screenShoot("Input-Textfield");

	}

	@Then("valido inputs e textfields")
	public void valido_inputs_e_textfields() {

		metodos.fecharNavegador();

	}

	@When("clicar no link botoes")
	public void clicar_no_link_botoes() {

		metodos.clicar(elementos.getBuscaelementos());
		metodos.clicar(elementos.getBotoes());

	}

	@When("clicar em todos os botoes")
	public void clicar_em_todos_os_botoes() {

		metodos.clicar(elementos.getRaised());
		metodos.clicar(elementos.getFloating());
		metodos.clicar(elementos.getFlat());
		metodos.clicar(elementos.getSubmit());
		metodos.screenShoot("botoes");

	}

	@Then("valido botoes")
	public void valido_botoes() {

		metodos.fecharNavegador();

	}

	@When("clicar no link radio e checkbox")
	public void clicar_no_link_radio_e_checkbox() {

		metodos.clicar(elementos.getBuscaelementos());
		metodos.clicar(elementos.getRadioecheckbox());

	}

	@When("clicar em todos os radios e checkbox")
	public void clicar_em_todos_os_radios_e_checkbox() {

		metodos.clicar(elementos.getRed());
		metodos.validarBotao(elementos.getRed());
		metodos.clicar(elementos.getBlue());
		metodos.validarBotao(elementos.getBlue());
		metodos.clicar(elementos.getYellow());
		metodos.validarBotao(elementos.getYellow());
		metodos.clicar(elementos.getGreen());
		metodos.validarBotao(elementos.getGreen());
		metodos.clicar(elementos.getPurple());
		metodos.validarBotao(elementos.getPurple());
		metodos.clicar(elementos.getGrey());
		metodos.validarBotao(elementos.getGrey());
		metodos.clicar(elementos.getBlack());
		metodos.validarBotao(elementos.getBlack());
		metodos.clicar(elementos.getWhite());
		metodos.validarBotao(elementos.getWhite());
		metodos.screenShoot("radio-checkbox");

	}

	@Then("valido radio e checkbox")
	public void valido_radio_e_checkbox() {

		metodos.fecharNavegador();

	}

	@When("clicar no link dropdown e select")
	public void clicar_no_link_dropdown_e_select() {

		metodos.clicar(elementos.getBuscaelementos());
		metodos.clicar(elementos.getDropdownselect());
	}

	@When("clicar em todos os dropdowns e selects")
	public void clicar_em_todos_os_dropdowns_e_selects() {

		metodos.clicar(elementos.getMailbox());
		metodos.clicar(elementos.getInbox());
		metodos.clicar(elementos.getMailbox());
		metodos.clicar(elementos.getUnread());
		metodos.clicar(elementos.getMailbox());
		metodos.clicar(elementos.getSent());
		metodos.clicar(elementos.getMailbox());
		metodos.clicar(elementos.getOutbox());
		// metodos.clicar(elementos.getDesenho());
		// metodos.selectComboValue("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input",
		// "Naruto");
		metodos.screenShoot("dropdown-select");

	}

	@Then("valido dropdown e select")
	public void valido_dropdown_e_select() {

		metodos.fecharNavegador();

	}

	@When("clicar no link mudanca de foco")
	public void clicar_no_link_mudanca_de_foco() {

		metodos.clicar(elementos.getMudancadefoco());

	}

	@When("clicar em alert")
	public void clicar_em_alert() {

		metodos.clicar(elementos.getAlert());

	}

	@When("clicar em todos alertas")
	public void clicar_em_todos_alertas() {
		metodos.clicar(elementos.getJsalert());
		metodos.mudarfoco();
		metodos.clicar(elementos.getJsconfirm());
		metodos.mudarfocoConfirmAcept();
		metodos.clicar(elementos.getJsconfirm());
		metodos.mudarfocoConfirmdismiss();
		metodos.clicar(elementos.getJsprompt());
		metodos.mudarfocoConfirmdPrompt();
		metodos.screenShoot("Alerts");

	}

	@Then("valido alerts")
	public void valido_alerts() {
		metodos.fecharNavegador();
	}

	@When("clicar em iframe")
	public void clicar_em_iframe() {

		metodos.clicar(elementos.getIframe());

	}

	@When("interagir com todos os elementos dentro do iframe")
	public void interagir_com_todos_os_elementos_dentro_do_iframe() {

		metodos.mudarfocoFrame();
		metodos.escrever(elementos.getFirstname(), "Leandrino");
		metodos.escrever(elementos.getLastname(), "Bardelino");
		metodos.escrever(elementos.getPassword(), "admin123");
		metodos.escrever(elementos.getEmailinput(), "teste@gmail.com");
		metodos.escrever(elementos.getTextarea1(), "Somos #biolovers #biomakers");
		metodos.screenShoot("Iframe");

	}

	@Then("valido iframe")
	public void valido_iframe() {

		metodos.fecharNavegador();

	}

	@When("clicar em janela")
	public void clicar_em_janela() {

		metodos.clicar(elementos.getJanela());
	}

	@When("clicar em clique aqui para abrir nova janela")
	public void clicar_em_clique_aqui_para_abrir_nova_janela() {

		metodos.clicar(elementos.getAbrirjanela());
		metodos.mudarjanela();
		metodos.screenShoot("novajanela");
		
		
	}

	@Then("valido nova janela")
	public void valido_nova_janela() {

	}

	@When("clicar em modal")
	public void clicar_em_modal() {

	}

	@When("interagir com modal")
	public void interagir_com_modal() {

	}

	@Then("valido modal")
	public void valido_modal() {

	}

}
