package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.*;


public class FiltrosChamadasPublicasSteps extends BaseSteps {
    ChamadasPublicasFinep paginaInicial = new ChamadasPublicasFinep(browser);
    PaginaResultadoFinep paginaResultado = new PaginaResultadoFinep(browser);

    @Dado("que o usuario esteja na pagina de chamadas publicas do Finep")
    public void queOUsuarioEstejaNaPaginaDeChamadasPublicasDoFinep() {
        paginaInicial.abrir();
        screenshot();
    }

    @Quando("o usuario clicar em ICT \\/ Empresa \\(Fundacoes)")
    public void oUsuarioClicarEmICTEmpresaFundacoes() {
        paginaInicial.clicarICTEmpresaFundacoes();
        screenshot();
    }

    @Quando("o usuario clicar em ICTs \\(Fundacoes)")
    public void oUsuarioClicarEmICTsFundacoes() {
        paginaInicial.clicarICTsFundacoes();
        screenshot();
    }

    @Quando("o usuario clicar em ICTs | Empresas")
    public void oUsuarioClicarEmICTsEmpresas() {
        paginaInicial.clicarICTsEmpresas();
        screenshot();
    }

    @Quando("o usuario clicar no botao de buscar")
    public void oUsuarioClicarNoBotaoDeBuscar() {
        paginaInicial.clicarBuscar();
    }


    @Quando("o usuario clicar em Instiituicoes de Pesquisa")
    public void oUsuarioClicarEmInstiituicoesDePesquisa() {
        paginaInicial.clicarInstiituicoesDePesquisa();
        screenshot();
    }

    //case 3
    @Quando("o usuario clicar em Empresas")
    public void oUsuarioClicarEmEmpresas() {
        paginaInicial.clicarEmEmpresas();
        screenshot();
    }

    @Quando("o usuario clicar em Empresas | Startup")
    public void oUsuarioClicarEmEmpresasStartup() {
        paginaInicial.clicarEmEmpresasStartup();
        screenshot();
    }

    @Quando("o usuario clicar em Gestores de Fundos de Investimento em Participações")
    public void oUsuarioClicarEmGestoresDeFundosDeInvestimentoEmParticipações() {
        paginaInicial.clicarEmGestoresDeFundosDeInvestimentoEmParticipacoes();
        screenshot();
    }

    @E("o usuario clicar em Instituicoes de pesquisa")
    public void oUsuarioClicarEmInstituicoesDePesquisa() {
        paginaInicial.clicarInstituicoesDePesquisa();
        screenshot();
    }

    @E("o usuario clicar em Instituicoes de pesquisa2")
    public void oUsuarioClicarEmInstituicoesDePesquisa2() {
        paginaInicial.clicarInstituicoesDePesquisa2();
        screenshot();
    }

    @E("o usuario clicar em Universidades")
    public void oUsuarioClicarEmUniversidades() {
        paginaInicial.clicarUniversidades();
        screenshot();
    }

    @E("o usuario clicar no segundo resultado da pagina")
    public void oUsuarioClicarNoSegundoResultadoDaPagina() {
        paginaResultado.clicar2Posicao();
        screenshot();
    }

    @Entao("a pagina deve exibir o titulo {string}")
    public void aPaginaDeveExibirOTitulo(String tituloEsperado) {
        String msgTela = paginaResultado.getValidaTitulo();
        Assert.assertEquals(tituloEsperado, msgTela);
        screenshot();
    }
    @Entao("a pagina deve exibir o texto de descricao {string}")
    public void aPaginaDeveExibirOTextoDeDescricao(String descricaoEsperada) {
        String msgTela = paginaResultado.getValidaDescricao();
        Assert.assertEquals(descricaoEsperada, msgTela);
        screenshot();
    }

}