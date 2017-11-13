/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.models;

import java.util.Date;

/**
 *
 * @author Rafif
 */
public class PembayaranModel {
    private String id_pembayaran,id_laundry;
    private int id_petugas,total_Pembayaran;
    private Date tgl_pembayaran;

    public String getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getId_laundry() {
        return id_laundry;
    }

    public void setId_laundry(String id_laundry) {
        this.id_laundry = id_laundry;
    }

    public int getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(int id_petugas) {
        this.id_petugas = id_petugas;
    }

    public int getTotal_Pembayaran() {
        return total_Pembayaran;
    }

    public void setTotal_Pembayaran(int total_Pembayaran) {
        this.total_Pembayaran = total_Pembayaran;
    }

    public Date getTgl_pembayaran() {
        return tgl_pembayaran;
    }

    public void setTgl_pembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
    }

    @Override
    public String toString() {
        return "PembayaranModel{" + "id_pembayaran=" + id_pembayaran + ", id_laundry=" + id_laundry + ", id_petugas=" + id_petugas + ", total_Pembayaran=" + total_Pembayaran + ", tgl_pembayaran=" + tgl_pembayaran + '}';
    }
    
}
