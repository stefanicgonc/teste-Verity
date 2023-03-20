package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By titulonossassolucoes = By.xpath("//*[@id=\"comp-kwv1yx4h\"]/h1/span");
	private By titulocultureetech = By.xpath("//*[@id=\"comp-kwv1yb5l\"]/p/span/span/span/span/span/span");
	private By contatosessaovamosconversar = By.cssSelector("#comp-kwz6tqa9 > h1 > span > span:nth-child(1)");
	private By textonome = By.xpath("//*[@id=\"comp-kwz6tqej\"]/label");
	private By textoemail = By.xpath("//*[@id=\"comp-kwz6tqf7\"]/label");
	private By textotelefonecelular = By.xpath("//*[@id=\"comp-kwz6tqfe\"]/label");
	private By textonosconteoseudesafio = By.id("<textarea id=\"textarea_comp-kwz6tqfr\" class=\"rEindN has-custom-focus wixui-text-box__input\" placeholder=\"Nos conte o seu desafio\" aria-required=\"false\" aria-invalid=\"true\"></textarea>");
	private By btnEnviar = By.id("btnEnviar");
	
	public By getTitulonossassolucoes() {
		return titulonossassolucoes;
	}
	public By getTitulocultureetech() {
		return titulocultureetech;
	}
	public By getBtnContatosessaovamosconversar() {
		return contatosessaovamosconversar;
		
	}
	public By getcheckbox() {
	  return getcheckbox();
	
	}
	public Object getrolartela() {
		return getrolartela();
	}
	public By getCampoNome() {
		return getCampoNome();
	}
	public By getCampoEmail() {
		return getCampoEmail();
	}
	public By getCampotelefonecelular() {
		return getCampotelefonecelular();
	}
	public By getCampoNosconteoseudesafio() {
		return getCampoNosconteoseudesafio();
	}
	public By getBtnContato() {
		return getBtnContato();
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
}
