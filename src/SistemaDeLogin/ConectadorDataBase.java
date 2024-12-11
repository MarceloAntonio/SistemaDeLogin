package SistemaDeLogin;

import java.sql.*;
//classe implementa a interface definida
public class ConectadorDataBase implements LoginInterface {

//Instancia as as informações do banco de dados
    private InformacoesDataBase dbi = new InformacoesDataBase();

//Reutiliza a interface para fazer um sistema de login ao banco de dados
    @Override
    public ResultSet FazerLogin(String usuarioName) {

        try {
            Connection conn = DriverManager.getConnection(dbi.getUrl(), dbi.getUser(), dbi.getPassword()); //Loga no Banco de dados usando as informações na classe InformacoesDataBase
            PreparedStatement ps = conn.prepareStatement(dbi.getSql()); //Executa o Script em sql
            ps.setString(1, usuarioName); //Altera o ? no script para o parametro definido no método
            return ps.executeQuery(); //retorna o resultado recebido do banco
            //catch
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
