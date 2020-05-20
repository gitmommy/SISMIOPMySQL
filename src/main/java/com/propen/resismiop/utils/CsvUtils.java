package com.propen.resismiop.utils;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.propen.resismiop.model.DBFile;
import org.apache.catalina.User;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CsvUtils {
    private static final CsvMapper mapper = new CsvMapper();
    public static <T> List<T> read(Class<T> clazz, MultipartFile stream) throws IOException {
        CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
        ObjectReader reader = mapper.readerFor(clazz).with(schema);
        System.err.println(schema + " HAHAHA " + reader);
        return reader.<T>readValues(stream.getInputStream()).readAll();
    }
}
