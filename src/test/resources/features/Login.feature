#language: pt

@LoginExecution
Funcionalidade: Login

  Contexto:
    Dado que estou na pagina de login

  @CenarioComum
  Cenario: Fazer login com usuario valido
    Quando informo dados validos
    E clico em logar
    Entao realizo login com sucesso
