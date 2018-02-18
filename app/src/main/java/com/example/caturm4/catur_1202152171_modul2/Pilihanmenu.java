package com.example.caturm4.catur_1202152171_modul2;

public class Pilihanmenu{
    int gambar;
    String nama;
    int harga;
    String komposisi;

    public Pilihanmenu(int gambar, String nama, int harga, String komposisi) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi(){return komposisi;}
}