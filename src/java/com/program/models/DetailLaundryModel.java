/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.models;

/**
 *
 * @author Rafif
 */
public class DetailLaundryModel {
    private int id_detail_laundry,berat,total_harga,waktu;
    private String id_laundry;

    public int getId_detail_laundry() {
        return id_detail_laundry;
    }

    public void setId_detail_laundry(int id_detail_laundry) {
        this.id_detail_laundry = id_detail_laundry;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public String getId_laundry() {
        return id_laundry;
    }

    public void setId_laundry(String id_laundry) {
        this.id_laundry = id_laundry;
    }

    @Override
    public String toString() {
        return "DetailLaundryModel{" + "id_detail_laundry=" + id_detail_laundry + ", berat=" + berat + ", total_harga=" + total_harga + ", waktu=" + waktu + ", id_laundry=" + id_laundry + '}';
    }
}
