package com.example.daftarmakanan;

public class Kuliner {
    private String nama, rasa, deskripsi;
    private int id_gambar;

    public Kuliner(String nama, String rasa, String deskripsi, int id_gambar) {
        this.nama = nama;
        this.rasa = rasa;
        this.deskripsi = deskripsi;
        this.id_gambar = id_gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getRasa() {
        return rasa;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getId_gambar() {
        return id_gambar;
    }
}
