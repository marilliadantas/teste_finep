#language: pt
@filtrosChamadasPublicas

Funcionalidade: Filtros
  Cenario: Filtrar por: ICT / Empresa (Fundacoes), ICTs (Fundacoes) ICTs e Empresas
    Dado que o usuario esteja na pagina de chamadas publicas do Finep
    Quando o usuario clicar em ICT / Empresa (Fundacoes)
    E o usuario clicar em ICTs (Fundacoes)
    E o usuario clicar em ICTs | Empresas
    E o usuario clicar no botao de buscar
    E o usuario clicar no segundo resultado da pagina
    Entao a pagina deve exibir o titulo "Programa praças da ciência em museus e centros de ciência e tecnologia e espaços científicos culturais – 01/2022"
    E a pagina deve exibir o texto de descricao "CHAMADA PÚBLICA MCTI/FINEP/FNDCT/CT-VERDE AMARELO"

  Cenario: Filtrar por: Instiituicoes de Pesquisa, Instituicoes de pesquisa, Instituicoes de pesquisa e Universidades
    Dado que o usuario esteja na pagina de chamadas publicas do Finep
    Quando o usuario clicar em Instiituicoes de Pesquisa
    E o usuario clicar em Instituicoes de pesquisa
    E o usuario clicar em Instituicoes de pesquisa2
    E o usuario clicar em Universidades
    E o usuario clicar no botao de buscar
    E o usuario clicar no segundo resultado da pagina
    Entao a pagina deve exibir o titulo "CT-HIDRO 2022 - Racionalização dos Usos da Água e a Gestão e o Monitoramento dos Recursos Hídricos"
    E a pagina deve exibir o texto de descricao "CHAMADA PÚBLICA MCTI/FINEP/CT-HIDRO 2022"

  Cenario: Filtrar por:  Empresas, Empresas | Startup, Gestores de Fundos de Investimento em Participações
    Dado que o usuario esteja na pagina de chamadas publicas do Finep
    Quando o usuario clicar em Empresas
    E o usuario clicar em Empresas | Startup
    E o usuario clicar em Gestores de Fundos de Investimento em Participações
    E o usuario clicar no botao de buscar
    E o usuario clicar no segundo resultado da pagina
    Entao a pagina deve exibir o titulo "Seleção de Gestor para o FIP Finep Startup"
    E a pagina deve exibir o texto de descricao "CHAMADA PÚBLICA PARA A SELEÇÃO DE GESTOR E ADMINISTRADOR PARA O FUNDO DE INVESTIMENTO EM PARTICIPAÇÕES FINEP STARTUP 1 – FIP FINEP STARTUP 1"