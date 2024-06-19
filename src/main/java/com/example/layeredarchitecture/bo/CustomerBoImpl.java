package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;


import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl implements CustomerBo{
    CustomerDAO customerDAO = new CustomerDAOImpl();

    public ArrayList<CustomerDTO> getAllCustomer()throws SQLException, ClassNotFoundException{

        return customerDAO.getAll();

    }

    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return customerDAO.add(dto);
    }

    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return customerDAO.update(dto);
     }

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {

        return customerDAO.exist(id);

    }

    public String generateNewID() throws SQLException, ClassNotFoundException {


        return customerDAO.generateNewID();
    }


    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.delete(id);
    }


    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.search(id);
         }

}

