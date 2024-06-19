package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;
import java.sql.SQLException;

public class PlaceOrderBoImpl implements PlaceOrderBo{
    OrderDAO orderDAO = new OrderDAOImpl();
    OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return orderDAO.generateNewID();
          }

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(orderId);
    }

    public boolean addOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
       return orderDAO.add(dto);
    }

    public boolean addOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
       return orderDetailsDAO.add(dto);
    }

}
