package info.tregmine.database.db;

import java.io.*;
import java.util.*;
import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;

import info.tregmine.database.DAOException;
import info.tregmine.database.IContextFactory;
import info.tregmine.database.IContext;

public class DBContextFactory implements IContextFactory
{
    private BasicDataSource ds;

    public DBContextFactory()
    {
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        } catch (InstantiationException ex) {
            throw new RuntimeException(ex);
        }

        String user = null, password = null, url = null;
        try {
            Properties settings = new Properties();
            settings.load(new FileInputStream("mysql.cfg"));
            url = settings.getProperty("url");
            user = settings.getProperty("user");
            password = settings.getProperty("password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ds = new BasicDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setMaxActive(5);
        ds.setMaxIdle(5);
        ds.setDefaultAutoCommit(true);
    }

    @Override
    public IContext createContext()
    throws DAOException
    {
        try (Connection conn = ds.getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                stmt.execute("SET NAMES utf8");
            }

            return new DBContext(conn);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
}
