/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.models;

import java.io.Serializable;

/**
 *
 * @author Rafif
 */
public class PetugasModel implements Serializable{
    private int id_p,nohp_p;
    private String nama_p, username_p,password_p,alamat_p;

    public PetugasModel() {
        this.id_p = 0;
        this.nohp_p = 0;
        this.nama_p = "";
        this.username_p = "";
        this.password_p = "";
        this.alamat_p = "";
    }

    
    @Override
    public String toString() {
        return "PetugasModel{" + "id_p=" + id_p + ", nohp_p=" + nohp_p + ", nama_p=" + nama_p + ", username_p=" + username_p + ", password_p=" + password_p + ", alamat_p=" + alamat_p + '}';
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public int getNohp_p() {
        return nohp_p;
    }

    public void setNohp_p(int nohp_p) {
        this.nohp_p = nohp_p;
    }

    public String getNama_p() {
        return nama_p;
    }

    public void setNama_p(String nama_p) {
        this.nama_p = nama_p;
    }

    public String getUsername_p() {
        return username_p;
    }

    public void setUsername_p(String username_p) {
        this.username_p = username_p;
    }

    public String getPassword_p() {
        return password_p;
    }

    public void setPassword_p(String password_p) {
        this.password_p = password_p;
    }

    public String getAlamat_p() {
        return alamat_p;
    }

    public void setAlamat_p(String alamat_p) {
        this.alamat_p = alamat_p;
    }
}
