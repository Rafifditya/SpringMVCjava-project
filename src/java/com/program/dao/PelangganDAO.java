package com.program.dao;

import java.sql.*;
import java.util.ArrayList;
import com.program.models.PelangganModel;
import org.springframework.stereotype.Repository;

@Repository
public class PelangganDAO {
    
    private Connection connection;

    public PelangganDAO() {
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

    public int insertData(PelangganModel itemModel) {
        Statement statement = createStatement();
        int hasil = -1;
        java.sql.Date date = new java.sql.Date(java.util.Calendar.getInstance().getTime().getTime());

        if (statement != null) {
            String sql = "INSERT INTO pelanggan(`id_u`, `nama_u`, `alamat_u`, `username_u`, `nohp_u`, `email_u`, `password_u`, `active`) VALUES("
                    + "'LL" + itemModel.getId()+ "', "
                    + "'" + itemModel.getNama_u() + "', "
                    + "'" + itemModel.getAlamat_u() + "', "
                    + "'" + itemModel.getUsername_u() + "', "
                    + itemModel.getNohp_u() + ", "
                    + "'" + itemModel.getEmail_u()+ "', "
                    + "'" + itemModel.getPassword_u() + "', "
                    + "0)";
            try {
                hasil = statement.executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return hasil;
    }

    public int updateData(PelangganModel itemModel) {
        Statement statement = createStatement();
        int hasil = -1;

        if (statement != null) {
            String sql = "UPDATE pelanggan SET "
                    + "nama_u = '" + itemModel.getNama_u() + "', "
                    + "alamat_u = '" + itemModel.getAlamat_u() + "', "
                    + "username_u = '" + itemModel.getUsername_u() + "', "
                    + "nohp_u = " + itemModel.getNohp_u() + ", "
                    + "email_u = '" + itemModel.getEmail_u() + "', "
                    + "password_u = '" + itemModel.getPassword_u() + "' "
                    + "WHERE id = '" + itemModel.getId_u() +"'";

            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }
    

    public ArrayList<PelangganModel> showData() {
        ArrayList<PelangganModel> dataList = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM pelanggan";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                dataList = new ArrayList<>();

                try {
                    while (resultSet.next()) {
                        PelangganModel itemModel = new PelangganModel();
                        
                        itemModel.setId(resultSet.getInt(1));
                        itemModel.setId_u(resultSet.getString(2));
                        itemModel.setNama_u(resultSet.getString(3));
                        itemModel.setAlamat_u(resultSet.getString(4));
                        itemModel.setUsername_u(resultSet.getString(5));
                        itemModel.setNohp_u(resultSet.getInt(6));
                        itemModel.setEmail_u(resultSet.getString(7));
                        itemModel.setPassword_u(resultSet.getString(8));
                        itemModel.setActive(resultSet.getInt(9));

                        dataList.add(itemModel);
                    }
                } catch (SQLException e) {
                }
            }
        }

        return dataList;
    }

    public PelangganModel showDataAtId(String id) {
        PelangganModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM pelanggan WHERE id_u = '" + id +"'";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new PelangganModel();

                try {
                    while (resultSet.next()) {
                        model.setId(resultSet.getInt(1));
                        model.setId_u(resultSet.getString(2));
                        model.setNama_u(resultSet.getString(3));
                        model.setAlamat_u(resultSet.getString(4));
                        model.setUsername_u(resultSet.getString(5));
                        model.setNohp_u(resultSet.getInt(6));
                        model.setEmail_u(resultSet.getString(7));
                        model.setPassword_u(resultSet.getString(8));
                        model.setActive(resultSet.getInt(9));

                    }
                } catch (SQLException e) {
                }
            }
        }

        return model;
    }
    
    public int Activator(int id){
     Statement statement = createStatement();
        int hasil = -1;

        if (statement != null) {
            String sql = "UPDATE pelanggan SET "
                    + "id_u = 'LL" + id + "', "
                    + "active = 1 "
                    + "WHERE id = " + id +"";

            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }
    
    public int SetActive(int id, int idp){
     Statement statement = createStatement();
        int hasil = -1;

        if (statement != null) {
            String sql = "UPDATE pelanggan SET "
                    + "active = "+ id +" "
                    + "WHERE id = " + idp +"";

            try {
                hasil = statement.executeUpdate(sql);
            } catch (SQLException e) {
            }
        }

        return hasil;
    }
    
    public PelangganModel showDataUsername(String id) {
        PelangganModel model = null;
        Statement statement = createStatement();

        if (statement != null) {
            String sql = "SELECT * FROM pelanggan WHERE username_u = '" + id +"'";
            ResultSet resultSet = null;

            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException e) {
            }

            if (resultSet != null) {
                model = new PelangganModel();

                try {
                    while (resultSet.next()) {
                        model.setId(resultSet.getInt(1));
                        model.setId_u(resultSet.getString(2));
                        model.setNama_u(resultSet.getString(3));
                        model.setAlamat_u(resultSet.getString(4));
                        model.setUsername_u(resultSet.getString(5));
                        model.setNohp_u(resultSet.getInt(6));
                        model.setEmail_u(resultSet.getString(7));
                        model.setPassword_u(resultSet.getString(8));
                        model.setActive(resultSet.getInt(9));

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
            String sql = "DELETE FROM pelanggan WHERE id_u = '" + id +"'";
            
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