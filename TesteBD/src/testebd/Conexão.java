/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author estagio
 */
public class Conexão {
    
    
    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://192.168.1.5:5432/Teste", "postgres", "postgres");
        return conexao;
    }

    
}