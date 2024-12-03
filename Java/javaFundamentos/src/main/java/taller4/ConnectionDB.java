/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jopalaci
 * La base datos se creó con docker en local usando la sentencia
 * docker run --name netec -e MYSQL_ROOT_PASSWORD=sasa -p 3301:3306/tcp -d mysql:8.2 
 */
public class ConnectionDB {
    private String jdbcUrl ="jdbc:mysql://localhost:3301/caja";
    private String userDB="root";
    private String password="sasa";
    public Connection doConnectionDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(jdbcUrl, userDB, password);
            return connection;
        }catch(Exception e){
            System.out.println("e");
            return null;
        }
    }
    
    
}
