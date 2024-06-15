package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO {

    public String lastOrderId() throws SQLException, ClassNotFoundException ;

    public boolean checkOrderIdExist(String orderId) throws SQLException, ClassNotFoundException ;

    public int addOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;

}
