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
public class JenisJasaModel implements Serializable{
    private int id_jenis_jasa, harga;
    private String nama;

    public int getId_jenis_jasa() {
        return id_jenis_jasa;
    }

    public void setId_jenis_jasa(int id_jenis_jasa) {
        this.id_jenis_jasa = id_jenis_jasa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "JenisJasaModel{" + "id_jenis_jasa=" + id_jenis_jasa + ", harga=" + harga + ", nama=" + nama + '}';
    }
    
}
