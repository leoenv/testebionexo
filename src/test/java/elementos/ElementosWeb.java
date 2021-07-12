package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// elementosweb cadastro

	private By formulario = By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a");
	private By criarusuario = By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a");
	private By nome = By.id("user_name");
	private By sobrenome = By.id("user_lastname");
	private By email = By.id("user_email");
	private By endereco = By.id("user_address");
	private By universidade = By.id("user_university");
	private By profissao = By.id("user_profile");
	private By genero = By.id("user_gender");
	private By idade = By.id("user_age");
	private By criar = By.name("commit");
	private By notice = By.id("notice");
	private By emailfail = By.xpath("//*[@id=\"error_explanation\"]/ul/li");
	private By nameblank = By.xpath("//*[@id=\"error_explanation\"]/ul/li[1]");

	// elementosweb links
	private By buscaelementos = By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a");
	private By links = By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a");
	private By sucess = By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/a");
	private By sucesso = By.xpath("/html/body/div[2]/div[2]/div[2]/div/h5");
	private By voltar = By.xpath("/html/body/div[2]/div[2]/div[4]/div/a");
	private By badrequest = By.xpath("/html/body/div[2]/div[2]/div[4]/div[1]/a");
	private By badrequestext = By.xpath("/html/body/div[2]/div[2]/div[2]/h5");
	private By pagenotfound = By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/a");
	private By pagenotfoundtext = By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/h5");
	private By internalerror = By.xpath("/html/body/div[2]/div[2]/div[4]/div[2]/a");
	private By internaltext = By.xpath("/html/body/div[2]/div[2]/div[2]/h5");

	// elementosweb inputs e textfields

	private By inputs = By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a");
	private By firstname = By.id("first_name");
	private By lastname = By.id("last_name");
	private By password = By.id("password");
	private By emailinput = By.id("email");
	private By textarea1 = By.id("textarea1");
	
	//elementosweb botões
	
	private By botoes = By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[3]/a");
	private By raised = By.id("teste");
	private By floating = By.cssSelector("body > div.row > div.col.s9 > div:nth-child(4) > div:nth-child(1) > div > a");
	private By flat = By.xpath("/html/body/div[2]/div[2]/div[5]/div[1]/div/a");
	private By submit = By.name("action");
	
	//elementosweb radio e checkbox
	
	private By radioecheckbox = By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[4]/a");
	private By red = By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[1]/label");
	private By blue = By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[2]/label");
	private By yellow = By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[3]/label");
	private By green = By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[4]/label");
	private By purple = By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[1]/label");
	private By grey = By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[2]/label");
	private By black = By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[3]/label");
	private By white = By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[4]/label");
	
	//elementosweb dropdrown e select
	
	private By dropdownselect = By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[5]/a");
	private By mailbox = By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a");
	private By inbox = By.id("dropdown1");
	private By unread = By.id("dropdown2");
	private By Sent = By.id("dropdown3");
	private By outbox = By.id("dropdown4");
	private By desenho = By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input");
	private By naruto = By.id("select-options-4aa0a4a4-ea06-39e5-6e13-7cf8b7fc8658");
	
	
	//elementos web alerts
	
	private By mudancadefoco = By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a");
	private By alert = By.xpath("/html/body/div[2]/div[1]/ul/li[3]/div/ul/li[1]/a");
	private By jsalert = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/ul/li[1]/button");
	private By jsconfirm = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/ul/li[2]/button");
	private By jsprompt = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/ul/li[3]/button");
	
	
	//elementos iframes
	
	private By iframe = By.xpath("/html/body/div[2]/div[1]/ul/li[3]/div/ul/li[2]/a");
	
	//elementos nova janela
	
	private By janela = By.xpath("/html/body/div[2]/div[1]/ul/li[3]/div/ul/li[3]/a");
	private By abrirjanela = By.xpath("/html/body/div[2]/div[2]/div[3]/div/a");
	private By textojanela = By.xpath("/html/body/div[2]/div[2]/div[2]/div/h5");

	// metodos publicos para acessar os elementos

	public By getAbrirjanela() {
		return abrirjanela;
	}

	public By getJsalert() {
		return jsalert;
	}

	public By getJsconfirm() {
		return jsconfirm;
	}

	public By getAlert() {
		return alert;
	}

	public By getDesenho() {
		return desenho;
	}

	public By getNaruto() {
		return naruto;
	}

	public By getDropdownselect() {
		return dropdownselect;
	}

	public By getMailbox() {
		return mailbox;
	}

	public By getInbox() {
		return inbox;
	}

	public By getUnread() {
		return unread;
	}

	public By getSent() {
		return Sent;
	}

	public By getOutbox() {
		return outbox;
	}

	public By getRadioecheckbox() {
		return radioecheckbox;
	}

	public By getRed() {
		return red;
	}

	public By getBlue() {
		return blue;
	}

	public By getYellow() {
		return yellow;
	}

	public By getGreen() {
		return green;
	}

	public By getPurple() {
		return purple;
	}

	public By getGrey() {
		return grey;
	}

	public By getBlack() {
		return black;
	}

	public By getWhite() {
		return white;
	}

	public By getBotoes() {
		return botoes;
	}

	public By getRaised() {
		return raised;
	}

	public By getFloating() {
		return floating;
	}

	public By getFlat() {
		return flat;
	}

	public By getSubmit() {
		return submit;
	}

	public By getInputs() {
		return inputs;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getLastname() {
		return lastname;
	}

	public By getPassword() {
		return password;
	}

	public By getEmailinput() {
		return emailinput;
	}

	public By getTextarea1() {
		return textarea1;
	}

	public By getBadrequestext() {
		return badrequestext;
	}

	public By getPagenotfoundtext() {
		return pagenotfoundtext;
	}

	public By getInternaltext() {
		return internaltext;
	}

	public By getPagenotfound() {
		return pagenotfound;
	}

	public By getInternalerror() {
		return internalerror;
	}

	public By getFormulario() {
		return formulario;
	}

	public By getCriarUsuario() {
		return criarusuario;
	}

	public By getCriarusuario() {
		return criarusuario;
	}

	public By getNome() {
		return nome;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getEmail() {
		return email;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getUniversidade() {
		return universidade;
	}

	public By getProfissao() {
		return profissao;
	}

	public By getGenero() {
		return genero;
	}

	public By getIdade() {
		return idade;
	}

	public By getCriar() {
		return criar;
	}

	public By getNotice() {
		return notice;
	}

	public By getEmailfail() {
		return emailfail;
	}

	public By getNameblank() {
		return nameblank;
	}

	public void setNameblank(By nameblank) {
		this.nameblank = nameblank;
	}

	public By getBuscaelementos() {
		return buscaelementos;
	}

	public By getSucess() {
		return sucess;
	}

	public By getLinks() {
		return links;
	}

	public By getSucesso() {
		return sucesso;
	}

	public By getVoltar() {
		return voltar;
	}

	public By getBadrequest() {
		return badrequest;
	}

	public By getMudancadefoco() {
		return mudancadefoco;
	}

	public By getJsprompt() {
		return jsprompt;
	}

	public By getIframe() {
		return iframe;
	}

	public By getJanela() {
		return janela;
	}

	public By getTextojanela() {
		return textojanela;
	}
}
