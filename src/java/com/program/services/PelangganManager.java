/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.services;

import com.program.dao.PelangganDAO;
import java.util.List;
import com.program.models.PelangganModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diknas 113
 */
@Service
public class PelangganManager {

    @Autowired
    PelangganDAO dao;

    public List<PelangganModel> getAllPelangganData() {
        boolean isSuccess = dao.createConnection();
        List PelangganList = null;

        if (isSuccess) {
            PelangganList = dao.showData();
        }
        dao.closeConnection();
        return PelangganList;
    }

    public PelangganModel getPelangganData(String id) {
        PelangganModel model = null;
        boolean isSuccess = dao.createConnection();

        if (isSuccess) {
            model = dao.showDataAtId(id);

            if (model == null) {
                System.out.print("<script> alert('Data tidak ditemukan'); </script>");
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }

        dao.closeConnection();
        return model;
    }

    public PelangganModel getPelangganUsername(String id) {
        PelangganModel model = null;
        boolean isSuccess = dao.createConnection();

        if (isSuccess) {
            model = dao.showDataUsername(id);

            if (model == null) {
                System.out.print("<script> alert('Data tidak ditemukan'); </script>");
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }

        dao.closeConnection();
        return model;
    }

    public void addPelangganData(PelangganModel pelangganModel) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.insertData(pelangganModel);
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

    public void updatePelangganData(PelangganModel pelangganModel) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.updateData(pelangganModel);
            if (hasil == 1) {
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            } else {
                System.out.print("Gagal" + pelangganModel.toString());
            }
        } else {
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        }
        dao.closeConnection();

    }
    
    public void SetActivator(int id, int p) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.SetActive(id, p);
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

    public void Activation(int id) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.Activator(id);
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

    public void deletePelangganData(String id) {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.deleteData(id);
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

}
