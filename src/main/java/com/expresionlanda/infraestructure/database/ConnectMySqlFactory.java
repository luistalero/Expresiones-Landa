package com.expresionlanda.infraestructure.database;

public class ConnectMySqlFactory {
    public static ConnectionDb crearConexion() {
        return new ConnMySql();
    }
}
