package com.propen.resismiop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class SpopModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nop", nullable = false)
	@Size(max = 255)
	private String nop;
	
	@Column(name = "noFormulir", nullable = false)
	@Size(max = 255)
	private String noFormulir;
	
	@Column(name = "namaJalan", nullable = false)
	@Size(max = 255)
	private String namaJalan;

	@Column(name = "kelurahanObj", nullable = false)
	@Size(max = 255)
	private String kelurahanObj;
	
	@Column(name = "blokKavNoObj", nullable = false)
	@Size(max = 255)
	private String blokKavNoObj;
	
	@Column(name = "rtObj", nullable = false)
	private int rtObj;
	
	@Column(name = "rwObj", nullable = false)
	private int rwObj;
	
	@Column(name = "noPersil", nullable = false)
	private int noPersil;
	
	@Column(name = "luasBangunanAwal", nullable = false)
	private int luasBangunanAwal;
	
	@Column(name = "noKtp", nullable = false)
	@Size(max = 255)
	private String noKtp;
	
	@Column(name = "jalanWp", nullable = false)
	@Size(max = 255)
	private String jalanWp;
	
	@Column(name = "blokKavNoSubj", nullable = false)
	@Size(max = 255)
	private String blokKavNoSubj;
	
	@Column(name = "kodePos", nullable = false)
	@Size(max = 255)
	private String kodePos;
	
	@Column(name = "pekerjaan", nullable = false)
	@Size(max = 255)
	private String pekerjaan;
	
	@Column(name = "statusWp", nullable = false)
	@Size(max = 255)
	private String statusWp;
	
	@Column(name = "kelurahanSubj", nullable = false)
	@Size(max = 255)
	private String kelurahanSubj;
	
	@Column(name = "npwp", nullable = false)
	@Size(max = 255)
	private String npwp;
	
	@Column(name = "rtSubj", nullable = false)
	private int rtSubj;
	
	@Column(name = "rwSubj", nullable = false)
	private int rwSubj;
	
	@Column(name = "kabupatenSubj", nullable = false)
	@Size(max = 255)
	private String kabupatenSubj;
	
	@Column(name = "luasBumi", nullable = false)
	private int luasBumi;
	
	@Column(name = "kodeZnt", nullable = false)
	private int kodeZnt;
	
	@Column(name = "jenisBumi", nullable = false)
	@Size(max = 255)
	private String jenisBumi;
	
	@Column(name = "jmlBangunan", nullable = false)
	private int jmlBangunan;
	
	@Column(name = "tglPendataan", nullable = false)
	private Date tglPendataan;
	
	@Column(name = "nipPendata", nullable = false)
	@Size(max = 255)
	private String nipPendata;
	
	@Column(name = "tglPemeriksaan", nullable = false)
	private Date tglPemeriksaan;
	
	@Column(name = "nipPemeriksa", nullable = false)
	@Size(max = 255)
	private String nipPemeriksa;
	
	@Column(name = "tglPerekaman", nullable = false)
	private Date tglPerekaman;
	
	@Column(name = "nipPerekam", nullable = false)
	@Size(max = 255)
	private String nipPerekam;

	public long getId() {
		return id;
	}

	public String getNop() {
		return nop;
	}

	public void setNop(String nop) {
		this.nop = nop;
	}

	public String getNoFormulir() {
		return noFormulir;
	}

	public void setNoFormulir(String noFormulir) {
		this.noFormulir = noFormulir;
	}

	public String getNamaJalan() {
		return namaJalan;
	}

	public void setNamaJalan(String namaJalan) {
		this.namaJalan = namaJalan;
	}

	public String getKelurahanObj() {
		return kelurahanObj;
	}

	public void setKelurahanObj(String kelurahanObj) {
		this.kelurahanObj = kelurahanObj;
	}

	public String getBlokKavNoObj() {
		return blokKavNoObj;
	}

	public void setBlokKavNoObj(String blokKavNoObj) {
		this.blokKavNoObj = blokKavNoObj;
	}

	public int getRtObj() {
		return rtObj;
	}

	public void setRtObj(int rtObj) {
		this.rtObj = rtObj;
	}

	public int getRwObj() {
		return rwObj;
	}

	public void setRwObj(int rwObj) {
		this.rwObj = rwObj;
	}

	public int getNoPersil() {
		return noPersil;
	}

	public void setNoPersil(int noPersil) {
		this.noPersil = noPersil;
	}

	public int getLuasBangunanAwal() {
		return luasBangunanAwal;
	}

	public void setLuasBangunanAwal(int luasBangunanAwal) {
		this.luasBangunanAwal = luasBangunanAwal;
	}

	public String getNoKtp() {
		return noKtp;
	}

	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}

	public String getJalanWp() {
		return jalanWp;
	}

	public void setJalanWp(String jalanWp) {
		this.jalanWp = jalanWp;
	}

	public String getBlokKavNoSubj() {
		return blokKavNoSubj;
	}

	public void setBlokKavNoSubj(String blokKavNoSubj) {
		this.blokKavNoSubj = blokKavNoSubj;
	}

	public String getKodePos() {
		return kodePos;
	}

	public void setKodePos(String kodePos) {
		this.kodePos = kodePos;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public String getStatusWp() {
		return statusWp;
	}

	public void setStatusWp(String statusWp) {
		this.statusWp = statusWp;
	}

	public String getKelurahanSubj() {
		return kelurahanSubj;
	}

	public void setKelurahanSubj(String kelurahanSubj) {
		this.kelurahanSubj = kelurahanSubj;
	}

	public String getNpwp() {
		return npwp;
	}

	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}

	public int getRtSubj() {
		return rtSubj;
	}

	public void setRtSubj(int rtSubj) {
		this.rtSubj = rtSubj;
	}

	public int getRwSubj() {
		return rwSubj;
	}

	public void setRwSubj(int rwSubj) {
		this.rwSubj = rwSubj;
	}

	public String getKabupatenSubj() {
		return kabupatenSubj;
	}

	public void setKabupatenSubj(String kabupatenSubj) {
		this.kabupatenSubj = kabupatenSubj;
	}

	public int getLuasBumi() {
		return luasBumi;
	}

	public void setLuasBumi(int luasBumi) {
		this.luasBumi = luasBumi;
	}

	public int getKodeZnt() {
		return kodeZnt;
	}

	public void setKodeZnt(int kodeZnt) {
		this.kodeZnt = kodeZnt;
	}

	public String getJenisBumi() {
		return jenisBumi;
	}

	public void setJenisBumi(String jenisBumi) {
		this.jenisBumi = jenisBumi;
	}

	public int getJmlBangunan() {
		return jmlBangunan;
	}

	public void setJmlBangunan(int jmlBangunan) {
		this.jmlBangunan = jmlBangunan;
	}

	public Date getTglPendataan() {
		return tglPendataan;
	}

	public void setTglPendataan(Date tglPendataan) {
		this.tglPendataan = tglPendataan;
	}

	public String getNipPendata() {
		return nipPendata;
	}

	public void setNipPendata(String nipPendata) {
		this.nipPendata = nipPendata;
	}

	public Date getTglPemeriksaan() {
		return tglPemeriksaan;
	}

	public void setTglPemeriksaan(Date tglPemeriksaan) {
		this.tglPemeriksaan = tglPemeriksaan;
	}

	public String getNipPemeriksa() {
		return nipPemeriksa;
	}

	public void setNipPemeriksa(String nipPemeriksa) {
		this.nipPemeriksa = nipPemeriksa;
	}

	public Date getTglPerekaman() {
		return tglPerekaman;
	}

	public void setTglPerekaman(Date tglPerekaman) {
		this.tglPerekaman = tglPerekaman;
	}

	public String getNipPerekam() {
		return nipPerekam;
	}

	public void setNipPerekam(String nipPerekam) {
		this.nipPerekam = nipPerekam;
	}
	
}
