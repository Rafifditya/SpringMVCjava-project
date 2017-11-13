/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.services;

import com.program.dao.AdminDAO;
import java.util.List;
import com.program.models.PetugasModel;
import org.springframework.stereotype.Service;
import com.program.dao.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Rafif
 */
@Service
public class PetugasManager {
    @Autowired
    AdminDAO dao;
    
    public List<PetugasModel> getAllAdminData()
    {
        boolean isSuccess = dao.createConnection();
        List PetugasList = null;
        
        if (isSuccess) {
            PetugasList = dao.showData();
        }
        dao.closeConnection();
        return PetugasList;
    }
    
    public PetugasModel getPetugasData(int id)
    {
        PetugasModel model = null;
        boolean isSuccess = dao.createConnection();

        if (isSuccess) {
            model = dao.showDataAtId(id);

            if (model == null)
                System.out.print("<script> alert('Data tidak ditemukan'); </script>");
        } else
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        
        dao.closeConnection();
        return model;
    }
    
    public PetugasModel getPetugasUsername(String id)
    {
        PetugasModel model = null;
        boolean isSuccess = dao.createConnection();

        if (isSuccess) {
            model = dao.showDataUsername(id);

            if (model == null)
                System.out.print("<script> alert('Data tidak ditemukan'); </script>");
        } else
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        
        dao.closeConnection();
        return model;
    }
    
    public void addPetugasData(PetugasModel petugasModel)
    {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.insertData(petugasModel);
            if (hasil == 1)
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            else
                System.out.print("<script> alert('Data tidak berhasil ditambahkan'); </script>");
        } else
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        dao.closeConnection();
    }
    
    public void updatePetugasData(PetugasModel petugasModel)
    {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.updateData(petugasModel);
            if (hasil == 1)
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            else
                System.out.print("Gagal"+ petugasModel.toString());
        } else
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        dao.closeConnection();
        
    }
    
    public void deletePelangganData(String id)
    {
        boolean isSuccess = dao.createConnection();
        if (isSuccess) {
            int hasil = dao.deleteData(id);
            if (hasil == 1)
                System.out.print("<script> alert('Data berhasil ditambahkan'); </script>");
            else
                System.out.print("<script> alert('Data tidak berhasil ditambahkan'); </script>");
        } else
            System.out.print("<script> alert('Koneksi gagal dibuat'); </script>");
        dao.closeConnection();
    }
}
