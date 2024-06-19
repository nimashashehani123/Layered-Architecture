package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLUtill {



    public  static <T > T execute(String sql , Object... obj) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDbConnection().getConnection();

        PreparedStatement pvsm = connection.prepareStatement(sql);
        int i=0;
        for (Object o : obj){

            pvsm.setObject(i+1,o);

            i++;

        }


        if (sql.contains("SELECT")){



            return (T)pvsm.executeQuery();


        }else {

            return (T)(Boolean)( pvsm.executeUpdate()>0);
        }
    }









}