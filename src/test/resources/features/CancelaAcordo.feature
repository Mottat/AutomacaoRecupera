#language: pt

@CancelaAcordoExecution
Funcionalidade: Cancelar acordo

  Contexto:
    Dado que estou no recupera

  @CenarioComum
  Cenario: Cancelar acordo
    Quando pesquiso cliente com acordo
    E cancelo acordo
    Entao acordo cancelado com sucesso
