#Author: bardelinprojetos@gmail.com

@tag
Feature: Navegar por todas as funcionalidades do site
  Eu como usuario quero navegar por todas as funcionalidades do site
 
 Background: Acessar a home do site
 Given que eu esteja na home do site "https://automacaocombatista.herokuapp.com/treinamento/home"
 
  @formulariocorreto
  Scenario: Criar usuario - teste positivo
    When clicar em Formulario
    And clicar em Criar Usuarios 
    And preencher os campos obrigatorios corretamente
    Then Valido login criado com sucesso
    
   @formularioincorreto 
    Scenario: Criar usuario - teste negativo
    When clicar em Formulario
    And clicar em Criar Usuarios 
    And preencher os campos obrigatorios incorretamente
    Then Valido a falha na criacao de login
    
    @formularioembranco
    Scenario: Criar usuario - teste negativo em branco
    When clicar em Formulario
    And clicar em Criar Usuarios 
    And deixo os campos em branco
    Then Valido a falha na criacao de login campos em branco
       
  @buscaelementos
  Scenario: Buscar elementos
  When clicar em buscar elementos
  And interagir com todos os elementos
  Then valido busca por elementos
  
  @inputstextfields
  Scenario: Interagir com inputs e textfields
  When clicar em Inputs e TextField
  And Preencher todas as informacoes validas
  Then valido inputs e textfields
  
  @botoes
  Scenario: Interagir com botoes
  When clicar no link botoes
  And clicar em todos os botoes
  Then valido botoes
  
  @radioecheckbox
  Scenario: Clicar nos radios e checkbox
  When clicar no link radio e checkbox
  And clicar em todos os radios e checkbox
  Then valido radio e checkbox
  
  @dropdownselect
  Scenario: Clicar nos dropdowns e nos selects
  When clicar no link dropdown e select
  And clicar em todos os dropdowns e selects
  Then valido dropdown e select
  
   @alert
  Scenario: Clicar nos alerts
  When clicar no link mudanca de foco
  And clicar em alert
  And clicar em todos alertas
  Then valido alerts
  
  @iframe
  Scenario: Interagir com os iframes
  When clicar no link mudanca de foco
  And clicar em iframe
  And interagir com todos os elementos dentro do iframe
  Then valido iframe
  
  @janela
  Scenario: Abri nova janela
  When clicar no link mudanca de foco
  And clicar em janela
  And clicar em clique aqui para abrir nova janela
  Then valido nova janela
  
  @modal
  Scenario: Intergarir com modal
  When clicar no link mudanca de foco
  And clicar em modal
  And interagir com modal
  Then valido modal
    
    


