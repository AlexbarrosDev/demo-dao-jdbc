package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    // Objeto de conexão com banco de dados do jdbc.
    private static Connection conn = null;

    // Metodo para se conectar com o banco de dados.
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties(); // props = dados de db.properties.
                String url = props.getProperty("dburl"); // url = a url do campo dburl do arquivo db.properties
                conn = DriverManager.getConnection(url, props); // conn do tipo Connection está recebendo o url e o arquivo props.
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    // Metodo para fechar a minha conexao com o banco de dados.
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    // Metodo para carregar as propriedades que estao definidas no arquivo "db.properties"
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);   // Fazendo a leitura do arquivo db.properties apontado pelo inputStream.
            return props;
        }
        catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    // metodo auxiliar para fechar objeto do tipo Statement.
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    // metodo auxiliar para fechar objeto do tipo ResultSet.
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            }
            catch(SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
