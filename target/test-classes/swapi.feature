#Author: jessifon ferreira lima

   Feature: A valicao
    Background: A cessando o site validando um teste negativo e dois testes positivos
    
   
   @pesquisa
    Scenario: Pesquisar uma palavra aleatoria 
    Given Que eu esteja no swapi.dev
    When Pesquisar uma palavra  aleatoria
    Then O sistema deve apresentar um codigo de erro
  
   @clicando
    Scenario: Clicando no botao sobre 
    Given Dado que eu esteja na tela sobre 
    When  Clico no Botao sobre
    Then  O sistema deve direcionar para uma janela de explicacoes sobre o site
    
    @documentacao
    Scenario: Clicando no botao documentacao
    Given Dado que eu esteja na tela inicial 
    When  Clico no Botao documentacao
    Then  O sistema deve direcionar para uma janela de explicacoes sobre o site
    