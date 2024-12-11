package SistemaDeLogin;

import java.sql.ResultSet;

//Classe para criar interfaces

public interface LoginInterface {

    //classe retorna um Resultset e tem parametro String
ResultSet FazerLogin(String usuarioName);

}
