/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.services;
import com.program.dao.JenisJasaDAO;
import java.util.List;
import com.program.models.JenisJasaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rafif
 */
@Service
public class JenisJasaManager {
    @Autowired
    JenisJasaDAO dao;

    public List<JenisJasaModel> getAllJenisJasa() {
        boolean isSuccess = dao.createConnection();
        List PelangganList = null;

        if (isSuccess) {
            PelangganList = dao.showData();
        }
        dao.closeConnection();
        return PelangganList;
    }
    
    public JenisJasaModel ShowDatabyId(int id) {
        JenisJasaModel model = null;
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
}
