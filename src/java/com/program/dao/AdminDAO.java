/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.dao;
import java.sql.*;
import java.util.ArrayList;
import com.program.models.PetugasModel;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafif
 */
@Repository
public class AdminDAO {
    private Connection connection;

    public AdminDAO() {
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

    public int insertData(PetugasModel itemModel) {
        Statement statement = createStatement();
        int hasil = -1;
        java.sql.Date date = new java.sql.Date(java.util.Calendar.getInstance().getTime().getTime());

        if (statement != null) {
            String sql = "INSERT INTO petugas(`nama_p`, `alamat_p`, `username_p`, `nohp_p`,`password_p`) VALUES("
                    + "'" + itemModel.getNama_p() + "', "
                    + "'" + itemModel.getAlamat_p() + "', "
                    + "'" + itemModel.getUsername_p() + "', "
                    + itemModel.getNohp_p() + ", "
                    + "'" + itemModel.getPassword_p() + "')";
            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }

    public int updateData(PetugasModel itemModel) {
        Statement statement = createStatement();
        int hasil = -1;

        if (statement != null) {
            String sql = "UPDATE petugas SET "
                    + "nama_p = '" + itemModel.getNama_p() + "', "
                    + "alamat_p = '" + itemModel.getAlamat_p() + "', "
                    + "username_p = '" + itemModel.getUsername_p() + "', "
                    + "nohp_p = " + itemModel.getNohp_p() + ", "
                    + "password_p = '" + itemModel.getPassword_p() + "' "
                    + "WHERE id_p = '" + itemModel.getId_p() +"'";

            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }
    

    public ArrayList<PetugasModel> showData() {
        ArrayList<PetugasModel> dataList = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM petugas";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                dataList = new ArrayList<>();

                try {
                    while (resultSet.next()) {
                        PetugasModel itemModel = new PetugasModel();

                        itemModel.setNama_p(resultSet.getString(1));
                        itemModel.setAlamat_p(resultSet.getString(2));
                        itemModel.setUsername_p(resultSet.getString(3));
                        itemModel.setNohp_p(resultSet.getInt(4));
                        itemModel.setPassword_p(resultSet.getString(5));

                        dataList.add(itemModel);
                    }
                } catch (SQLException e) {
                }
            }
        }

        return dataList;
    }

    public PetugasModel showDataAtId(int id) {
        PetugasModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM petugas WHERE id = '" + id +"'";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new PetugasModel();

                try {
                    while (resultSet.next()) {
                        model.setId_p(resultSet.getInt(1));
                        model.setNama_p(resultSet.getString(2));
                        model.setAlamat_p(resultSet.getString(5));
                        model.setUsername_p(resultSet.getString(3));
                        model.setNohp_p(resultSet.getInt(6));
                        model.setPassword_p(resultSet.getString(4));

                    }
                } catch (SQLException e) {
                }
            }
        }

        return model;
    }
    
    public PetugasModel showDataUsername(String id) {
        PetugasModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM petugas WHERE username_p = '" + id +"'";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new PetugasModel();

                try {
                    while (resultSet.next()) {
                        model.setId_p(resultSet.getInt(1));
                        model.setNama_p(resultSet.getString(2));
                        model.setAlamat_p(resultSet.getString(5));
                        model.setUsername_p(resultSet.getString(3));
                        model.setNohp_p(resultSet.getInt(6));
                        model.setPassword_p(resultSet.getString(4));

                    }
                } catch (SQLException e) {
                }
            }
        }

        return model;
    }

    public int deleteData(String id) {
        Statement statement = createStatement();
        int hasil = -1;

        if (statement != null) {
            String sql = "DELETE FROM petugas WHERE username_p = '" + id +"'";
            
            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }

    public Connection getConnection() {
        return connection;
    }
}
