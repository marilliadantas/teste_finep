package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class PaginaResultadoFinep extends BasePage {
   private By resultado2Posicao = By.cssSelector("#conteudoChamada > div:nth-child(3) > h3 > a");
   private By titleResult = By.cssSelector("#componente > div > h2 > a");
   private By descriptionResult = By.cssSelector("#componente > div > div.group.desc > div > p:nth-child(1)");

    public PaginaResultadoFinep(WebDriver _browser) {
        super(_browser);
    }

    public void clicar2Posicao() {
        waitElementVisible(resultado2Posicao, 5);
        driver.findElement(resultado2Posicao).click();
    }

    public String getValidaTitulo() {
        waitElementVisible(titleResult, 5);
        String tituloTexto = driver.findElement(titleResult).getText();
        return tituloTexto;
    }

    public String getValidaDescricao() {
        waitElementVisible(titleResult, 5);
        String descricaoTexto = driver.findElement(descriptionResult).getText();
        return descricaoTexto;
    }

}

