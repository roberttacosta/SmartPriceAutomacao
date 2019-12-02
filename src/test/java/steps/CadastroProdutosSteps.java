package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.BaseTest;

public class CadastroProdutosSteps extends BaseTest {
    @Quando("aperto em Cadastro Produto")
    public void aperto_em_Cadastro_Produto() {
        apertaCadastroProduto();
    }

    @Quando("preencho os dados")
    public void preencho_os_dados() {
        preencheFormularioCadastroProduto();
    }

    @Quando("aperto no botão Cadastrar")
    public void aperto_no_botão_Cadastrar() {
        apertaBotaoCadastrar();
    }

    @Então("o produto é cadastrado")
    public void o_produto_é_cadastrado() {
        validaMensagemSucessoCadastro();

    }

    @E("vejo os produtos cadastrados")
    public void vejoOsProdutoCadastrados() {
        apertaListarProduto();
    }

    @Quando("edito a unidade de medida")
    public void edito_a_unidade_de_medida() {
        editarProduto();
    }

    @Então("a unidade de medida é mudada")
    public void a_unidade_de_medida_é_mudada() {
    }

    @Quando("excluo o produto")
    public void excluo_o_produto() {
        excluirProduto();
    }

    @Então("o produto some da lista")
    public void o_produto_some_da_lista() {

    }

}
