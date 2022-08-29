package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class Metodos {

	Elementos el = new Elementos();
	
	WebDriver driver;
	
	public void abrirNavegador() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
    	driver.manage().window().maximize();
	  
	}		 

		public void escrever() {	
	   driver.findElement(By.id("interactive")).sendKeys("jessifon ferreira");
		
		}
		
		public void clicar(By elementos) {
		driver.findElement(el.clicarpesquisa).click();
		driver.findElement(el.clicarcasa).click();
		driver.findElement(el.clicarsobre).click();
		driver.findElement(el.clicarcasa2).click();
		driver.findElement(el.clicadocumentacao).click();
		}

		public void fecharnavegador() {
		driver.quit();
}
}
