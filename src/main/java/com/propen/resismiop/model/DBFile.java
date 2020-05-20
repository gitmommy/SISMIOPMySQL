package com.propen.resismiop.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "files")
public class DBFile {
    private String no;
    @Id
    private String masaPajak;
    private String namaWP;
    private String lokasi;
    private String pokok;
    private String denda;
    private String jumlah_setoran;
    private String luasTanah;
    private String luasBangunan;
    private String kecamatan;
    private String kelurahan;
    private String cabang;
    private String user;
    private String tanggal;
    private String jam;
    private String nop;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getMasaPajak() {
        return masaPajak;
    }

    public void setMasaPajak(String masaPajak) {
        this.masaPajak = masaPajak;
    }

    public String getNamaWP() {
        return namaWP;
    }

    public void setNamaWP(String namaWP) {
        this.namaWP = namaWP;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getPokok() {
        return pokok;
    }

    public void setPokok(String pokok) {
        this.pokok = pokok;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }

    public String getJumlah_setoran() {
        return jumlah_setoran;
    }

    public void setJumlah_setoran(String jumlah_setoran) {
        this.jumlah_setoran = jumlah_setoran;
    }

    public String getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(String luasTanah) {
        this.luasTanah = luasTanah;
    }

    public String getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(String luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getNop() {
        return nop;
    }

    public void setNop(String nop) {
        this.nop = nop;
    }


    // Getters and Setters (Omitted for brevity)
}