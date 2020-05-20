package com.propen.resismiop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity
public class DataTransaksiModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "tanggal")
    private String tanggal;

    @NotNull
    @Column(name = "no_kohir")
    private String noKohir;

    @NotNull
    @Column(name = "no_urut")
    private String noUrut;

    @NotNull
    @Column(name = "nama_wp")
    private String namaWP;

    @NotNull
    @Column(name = "jam")
    private String jam;

    @NotNull
    @Column(name = "nop")
    private String nop;

    @NotNull
    @Column(name = "denda")
    private String denda;

    @NotNull
    @Column(name = "jumlah_setoran")
    private String jumlahSetoran;

    @NotNull
    @Column(name = "luas_tanah")
    private String luasTanah;

    @NotNull
    @Column(name = "luas_bangunan")
    private String luasBangunan;

    @NotNull
    @Column(name = "kecamatan")
    private String kecamatan;

    @NotNull
    @Column(name = "kelurahan")
    private String kelurahan;

    @NotNull
    @Column(name = "masa_pajak")
    private String masaPajak;

    @NotNull
    @Column(name = "lokasi")
    private String lokasi;

    @NotNull
    @Column(name = "pokok")
    private String pokok;

    @NotNull
    @Column(name = "cabang")
    private String cabang;

    @NotNull
    @Column(name = "User")
    private String user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoKohir() {
        return noKohir;
    }

    public void setNoKohir(String noKohir) {
        this.noKohir = noKohir;
    }

    public String getNoUrut() {
        return noUrut;
    }

    public void setNoUrut(String noUrut) {
        this.noUrut = noUrut;
    }

    public String getNamaWP() {
        return namaWP;
    }

    public void setNamaWP(String namaWP) {
        this.namaWP = namaWP;
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

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }

    public String getJumlahSetoran() {
        return jumlahSetoran;
    }

    public void setJumlahSetoran(String jumlahSetoran) {
        this.jumlahSetoran = jumlahSetoran;
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

    public String getMasaPajak() {
        return masaPajak;
    }

    public void setMasaPajak(String masaPajak) {
        this.masaPajak = masaPajak;
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
}
