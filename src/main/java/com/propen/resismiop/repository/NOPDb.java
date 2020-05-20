package com.propen.resismiop.repository;


//import com.propen.resismiop.model.DataTransaksiModel;

import com.propen.resismiop.model.DataTransaksiModel;
import com.propen.resismiop.model.NOPModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NOPDb extends JpaRepository<NOPModel, Long> {
    List<DataTransaksiModel> findByNop(Long nop);
//    NOPModel findByNop(Long nop);
}
