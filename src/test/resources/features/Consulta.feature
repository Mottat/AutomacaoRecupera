#language: pt

@ConsultaExecution
Funcionalidade: Consulta Cliente

  Contexto:
    Dado que estou na pagina do recupera

  @CenarioComum
  Cenario: Fazer consulta de cliente com divida
    Quando Clico em operacao
    E pesquiso pelo cliente
    Entao consulta realizada com sucesso
