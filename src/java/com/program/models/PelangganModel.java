package com.program.models;

import java.io.Serializable;

public class PelangganModel implements Serializable{
    private String id_u, nama_u,username_u,email_u,password_u, alamat_u;
    private int id,nohp_u,active;

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public PelangganModel() {
        this.id_u = "";
        this.nama_u = "";
        this.username_u = "";
        this.email_u = "";
        this.password_u = "";
        this.alamat_u = "";
        this.id = 0;
        this.nohp_u = 0;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_u() {
        return id_u;
    }

    public String getAlamat_u() {
        return alamat_u;
    }

    public void setAlamat_u(String alamat_u) {
        this.alamat_u = alamat_u;
    }

    public void setId_u(String id_u) {
        this.id_u = id_u;
    }

    public String getNama_u() {
        return nama_u;
    }

    public void setNama_u(String nama_u) {
        this.nama_u = nama_u;
    }

    public String getUsername_u() {
        return username_u;
    }

    public void setUsername_u(String username_u) {
        this.username_u = username_u;
    }

    public String getEmail_u() {
        return email_u;
    }

    public void setEmail_u(String email_u) {
        this.email_u = email_u;
    }

    public String getPassword_u() {
        return password_u;
    }

    public void setPassword_u(String password_u) {
        this.password_u = password_u;
    }

    public int getNohp_u() {
        return nohp_u;
    }

    public void setNohp_u(int nohp_u) {
        this.nohp_u = nohp_u;
    }

    @Override
    public String toString() {
        return "PelangganModel{" + "id_u=" + id_u + ", nama_u=" + nama_u + ", username_u=" + username_u + ", email_u=" + email_u + ", password_u=" + password_u + ", alamat_u=" + alamat_u + ", nohp_u=" + nohp_u + '}';
    }

}
