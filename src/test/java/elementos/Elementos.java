package elementos;
import org.openqa.selenium.By;

public class Elementos {

public By barraPesqusia = By.id("interactive");
public By clicarpesquisa = By.cssSelector("body > div > div:nth-child(3) > div.col-lg-8.col-md-8.col-sm-8 > div.input-group > span.input-group-btn > button");
public By clicarcasa = By.cssSelector("body > nav > div > div.collapse.navbar-collapse > ul > li:nth-child(1) > a");
public By clicarsobre = By.cssSelector("body > nav > div > div.collapse.navbar-collapse > ul > li:nth-child(2) > a");
public By clicarcasa2 = By.cssSelector("body > nav > div > div.collapse.navbar-collapse > ul > li:nth-child(1) > a");
public By clicadocumentacao = By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a");

public By getBarraPesqusia() {
	return barraPesqusia;

 
}
public By getClicadocumentacao() {
	return clicadocumentacao;

}
public By getClicarcasa2() {
	return clicarcasa2;

}
public By getClicarsobre() {
	return clicarsobre;

}
public By getClicarcasa() {
	return clicarcasa;

}
public By getClicarpesquisa() {
	return clicarpesquisa;

}

}

