package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface PlaceOrderBo {
    public String generateNewID() throws SQLException, ClassNotFoundException;

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;

    public boolean addOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;

    public boolean addOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException ;
}
