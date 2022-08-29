package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;


public class Steps {
	Elementos el= new Elementos();
	Metodos metodos = new Metodos();
	
	
	
	@Given("Que eu esteja no swapi.dev")
	public void que_eu_esteja_no_swapi_dev() {
	    metodos.abrirNavegador();

	}

	@When("Pesquisar uma palavra  aleatoria")
	public void pesquisar_uma_palavra_aleatoria() {
		   metodos.escrever();
	}

	@Then("O sistema deve apresentar um codigo de erro")
	public void o_sistema_deve_apresentar_um_codigo_de_erro() {
		metodos.clicar(el.clicarpesquisa);
	}

	@Given("Dado que eu esteja na tela sobre")
	public void dado_que_eu_esteja_na_tela_sobre() {
		metodos.clicar(el.clicarsobre);
	}

	@When("Clico no Botao sobre")
	public void clico_no_botao_sobre() {
		metodos.clicar(el.clicarsobre);
	}

	@Then("O sistema deve direcionar para uma janela de explicacoes sobre o site")
	public void o_sistema_deve_direcionar_para_uma_janela_de_explicacoes_sobre_o_site() {
	   
	}

	@Given("Dado que eu esteja na tela inicial")
	public void dado_que_eu_esteja_na_tela_inicial() {
		metodos.clicar(el.clicarcasa2);
		

	}

	@When("Clico no Botao documentacao")
	public void clico_no_botao_documentacao() {
		metodos.clicar(el.clicadocumentacao);
       
	
	}

	    
	
   
}


	 
	
	
	

