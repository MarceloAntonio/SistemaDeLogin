package SistemaDeLogin;

import java.sql.PreparedStatement;



//Classe para armazenar as informações sobre o banco de dados
public class InformacoesDataBase {

    //Script que vai rodar no banco de dados
    private String sql = "SELECT senha FROM login WHERE nome = ?"; //Seleciona a senha do usuario que será definido

    private String url = "jdbc:postgresql://localhost:5432/postgres"; //Endereço do Banco de dados
    private String user = "postgres"; //Usuario do banco de dados
    private String password = "postgres";//Senha do banco de dados


    //gets

    public String getSql() {
        return sql;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }


}

