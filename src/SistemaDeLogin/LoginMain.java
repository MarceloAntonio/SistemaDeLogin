package SistemaDeLogin;

import java.sql.*;
import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in); // instacia o Scanner

        ConectadorDataBase bdc = new ConectadorDataBase(); //instacia o conector ao banco dedados

        boolean logando = true; // Define um atributo boleano para ser um intrerruptor do loop


        while (logando) { //enquanto logado for true o loop estará ativo

            //informações de login
            System.out.print("Usuario: ");
            String usuarioScan = sc.next();
            System.out.print("Senha: ");
            String senhaScan = sc.next();

            //Define o parametro da função
            ResultSet rs = bdc.FazerLogin(usuarioScan);


            if (rs.next()) { //Se o usuario existir ele continua

                String senhaLogin = rs.getString("senha"); //pega a senha do banco de dados

                if (senhaLogin.equals(senhaScan)) { // checa se a senha definida pelo usuario é a mesma do banco de dados
                    //informa que o login deu certo e o fim do loop
                    System.out.println("\nlogado");
                    logando = false;

                    //caso senha esteja errada
                } else {

                    System.out.println("\nSenha errada\n");
                }

                //caso o usuario não exista
            } else {
                System.out.println("\nUsuario não existe\n");
            }

        }
    }
}

