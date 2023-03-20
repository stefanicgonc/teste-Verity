package Steps;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps extends Metodos {
	Elementos e = new Elementos();
	Metodos m = new Metodos();

	@Given("^que acesse o site da Verity \"([^\"]*)\"$")
	public void que_acesse_o_site_da_Verity(String url) throws Throwable {
		abrirnavegador(url);
	}
	@Given("validar o titulo Somos Verity_")
	public void validar_o_titulo_somos_verity() throws Throwable {
		
	}
	
		public void testeCadastro() throws InterruptedException {
		    WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver.get("https://www.verity.com.br/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"comp-l0b60nwv\"]/div")).click();
			driver.findElement(By.id("comp-l0b60nwv-dropdown-option-1")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"comp-kwv1yb5l\"]")).getText().contains("Culture and Tech"));
		
	}	
		
		
		@Test
		public void testeCadastroPt1()throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver.get("https://www.verity.com.br/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Assert.assertEquals("Nossas soluções",driver.findElement(By.xpath("//*[@id=\"comp-kwv1yx4h\"]")).getText());
			
	}
		
		@Test
		public void testeCadastro1(){
			
			driver.findElement(By.xpath("//*[@id=\"comp-l0b60nwv\"]/div")).click();
			driver.findElement(By.id("comp-l0b60nwv-dropdown-option-1")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"comp-kwv1yb5l\"]")).getText().contains("Culture and Tech"));
			
		}

		@Test
		public void testeCadastroPt() {
			Assert.assertEquals("Nossas soluções", driver.findElement(By.xpath("//*[@id=\"comp-kwv1yx4h\"]")).getText());
			driver.quit();

		}
	@Given("^click no menu contato, sessao vamos conversar$")
	public void click_no_menu_contato_sessao_vamos_conversar() throws Throwable {
		
	}

	@When("^quando preencher todos os dados$")
	
		@Test
		public void testeContato() throws InterruptedException {
			driver.findElement(By.id("comp-kevyodnk5")).click();
			driver.findElement(By.id("input_comp-kwz6tqej")).sendKeys("Stefani Cardoso Goncalves");
			driver.findElement(By.id("input_comp-kwz6tqf7")).sendKeys("stefani_cgoncalves@hotmail.com");
			driver.findElement(By.id("input_comp-kwz6tqfe")).sendKeys("11972401896");
			driver.findElement(By.id("textarea_comp-kwz6tqfr")).sendKeys("Não tenho");
			WebElement element = driver.findElement((By.id("comp-kwz6tqgp")));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			element.click();
			driver.findElement(By.id("comp-kwz6tqhd")).click();
	}

	@Then("^seleciono o botao enviar$")
	public void seleciono_o_botao_enviar() throws Throwable {
		driver.quit();
	}

}
