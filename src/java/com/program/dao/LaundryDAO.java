/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.dao;

import java.sql.*;
import java.util.ArrayList;
import com.program.models.LaundryModel;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafif
 */
@Repository
public class LaundryDAO {

    private Connection connection;

    public LaundryDAO() {
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

    public int insertData(LaundryModel itemModel) {
        Statement statement = createStatement();
        int hasil = -1;
        java.util.Date date = new java.util.Date();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(date);
        if (statement != null) {
            String sql = "INSERT INTO laundry (`id_laundry`, `id_jenisjasa`, `id_pelanggan`, `id_petugas` ,`tgl_laundry` , `status`) VALUES("
                    + "'" + itemModel.getId_jenisjasa() + itemModel.getId_pelanggan() + "', "
                    + "'" + itemModel.getId_jenisjasa() + "', "
                    + "'" + itemModel.getId_pelanggan() + "', "
                    + "" + 0 + ","
                    + "'" + currentTime + "',"
                    + 1 + ")";
            try {
                hasil = statement.executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return hasil;
    }

    public int getPetugas(int id, String id_l) {
        Statement statement = createStatement();
        int hasil = -1;
        if (statement != null) {
            String sql = "UPDATE laundry SET "
                    + "id_petugas = " + id + ", "
                    + "WHERE id = '" + id_l + "'";
            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }

    public int setStatus(int status, String id) {
        Statement statement = createStatement();
        int hasil = -1;

        if (statement != null) {
            String sql = "UPDATE laundry SET "
                    + "status = " + status + ", "
                    + "WHERE id = '" + id + "'";
            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }

    public ArrayList<LaundryModel> showData() {
        ArrayList<LaundryModel> dataList = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM laundry";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                dataList = new ArrayList<>();

                try {
                    while (resultSet.next()) {
                        LaundryModel itemModel = new LaundryModel();

                        itemModel.setId_laundry(resultSet.getString(1));
                        itemModel.setId_jenisjasa(resultSet.getInt(2));
                        itemModel.setId_pelanggan(resultSet.getString(3));
                        itemModel.setId_petugas(resultSet.getInt(4));
                        itemModel.setTgl_laundry(resultSet.getDate(5));
                        itemModel.setStatus(resultSet.getInt(6));
                        itemModel.setId(resultSet.getInt(7));

                        dataList.add(itemModel);
                    }
                } catch (SQLException e) {
                }
            }
        }

        return dataList;
    }
    
    public LaundryModel showdatapel(String id) {
        LaundryModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM laundry WHERE id_pelanggan = '" + id + "'";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new LaundryModel();

                try {
                    while (resultSet.next()) {
                        model.setId_laundry(resultSet.getString(1));
                        model.setId_jenisjasa(resultSet.getInt(2));
                        model.setId_pelanggan(resultSet.getString(3));
                        model.setId_petugas(resultSet.getInt(4));
                        model.setTgl_laundry(resultSet.getDate(5));
                        model.setStatus(resultSet.getInt(6));
                        model.setId(resultSet.getInt(7));
                    }
                } catch (SQLException e) {
                }
            }
        }

        return model;
    }

    public LaundryModel showDataAtId(String id) {
        LaundryModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM laundry WHERE id = '" + id + "'";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new LaundryModel();

                try {
                    while (resultSet.next()) {
                        model.setId_laundry(resultSet.getString(1));
                        model.setId_jenisjasa(resultSet.getInt(2));
                        model.setId_pelanggan(resultSet.getString(3));
                        model.setId_petugas(resultSet.getInt(4));
                        model.setTgl_laundry(resultSet.getDate(5));
                        model.setStatus(resultSet.getInt(6));
                        model.setId(resultSet.getInt(7));
                    }
                } catch (SQLException e) {
                }
            }
        }

        return model;
    }
}
