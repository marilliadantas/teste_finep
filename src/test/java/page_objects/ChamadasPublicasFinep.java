package page_objects;


import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChamadasPublicasFinep extends BasePage {
    private String url = "http://www.finep.gov.br/chamadas-publicas/chamadaspublicas";
    private By checkboxICTEmpresaFundacoes = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(4) > input");
    private By checkboxICTsFundacoes = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(5) > input");
    private By checkboxICTsEmpresas = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(6) > input");
    private By botaoBuscar = By.xpath("//*[@id=\"submit-chamadas\"]");
    private By checkboxInstiituicoesDePesquisa = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(7) > input");
    private By checkboxInstituicoesDePesquisa = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(8) > input");
    private By checkboxInstituicoesDePesquisa2 = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(9) > input");
    private By checkboxUniversidade = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(11) > input");
    private By checkboxEmpresas = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(1) > input");
    private By checkboxEmpresasStartup = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(2) > input");
    private By checkboxGestoresDeFundosDeInvestimentoEmParticipações = By.cssSelector("#barraEsquerda > ul:nth-child(8) > li:nth-child(3) > input");

    public ChamadasPublicasFinep(WebDriver _browser) {
        super(_browser);
    }

    public void abrir() {
        driver.get(url);
    }

    public void clicarICTEmpresaFundacoes() {
        waitElementVisible(checkboxICTEmpresaFundacoes, 5);
        driver.findElement(checkboxICTEmpresaFundacoes).click();
    }

    public void clicarICTsFundacoes() {
        waitElementVisible(checkboxICTsFundacoes, 5);
        driver.findElement(checkboxICTsFundacoes).click();
    }

    public void clicarICTsEmpresas() {
        waitElementVisible(checkboxICTsEmpresas, 5);
        driver.findElement(checkboxICTsEmpresas).click();
    }

    public void clicarBuscar() {
        waitElementVisible(botaoBuscar, 5);
        driver.findElement(botaoBuscar).click();
    }

    public void clicarInstiituicoesDePesquisa(){
        waitElementVisible(checkboxInstiituicoesDePesquisa, 5);
        driver.findElement(checkboxInstiituicoesDePesquisa).click();
    }

    public void clicarInstituicoesDePesquisa(){
        waitElementVisible(checkboxInstituicoesDePesquisa, 5);
        driver.findElement(checkboxInstituicoesDePesquisa).click();
    }

    public void clicarInstituicoesDePesquisa2(){
        waitElementVisible(checkboxInstituicoesDePesquisa2, 5);
        driver.findElement(checkboxInstituicoesDePesquisa2).click();
    }

    public void clicarUniversidades(){
        waitElementVisible(checkboxUniversidade, 5);
        driver.findElement(checkboxUniversidade).click();
    }

    public void clicarEmEmpresas() {
        waitElementVisible(checkboxEmpresas, 5);
        driver.findElement(checkboxEmpresas).click();
    }

    public void clicarEmEmpresasStartup() {
        waitElementVisible(checkboxEmpresasStartup, 5);
        driver.findElement(checkboxEmpresasStartup).click();
    }

    public void clicarEmGestoresDeFundosDeInvestimentoEmParticipacoes() {
        waitElementVisible(checkboxGestoresDeFundosDeInvestimentoEmParticipações, 5);
        driver.findElement(checkboxGestoresDeFundosDeInvestimentoEmParticipações).click();
    }
}
