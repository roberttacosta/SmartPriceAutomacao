package steps;

import cucumber.api.java.pt.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.BaseTest;

public class LoginSteps extends BaseTest {


    @Dado("que estou na página de login")
    public void que_estou_na_página_de_login() {
        abreLogin();

    }

    @Dado("digito usuário ou senha incorreta")
    public void digito_usuário_ou_senha_incorreta() {
        digitaUsuario();
        digitaSenhaIncorreta();
    }

    @Quando("aperto no botão continuar")
    public void aperto_no_botão_continuar() {
        apertaBotaoLogin();

    }

    @Então("é mostrada a mensagem de erro de login")
    public void é_mostrada_a_mensagem_de_erro_de_login() {
        validaMensagemErroLogin();
    }


    @Dado("digito usuário ou senha correta")
    public void digitoUsuárioOuSenhaCorreta() {
        digitaUsuario();
        digitaSenhaCorreta();
    }

    @Então("é mostrada a home")
    public void é_mostrada_a_home() {
        validaSemMensagemErroLogin();
    }

    @E("fecho o teste")
    public void FechoOTeste() {
        fechaTestes();
    }

    @E("deslogo")
    public void deslogo() {
        logout();
    }

}
