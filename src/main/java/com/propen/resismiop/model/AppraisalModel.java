package com.propen.resismiop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AppraisalModel {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
	  	
		@NotNull
	    @Column(name = "Nop")
	    private Long nop;
	 
	  	@NotNull
	    @Column(name = "status")
	    private Boolean status;
	  	
		@NotNull
	    @Column(name = "tanggal")
	    private Date tanggal;
		
	    @NotNull
	    @Column(name = "jumlah_setoran")
	    private Long jumlahSetoran;
	    
	    @NotNull
	    @Column(name = "luas_tanah")
	    private Double luasTanah;

	    @NotNull
	    @Column(name = "luas_bangunan")
	    private Double luasBangunan;

		@Column(name = "alamatPemilik", nullable = false)
		@Size(max = 255)
		private String alamatPemilik;
		
		@Column(name = "namaPemilik", nullable = false)
		@Size(max = 255)
		private String namaPemilik;
	    
		public String getAlamatPemilik() {
			return alamatPemilik;
		}

		public void setAlamatPemilik(String alamatPemilik) {
			this.alamatPemilik = alamatPemilik;
		}

		public String getNamaPemilik() {
			return namaPemilik;
		}

		public void setNamaPemilik(String namaPemilik) {
			this.namaPemilik = namaPemilik;
		}

		public Double getLuasTanah() {
			return luasTanah;
		}

		public void setLuasTanah(Double luasTanah) {
			this.luasTanah = luasTanah;
		}

		public Double getLuasBangunan() {
			return luasBangunan;
		}

		public void setLuasBangunan(Double luasBangunan) {
			this.luasBangunan = luasBangunan;
		}

		public Long getNop() {
			return nop;
		}

		public void setNop(Long nop) {
			this.nop = nop;
		}

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public Date getTanggal() {
			return tanggal;
		}

		public void setTanggal(Date tanggal) {
			this.tanggal = tanggal;
		}

		public long getJumlahSetoran() {
			return jumlahSetoran;
		}
		
		public long getId() {
			return id;
		}


		public void setJumlahSetoran(long jumlahSetoran) {
			this.jumlahSetoran = jumlahSetoran;
		}
}
