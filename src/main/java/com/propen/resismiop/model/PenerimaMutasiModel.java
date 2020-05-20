package com.propen.resismiop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PenerimaMutasiModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nama", nullable = false)
	@Size(max = 255)
	private String nama;
	
	@Column(name = "nop", nullable = false)
	@Size(max = 255)
	private String nop;
	
	@Column(name = "alamat", nullable = false)
	@Size(max = 255)
	private String alamat;
	
	@Column(name = "luasTanah", nullable = false)
	private int luasTanah;
	
	@Column(name = "luasBangunan", nullable = false)
	private int luasBangunan;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mutasiId", referencedColumnName = "id", nullable = true)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private MutasiModel mutasiId;

	public long getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNop() {
		return nop;
	}

	public void setNop(String nop) {
		this.nop = nop;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getLuasTanah() {
		return luasTanah;
	}

	public void setLuasTanah(int luasTanah) {
		this.luasTanah = luasTanah;
	}

	public int getLuasBangunan() {
		return luasBangunan;
	}

	public void setLuasBangunan(int luasBangunan) {
		this.luasBangunan = luasBangunan;
	}

	public MutasiModel getMutasiId() {
		return mutasiId;
	}

	public void setMutasiId(MutasiModel mutasiId) {
		this.mutasiId = mutasiId;
	}
}
