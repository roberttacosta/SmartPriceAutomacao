#language: pt
@Wig
  Funcionalidade: logar, cadastrar e listar

    Cenário: Login incorreto
      Dado que estou na página de login
      E digito usuário ou senha incorreta
      Quando aperto no botão continuar
      Então é mostrada a mensagem de erro de login
      E fecho o teste

    Cenário: Login correto
      Dado que estou na página de login
      E digito usuário ou senha correta
      Quando aperto no botão continuar
      Então é mostrada a home
      E deslogo
      E fecho o teste

    Cenário: Cadastrar produto
      Dado que estou na página de login
      E digito usuário ou senha correta
      Quando aperto no botão continuar
      E aperto em Cadastro Produto
      E preencho os dados
      E aperto no botão Cadastrar
      Então o produto é cadastrado
      E vejo os produtos cadastrados
      E fecho o teste


    Cenário: listar e editar produto
      Dado que estou na página de login
      E digito usuário ou senha correta
      Quando aperto no botão continuar
      E vejo os produtos cadastrados
      E edito a unidade de medida
      Então a unidade de medida é mudada
      E fecho o teste


    Cenário: listar e excluir produto
      Dado que estou na página de login
      E digito usuário ou senha correta
      Quando aperto no botão continuar
      E vejo os produtos cadastrados
      E excluo o produto
      Então o produto some da lista
      E fecho o teste