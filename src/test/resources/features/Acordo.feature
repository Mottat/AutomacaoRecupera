#language: pt

@AcordoExecution
Funcionalidade: Fazer acordo

  Contexto:
    Dado que estou na pagina inicial do recupera

  @CenarioComum
  Cenario: Fazer acordo CCR
    Quando Clico no menu operacao
    E faço um acordo
    Entao acordo criado com sucesso
