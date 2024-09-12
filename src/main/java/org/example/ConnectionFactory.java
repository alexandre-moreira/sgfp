package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=8088");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}