## Configuração do Banco de Dados  

- Baixe o driver `postgresql.jar` em [https://jdbc.postgresql.org/download/](https://jdbc.postgresql.org/download/) e selecione a versão mais recente.  
- Coloque o driver na biblioteca externa.  
  (Caso esteja utilizando o IntelliJ, siga este tutorial: [Tutorial de adicionar driver](https://www.notion.so/Tutorial-de-botar-drive-14261d6482058042868cc735933ab077?pvs=4)).  
- Após inserir o driver, acesse o arquivo `InformacoesDataBase.java` para ajustar as variáveis `url` (Endereço), `user` (Usuário) e `password` (Senha), alterando para as respectivas informações do seu banco de dados.  

<div align="center">  
<img src="https://64.media.tumblr.com/b14b512d03f19cda24cb3c5b7ae955dc/tumblr_pk4hjuwlWw1wr43bc_1280.gifv" width="200" height="200">  
  <img src="https://64.media.tumblr.com/9c132ba9431acba59ca094ad6ab42887/tumblr_pk4hjsd8hf1wr43bc_1280.gifv" width="200" height="200"> 
  <img src="https://64.media.tumblr.com/23bfe1fc96f9e0375f84b42c927a574d/tumblr_pk4hjupFAa1wr43bc_1280.gifv" width="200" height="200"> 
</div>  

## Como o Código Funciona?  

- São definidos os parâmetros necessários para acessar o banco de dados (Endereço, Usuário e Senha).  
- A interface é reescrita para criar a função que conecta o banco de dados com o código.  
- Um loop é iniciado e só termina quando o login for bem-sucedido.  
- O usuário insere seu login.  
- O script SQL, injetado pelo código, busca a senha do usuário digitado no banco de dados.  
- A senha digitada pelo usuário é comparada com a senha encontrada no banco.  
- Caso o login seja bem-sucedido, o loop termina e o sucesso da ação é informado.  
- Caso contrário, o usuário será informado sobre o erro no login e o loop recomeçará para uma nova tentativa.  

<div align="center">  
<img src="https://64.media.tumblr.com/9fce648725d44260c89066bcad2f0157/tumblr_pk4hjts7951wr43bc_1280.gifv" width="200" height="200">  
  <img src="https://64.media.tumblr.com/f1bb323f9ca6df470a5642023e6de256/tumblr_pk4hjvPFyA1wr43bc_1280.gifv" width="200" height="200"> 
  <img src="https://64.media.tumblr.com/a7352b1c74964ddba98f516acc197fd7/tumblr_pk4hjsVqKC1wr43bc_1280.gifv" width="200" height="200"> 
</div>  
