$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/E2E.feature");
formatter.feature({
  "name": "logar, cadastrar e listar",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Wig"
    }
  ]
});
formatter.scenario({
  "name": "Login incorreto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Wig"
    }
  ]
});
formatter.step({
  "name": "que estou na página de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito usuário ou senha incorreta",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.digito_usuário_ou_senha_incorreta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto no botão continuar",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.aperto_no_botão_continuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "é mostrada a mensagem de erro de login",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.é_mostrada_a_mensagem_de_erro_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fecho o teste",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.FechoOTeste()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login correto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Wig"
    }
  ]
});
formatter.step({
  "name": "que estou na página de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito usuário ou senha correta",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.digitoUsuárioOuSenhaCorreta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto no botão continuar",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.aperto_no_botão_continuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "é mostrada a home",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.é_mostrada_a_home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deslogo",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.deslogo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fecho o teste",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.FechoOTeste()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar produto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Wig"
    }
  ]
});
formatter.step({
  "name": "que estou na página de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito usuário ou senha correta",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.digitoUsuárioOuSenhaCorreta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto no botão continuar",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.aperto_no_botão_continuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto em Cadastro Produto",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.aperto_em_Cadastro_Produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho os dados",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.preencho_os_dados()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto no botão Cadastrar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.aperto_no_botão_Cadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto é cadastrado",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroProdutosSteps.o_produto_é_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "vejo os produtos cadastrados",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.vejoOsProdutoCadastrados()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fecho o teste",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.FechoOTeste()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "listar e editar produto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Wig"
    }
  ]
});
formatter.step({
  "name": "que estou na página de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito usuário ou senha correta",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.digitoUsuárioOuSenhaCorreta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto no botão continuar",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.aperto_no_botão_continuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "vejo os produtos cadastrados",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.vejoOsProdutoCadastrados()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "edito a unidade de medida",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.edito_a_unidade_de_medida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a unidade de medida é mudada",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroProdutosSteps.a_unidade_de_medida_é_mudada()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fecho o teste",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.FechoOTeste()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "listar e excluir produto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Wig"
    }
  ]
});
formatter.step({
  "name": "que estou na página de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito usuário ou senha correta",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.digitoUsuárioOuSenhaCorreta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aperto no botão continuar",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.aperto_no_botão_continuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "vejo os produtos cadastrados",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.vejoOsProdutoCadastrados()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "excluo o produto",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroProdutosSteps.excluo_o_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto some da lista",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroProdutosSteps.o_produto_some_da_lista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fecho o teste",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.FechoOTeste()"
});
formatter.result({
  "status": "passed"
});
});