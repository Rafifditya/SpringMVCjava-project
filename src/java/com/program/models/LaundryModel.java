/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.models;

import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author Rafif
 */
public class LaundryModel implements Serializable{
    private Date tgl_laundry;
    private int id_jenisjasa,status,id_petugas, id;
    private String id_laundry,id_pelanggan;

    @Override
    public String toString() {
        return "LaundryModel{" + "tgl_laundry=" + tgl_laundry + ", id_jenisjasa=" + id_jenisjasa + ", status=" + status + ", id_petugas=" + id_petugas + ", id_laundry=" + id_laundry + ", id_pelanggan=" + id_pelanggan + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LaundryModel() {
        this.id_jenisjasa=0;
        this.id_pelanggan="";
        this.id_laundry="";
        this.status=0;
        this.id_petugas=0;
    }

    
    public Date getTgl_laundry() {
        return tgl_laundry;
    }

    public void setTgl_laundry(Date tgl_laundry) {
        this.tgl_laundry = tgl_laundry;
    }

    public int getId_jenisjasa() {
        return id_jenisjasa;
    }

    public void setId_jenisjasa(int id_jenisjasa) {
        this.id_jenisjasa = id_jenisjasa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(int id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getId_laundry() {
        return id_laundry;
    }

    public void setId_laundry(String id_laundry) {
        this.id_laundry = id_laundry;
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }
}
