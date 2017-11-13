/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.services;
import com.program.dao.LaundryDAO;
import java.util.List;
import com.program.models.LaundryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rafif
 */
@Service
public class LaundryManager {
    @Autowired
    LaundryDAO dao;
    
    public void addLaundryData(LaundryModel laundryModel) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.insertData(laundryModel);
            if (hasil == 1) {
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            } else {
                System.out.print("<script> alert('Data tidak berhasil ditambahkan'); </script>");
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }
        dao.closeConnection();
    }
    
    public void addPetugas(int petugas,String id) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.getPetugas(petugas,id);
            if (hasil == 1) {
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            } else {
                System.out.print("<script> alert('Data tidak berhasil ditambahkan'); </script>");
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }
        dao.closeConnection();
    }
    
    public void setStatus(int status,String id) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.setStatus(status,id);
            if (hasil == 1) {
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            } else {
                System.out.print("<script> alert('Data tidak berhasil ditambahkan'); </script>");
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }
        dao.closeConnection();
    }
    
    public List<LaundryModel> getAllLaundryData() {
        boolean isSuccess = dao.createConnection();
        List PelangganList = null;

        if (isSuccess) {
            PelangganList = dao.showData();
        }
        dao.closeConnection();
        return PelangganList;
    }

    public LaundryModel getLaundryData(String id) {
        LaundryModel model = null;
        boolean isSuccess = dao.createConnection();

        if (isSuccess) {
            model = dao.showdatapel(id);

            if (model == null) {
                System.out.print("<script> alert('Data tidak ditemukan'); </script>");
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }

        dao.closeConnection();
        return model;
    }
}
