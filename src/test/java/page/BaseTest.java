package page;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    static WebDriver driver;

    public void esperar(long tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void abreLogin(){
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8080/");
        esperar(2000);


    }

    public void digitaUsuario(){

        driver.findElement(By.id("id_username")).sendKeys("ricardo");
        esperar(2000);
    }

    public void digitaSenhaCorreta(){
        driver.findElement(By.id("id_password")).sendKeys("1234");
        esperar(2000);
    }

    public void digitaSenhaIncorreta(){
        driver.findElement(By.id("id_password")).sendKeys("123");
        esperar(2000);
    }

    public void apertaBotaoLogin(){

        driver.findElement(By.xpath("//*[@value='Login']")).click();
        esperar(2000);
    }

    public void validaMensagemErroLogin(){
        String msgerro = "Por favor, entre com um usuário e senha corretos. Note que ambos os campos diferenciam maiúsculas e minúsculas.";
        String msg = driver.findElement(By.xpath("//*[contains (@class, 'errorlist')]")).getText();

        Assert.assertEquals(msg, msgerro);
    }

    public void validaSemMensagemErroLogin(){
    }

    public void apertaCadastroProduto(){
        driver.findElement(By.xpath("//a[contains(@href, 'cadastro')]")).click();
        //driver.find_element_by_xpath('//a[contains(@href,"href")]')
    }

    public void preencheFormularioCadastroProduto(){
        esperar(1000);
        driver.findElement(By.id("id_COD_BARR")).sendKeys("123456789");
        esperar(1000);
        driver.findElement(By.id("id_UM")).sendKeys("KG");
        esperar(1000);
        driver.findElement(By.id("id_TAGS")).sendKeys("#alimento #criança");
        esperar(1000);
        driver.findElement(By.id("id_EMBALAGEM")).sendKeys("20");
        esperar(1000);
        driver.findElement(By.id("id_DESCRIC")).sendKeys("Mucilon para criança de 0 a 9 anos.");
        esperar(1000);
    }

    public void apertaBotaoCadastrar(){
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        esperar(1000);
    }

    public void validaMensagemSucessoCadastro(){
        String msgsucesso = "Produto Cadastrado com Sucesso!";
        String msg = driver.findElement(By.xpath("//*[contains (@class, 'alert-success')]")).getText();

        Assert.assertEquals(msg, msgsucesso);
    }

    public void apertaListarProduto(){
        driver.findElement(By.xpath("//a[contains(@href, 'listar')]")).click();
        esperar(2500);
        //driver.find_element_by_xpath('//a[contains(@href,"href")]')
    }

    public void editarProduto(){
        driver.findElement(By.xpath("//a[contains(@href, '123456789')]")).click();
        esperar(1000);
        driver.findElement(By.id("id_UM")).clear();
        driver.findElement(By.id("id_UM")).sendKeys("UN");
        esperar(1000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        esperar(2500);
    }

    public void excluirProduto(){
        driver.findElement(By.xpath("//a[contains(@href, 'deletar/123456789')]")).click();
        esperar(2500);
    }

    public void logout(){
        driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
        esperar(1000);
    }

    @AfterClass
    public void fechaTestes(){
        driver.close();
        driver.quit();
    }
}
