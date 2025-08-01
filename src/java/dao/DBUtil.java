/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author HP Victus
 */
import javax.naming.InitialContext;
import javax.naming.Context;
import javax.sql.DataSource;
import java.sql.Connection;
/**
 *
 * @author HP Victus
 */
public class DBUtil {
    private static DataSource ds;

  static {
    try {
      Context ctx = new InitialContext();
      ds = (DataSource)ctx.lookup("java:comp/env/jdbc/WareNexusDS");
    } catch (Exception e) {
      throw new ExceptionInInitializerError(e);
    }
  }

  public static Connection getConnection() throws Exception {
    return ds.getConnection();
  }
}

