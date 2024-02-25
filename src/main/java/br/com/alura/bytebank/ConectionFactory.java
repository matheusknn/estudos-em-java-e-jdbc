package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

    public Connection RecuperarConexaoComOBanco() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=m4th3us1");//abrindo conexão com o banco
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
