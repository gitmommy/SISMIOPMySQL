package com.propen.resismiop.controller;

import com.propen.resismiop.model.DBFile;
import com.propen.resismiop.model.DataTransaksiModel;
import com.propen.resismiop.sevice.RekonsiliasiService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

@RestController
public class FileController extends DBFile{

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private static RekonsiliasiService rekonsiliasiService;





    @PostMapping("/uploadFile")
    public static void uploadFile(@RequestParam("file") MultipartFile file, HttpServletResponse response) throws IOException {
        System.err.println(file.getContentType());
        //DBFile dbFile = dbFileStorageService.storeFile(file);
        if(file.getContentType().equalsIgnoreCase("application/vnd.ms-excel")) {
//            read.saveAll(CsvUtils.read(DBFile.class, file));
            InputStreamReader input = new InputStreamReader(file.getInputStream());
            CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);
            for (CSVRecord record : csvParser) {
                String nama = record.get("nama_wp");
                String masa = record.get("masa_pajak");
                String tanggal = record.get("tanggal");
                String denda = record.get("denda");
                String jumlahSetoran = record.get("jumlah_setoran");
                String pokok = record.get("pokok");
                String luasTanah = record.get("luas_tanah");
                String luasBangunan = record.get("luas_bangunan");

                try{
                    Collection<String> results = rekonsiliasiService.getDenda(tanggal,nama,masa);
                }
                catch (NullPointerException e){
                    System.err.println("MASUK");
                }




            }


            response.sendRedirect("/rekonsiliasi");
        }
        else {
            response.sendRedirect("/rekonsiliasi");
        }
    }
}
//    @PostMapping("/uploadMultipleFiles")
//    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//        return Arrays.asList(files)
//                .stream()
//                .map(file -> uploadFile(file))
//                .collect(Collectors.toList());
//    }
//
//    @GetMapping("/downloadFile/{fileId}")
//    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
//        // Load file from database
//        DBFile dbFile = dbFileStorageService.getFile(fileId);
//
//        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType(dbFile.getFileType()))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbFile.getFileName() + "\"")
//                .body(new ByteArrayResource(dbFile.getData()));
//    }
//
//}