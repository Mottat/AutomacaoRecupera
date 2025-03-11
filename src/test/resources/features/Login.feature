#language: pt

@LoginExecution
Funcionalidade: Login valido

  Contexto:
    Dado que estou na pagina de login

  @CenarioComum
  Cenario: Fazer login com usuario valido
    Quando faço login com dados validos
    Entao realizo login com sucesso
