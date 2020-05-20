package com.propen.resismiop.sevice;

import com.propen.resismiop.model.DataTransaksiModel;

import java.util.Collection;

public interface RekonsiliasiService {
    Collection<String> getDenda(String X, String Y, String Z);
}
