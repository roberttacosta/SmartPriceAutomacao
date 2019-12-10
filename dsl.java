package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static core.AppiumDriverHelper.getDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import io.appium.java_client.android.nativekey.AndroidKey;

public class DSL {

    private PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();
    public PropertiesUtil getPropertiesUtil() {
        return propertiesUtil;
    }

    public void pressVoltar(){
        getDriver().pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void explicitlyWait(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(),60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public void escrever(By by, String texto) {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int cont = 0;
        while(!existeElemento(by) && cont < 4){
            scroll(0.75, 0.25);
            cont++;
        }
        getDriver().findElement(by).sendKeys(texto);
    }

    public void replaceTexto(By by, String texto) {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int cont = 0;
        while(!existeElemento(by) && cont <4){
            scroll(0.75, 0.25);
            cont++;
        }
        getDriver().findElement(by).click();
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void set_field_with_pattern(By by, String entradaEsperada) {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        while(!existeElemento(by)){
            scroll(0.75, 0.25);
        }
        //colocando o valor em uma variável
        MobileElement entrada = getDriver().findElement(by);

        //escrevendo valor
        entrada.sendKeys(entradaEsperada);

        //instanciando variáveis
        String value = entradaEsperada;
        String valueScreen = entrada.getText();;
        int tam = entrada.getText().length();
        int tamesp = entradaEsperada.length();
        boolean testeigualdade = value.equals(valueScreen);

        //laço de comparação
        while (tam != tamesp || !testeigualdade) {
            entrada.clear();
            entrada.sendKeys(entradaEsperada);
            tam = entrada.getText().length();
            valueScreen = entrada.getText();
            testeigualdade = value.equals(valueScreen);
        }
    }

    public void pressEnter(){
        getDriver().getKeyboard().sendKeys(Keys.ENTER);
    }

    public void compararTextoByID(String Id, String textoEsperado) {
        int cont = 0;
        while(!existeElemento(By.id(Id)) && cont < 4){
            scroll(0.75, 0.25);
            cont++;
        }
        //System.out.println("O texto esperado eh: " + textoEsperado + " o texto exibido que pegamos da tela eh: " + obterTexto(By.id(Id)));
        if (!textoEsperado.equals(obterTexto(By.id(Id)))) {
            System.out.println("O texto esperado era: " + textoEsperado + " mas o texto exibido na tela é: " + obterTexto(By.id(Id)));
            Assert.assertEquals(textoEsperado, obterTexto(By.id(Id)));
        }
    }

    public void compararTextoByXpathClass(String texto, String textoEsperado) {
        int cont = 0;
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        while(!existeElemento(By.xpath(texto)) && cont < 4){
            scroll(0.75, 0.25);
            cont++;
        }
        //System.out.println("O texto esperado eh: " + textoEsperado + " o texto exibido que pegamos da tela eh: " + obterTexto(By.xpath(texto)));
        if (!textoEsperado.equals(obterTexto(By.xpath(texto)))) {
            System.out.println("O texto esperado era: " + textoEsperado + " mas o texto exibido na tela eh: " + obterTexto(By.xpath(texto)));
            Assert.assertEquals(textoEsperado, obterTexto(By.xpath(texto)));
        }
    }

    public void compararTextoButton(String Id, String textoEsperado) {
        //System.out.println("O texto esperado eh: " + textoEsperado.toLowerCase() + " o texto exibido que pegamos da tela eh: " + obterTexto(By.id(Id)).toLowerCase());
        if (!textoEsperado.toLowerCase().equals(obterTexto(By.id(Id)).toLowerCase())) {
            System.out.println("O texto esperado era: " + textoEsperado.toLowerCase() + " mas o texto exibido na tela é: " + obterTexto(By.id(Id)).toLowerCase());
            Assert.assertEquals(textoEsperado.toLowerCase(), obterTexto(By.id(Id)).toLowerCase());
        }
    }



    public void findElementBy(By by) {
        getDriver().findElement(by);
    }

    public void findElementByID(String ID) {
        getDriver().findElementById(ID);
    }

    public String obterTexto(By by) {
        int cont = 0;
        while(!existeElemento(by) && cont < 4){
            scroll(0.75, 0.25);
            cont++;
        }
        return getDriver().findElement(by).getText();
    }

    public void clicar(By by) {
        int cont =0;
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        while(!existeElemento(by) && cont < 4){
            scroll(0.75, 0.25);
            cont++;
        }
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto) {
        int cont = 0;
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        while(!existeElemento((By.xpath("//*[@text ='" + texto + "']")))&& cont < 4){
            scroll(0.75, 0.25);
            cont++;
        }
        clicar(By.xpath("//*[@text ='" + texto + "']"));
    }

    public void selecionarCombo(By by, String valor) {
        while(!existeElemento(by)){
            scroll(0.75, 0.25);
        }
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public boolean isCheckMarcado(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }


    public boolean isNotCheckMarcado(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("false");
    }


    public static boolean existeElementoPorTexto(String texto) {
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
        return elementos.size() > 0;
    }

    public static boolean existeElemento(By by) {
        List<MobileElement> elementos = getDriver().findElements(by);
        return elementos.size() > 0;
    }

    public void scroll(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int x = size.width / 2;

        int starty = (int) (size.height * inicio);
        int endy = (int) (size.height * fim);

        new TouchAction(getDriver())
                .press(point(x, starty))
                .waitAction(waitOptions(Duration.ofMillis(500)))
                .moveTo(point(x, endy))
                .release()
                .perform();
    }

    public void swipeElement(MobileElement element, double inicio, double fim) {
        int y = element.getLocation().y + (element.getSize().height / 2);

        int startx = (int) (element.getSize().width * inicio);
        int endx = (int) (element.getSize().width * fim);

        new TouchAction(getDriver())
                .press(point(startx, y))
                .waitAction(waitOptions(Duration.ofMillis(500)))
                .moveTo(point(endx, y))
                .release()
                .perform();

    }

    public void horizontalswipe(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = getDriver().manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(getDriver())
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }


    public void scrollDown() {
        scroll(0.9, 0.1);
    }

    public void scrollUp() {
        scroll(0.1, 0.9);
    }

    public void swipeLeft() {
        horizontalswipe(0.2, 0.8, 0.9);
    }

    public void swipeRight() {
        horizontalswipe(0.8, 0.2, 0.3);
    }

    public void waitingForElement(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //gera cpf
    private static String calcDigVerif(String num) {
        Integer primDig, segDig;
        int soma = 0, peso = 10;
        for (int i = 0; i < num.length(); i++)
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
        if (soma % 11 == 0 | soma % 11 == 1)
    primDig = new Integer(0);
    else
    primDig = new Integer(11 - (soma % 11));

    soma = 0;
    peso = 11;
    for (int i = 0; i < num.length(); i++)
    soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;

    soma += primDig.intValue() * 2;
    if (soma % 11 == 0 | soma % 11 == 1)
    segDig = new Integer(0);
    else
    segDig = new Integer(11 - (soma % 11));

    return primDig.toString() + segDig.toString();
}

    public static String geraCPF() {
        String iniciais = "";
        Integer numero;
        for (int i = 0; i < 9; i++) {
            numero = new Integer((int) (Math.random() * 10));
            iniciais += numero.toString();
        }
        return iniciais + calcDigVerif(iniciais);
    }

    public static boolean validaCPF(String cpf) {
        if (cpf.length() != 11)
            return false;

        String numDig = cpf.substring(0, 9);
        return calcDigVerif(numDig).equals(cpf.substring(9, 11));
    }

    public static String geraStringCPF(){
        int val = 0;

        while (val == 0){
            String cpf = geraCPF();
        if (validaCPF(cpf)){
            val = 1;
            return cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11);
        }
        else geraCPF();}

        return null;

    }

    public static void esperar(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
