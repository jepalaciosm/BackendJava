/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.sql.Connection;

/**
 *
 * @author Netec
 */
public class conectar_mysql {
    public static void main(String[] args) {
        ConnectionDB conectionDB  =  new ConnectionDB();
        Connection connection = conectionDB.doConnectionDb();        
    }
    
}
