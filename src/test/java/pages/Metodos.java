package pages;

import static org.junit.Assert.assertEquals;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.ElementosWeb;

public class Metodos {
	ElementosWeb elementos = new ElementosWeb();

	WebDriver driver;

	public void abrirNavegador(String site, String descricaoPasso) {

		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		} catch (Exception e) {

			System.out.println("--- nao foi possivel abrir o navegador--- " + e.getMessage());

		}
	}

	public void fecharNavegador() {

		try {

			driver.quit();

		} catch (Exception e) {
			System.out.println("----- erro ao fechar navegador ------" + e.getMessage());
		}

	}

	public void escrever(By elemento, String texto) {

		try {
			Thread.sleep(1000);
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("----- erro ao escrever ------" + e.getMessage());
		}
	}

	public void clicar(By elemento) {

		try {
			Thread.sleep(1000);
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("----- erro ao clicar ------" + e.getMessage());
		}
	}

	public void submit(By elemento) {

		try {

			driver.findElement(elemento).submit();

		} catch (Exception e) {
			System.out.println("----- erro ao enviar------" + e.getMessage());
		}
	}

	public void screenShoot(String nomeScr) {
		try {
			TakesScreenshot srcShoot = ((TakesScreenshot) driver);
			File srcFile = srcShoot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeScr + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {
			System.out.println("----- ERROR nao foi possivel tirar uma screenshot ----- " + e.getMessage());
		}

	}

	public void validarTexto(By elemento, String textoEsperado, String passo) {
		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto -------" + passo + " " + e.getMessage());
		}

	}

	public void validarBotao(By elemento) {
		try {
			Thread.sleep(3000);
			driver.findElement(elemento).isSelected();
			Assert.assertTrue(true);

		} catch (Exception e) {
			System.err.println("-------- error ao validar texto ------- " + e.getMessage());
		}

	}

	public void mudarfoco() {

		try {
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Eu sou um alerta JS!", alert.getText());
			alert.accept();

		} catch (Exception e) {
			System.err.println("-------- error ao clicar no alerta------- " + e.getMessage());
		}

	}
	
	
	public void mudarfocoConfirmAcept() {

		try {
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Eu sou uma confirmação JS!", alert.getText());
			alert.accept();
			Assert.assertEquals("Você clicou: Ok", driver.findElement(By.id("result")).getText());

		} catch (Exception e) {
			System.err.println("-------- error ao clicar no alerta------- " + e.getMessage());
		}

	}
	
	public void mudarfocoConfirmdismiss() {

		try {
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Eu sou uma confirmação JS!", alert.getText());
			alert.dismiss();
			Assert.assertEquals("Você clicou: Cancel", driver.findElement(By.id("result")).getText());

		} catch (Exception e) {
			System.err.println("-------- error ao clicar no alerta------- " + e.getMessage());
		}

	}
	
	public void mudarfocoConfirmdPrompt() {

		try {
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Eu sou um  prompt JS!", alert.getText());
			alert.sendKeys("Somos #biolovers #biomakers");
			alert.accept();
			Assert.assertEquals("Você digitou: Somos #biolovers #biomakers", driver.findElement(By.id("result")).getText());

		} catch (Exception e) {
			System.err.println("-------- error ao clicar no alerta------- " + e.getMessage());
		}

	}
	
	public void mudarfocoFrame() {

		try {
			Thread.sleep(2000);
			driver.switchTo().frame("id_do_iframe");
			

		} catch (Exception e) {
			System.err.println("-------- error ao mudar o frame------- " + e.getMessage());
		}

	}
	
	public void mudarjanela() {

		try {
			Thread.sleep(2000);
						
			driver.switchTo().window("<a href=\"/mudancadefoco/newwindow\" ,=\"\" target=\"_blank\" class=\"btn waves-light red\">Clique aqui</a>");

			
		
		
			
            			

		} catch (Exception e) {
			System.err.println("-------- error ao mudar de janela------- " + e.getMessage());
		}

	}
	
	public void fecharJanela() {

		try {
			driver.close();;
			

		} catch (Exception e) {
			System.err.println("-------- error ao fechar janela------- " + e.getMessage());
		}

	}
	
}
