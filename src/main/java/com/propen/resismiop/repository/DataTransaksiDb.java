package com.propen.resismiop.repository;


import com.propen.resismiop.model.DataTransaksiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;




public interface DataTransaksiDb extends JpaRepository<DataTransaksiModel, Long> {

    @Query(value = "select d.denda from DataTransaksi d WHERE d.tanggal=:x AND d.nama = :y AND d.masaPajak=:z", nativeQuery = true)
    Collection<String> findAllDenda(String x,String y,String z);

}
