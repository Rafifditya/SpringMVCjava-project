/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.dao;

import java.sql.*;
import java.util.ArrayList;
import com.program.models.JenisJasaModel;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafif
 */
@Repository
public class JenisJasaDAO {

    private Connection connection;

    public JenisJasaDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        connection = null;
    }

    public boolean createConnection() {
        String url = "jdbc:mysql://localhost:3306/laundry";
        String username = "root";
        String password = "";

        boolean isSuccess = true;

        try {
            connection = DriverManager.getConnection(url, username, password); // Membuat koneksi ke database
        } catch (Exception e) {
            isSuccess = false;
            e.printStackTrace();
        }

        return isSuccess;
    }

    public boolean closeConnection() {
        boolean isSuccess = true;

        try {
            connection.close();
        } catch (Exception e) {
            isSuccess = false;
            e.printStackTrace();
        }

        return isSuccess;
    }

    private Statement createStatement() {
        Statement statement = null;

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
        }

        return statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public ArrayList<JenisJasaModel> showData() {
        ArrayList<JenisJasaModel> dataList = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM data_makanan";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                dataList = new ArrayList<>();

                try {
                    while (resultSet.next()) {
                        JenisJasaModel itemModel = new JenisJasaModel();

                        itemModel.setId_jenis_jasa(resultSet.getInt(1));
                        itemModel.setNama(resultSet.getString(2));
                        itemModel.setHarga(resultSet.getInt(3));
                        dataList.add(itemModel);
                    }
                } catch (SQLException e) {
                }
            }
        }

        return dataList;
    }
    
    public JenisJasaModel showDataAtId(int id) {
        JenisJasaModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM data_makanan WHERE id = " + id;
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new JenisJasaModel();

                try {
                    while (resultSet.next()) {
                        model.setId_jenis_jasa(resultSet.getInt(1));
                        model.setNama(resultSet.getString(2));
                        model.setHarga(resultSet.getInt(3));
                        
                    }
                } catch (SQLException e) {
                }
            }
        }
        return model;
    }
}
