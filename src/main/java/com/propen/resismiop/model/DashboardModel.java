package com.propen.resismiop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class DashboardModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    
    @NotNull
    @Column(name = "setor_pbb")
    private Long setorpbb;

	@NotNull
    @Column(name = "tanggal")
    private Date tanggal;
	
    @NotNull
    @Column(name = "kecamatan")
    private String kecamatan;

    @NotNull
    @Column(name = "kelurahan")
    private String kelurahan;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getSetorpbb() {
		return setorpbb;
	}

	public void setSetorpbb(Long setorpbb) {
		this.setorpbb = setorpbb;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
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
}
