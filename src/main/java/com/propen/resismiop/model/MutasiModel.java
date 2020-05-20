package com.propen.resismiop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class MutasiModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "namaPemohon", nullable = false)
	@Size(max = 255)
	private String namaPemohon;
	
	@Column(name = "nopPemilikAwal", nullable = false)
	@Size(max = 255)
	private String nopPemilikAwal;
	
	@Column(name = "alamatPemohon", nullable = false)
	@Size(max = 255)
	private String alamatPemohon;

	@Column(name = "alamatPemilikAwal", nullable = false)
	@Size(max = 255)
	private String alamatPemilikAwal;
	
	@Column(name = "namaPemilikAwal", nullable = false)
	@Size(max = 255)
	private String namaPemilikAwal;
	
	@Column(name = "luasTanahAwal", nullable = false)
	private int luasTanahAwal;
	
	@Column(name = "luasBangunanAwal", nullable = false)
	private int luasBangunanAwal;
	
	@Column(name = "spptFlag", nullable = false)
	private Boolean spptFlag;
	
	@Column(name = "sknjopFlag", nullable = true)
	private Boolean sknjopFlag;


	public long getId() {
		return id;
	}

	public String getNamaPemohon() {
		return namaPemohon;
	}

	public void setNamaPemohon(String namaPemohon) {
		this.namaPemohon = namaPemohon;
	}

	public String getNopPemilikAwal() {
		return nopPemilikAwal;
	}

	public void setNopPemilikAwal(String nopPemilikAwal) {
		this.nopPemilikAwal = nopPemilikAwal;
	}

	public String getAlamatPemohon() {
		return alamatPemohon;
	}

	public void setAlamatPemohon(String alamatPemohon) {
		this.alamatPemohon = alamatPemohon;
	}

	public String getAlamatPemilikAwal() {
		return alamatPemilikAwal;
	}

	public void setAlamatPemilikAwal(String alamatPemilikAwal) {
		this.alamatPemilikAwal = alamatPemilikAwal;
	}

	public String getNamaPemilikAwal() {
		return namaPemilikAwal;
	}

	public void setNamaPemilikAwal(String namaPemilikAwal) {
		this.namaPemilikAwal = namaPemilikAwal;
	}

	public int getLuasTanahAwal() {
		return luasTanahAwal;
	}

	public void setLuasTanahAwal(int luasTanahAwal) {
		this.luasTanahAwal = luasTanahAwal;
	}

	public int getLuasBangunanAwal() {
		return luasBangunanAwal;
	}

	public void setLuasBangunanAwal(int luasBangunanAwal) {
		this.luasBangunanAwal = luasBangunanAwal;
	}

	public Boolean getSpptFlag() {
		return spptFlag;
	}

	public void setSpptFlag(Boolean spptFlag) {
		this.spptFlag = spptFlag;
	}

	public Boolean getSknjopFlag() {
		return sknjopFlag;
	}

	public void setSknjopFlag(Boolean sknjopFlag) {
		this.sknjopFlag = sknjopFlag;
	}
	
}
