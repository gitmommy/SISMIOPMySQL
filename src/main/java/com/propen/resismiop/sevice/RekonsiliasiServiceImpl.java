package com.propen.resismiop.sevice;

import com.propen.resismiop.model.DataTransaksiModel;
import com.propen.resismiop.repository.DataTransaksiDb;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class RekonsiliasiServiceImpl implements RekonsiliasiService {

	@Autowired
	DataTransaksiDb dataTransaksiDb;

	@Override
	public Collection<String> getDenda(String tanggal, String nama, String masaPajak){
		// TODO Auto-generated method stub
		return dataTransaksiDb.findAllDenda(tanggal, nama, masaPajak);
	

//	@Override
//	public Boolean rekonsiliasiCheck(Long nomorTransaksiBank, Long nomorTransaksiBapenda) {
//
//	
//    @Autowired
//    private DataTransaksiBankDb bankDb;
//
//    @Autowired
//    private DataTransaksiDb bapendaDb;
//
//    public Map<String, Object> listPermasalahan = new HashMap<>();


//    public void rekonsiliasi(Long nomorTransaksiBank, Long nomorTransaksiBapenda){
//        List<DataTransaksiBankModel> dataBank = bankDb.findByNomorTransaksi(nomorTransaksiBank);
//        List<DataTransaksiModel> dataBapenda = bapendaDb.findByNomorTransaksi(nomorTransaksiBapenda);
//        if(dataBank.size() != dataBapenda.size()){
//            rekonsiliasi(dataBank, dataBapenda);
//        }
//        if(dataBank.size() == dataBapenda.size()){
//            for(int i)
//
//        }
//    }

//    public void rekonsiliasi (List<DataTransaksiBankModel> bankModels, List<DataTransaksiModel> bapendaModels){
//        if(bankModels.size() > bapendaModels.size()){
//            for(int i = bapendaModels.size() ; i < bankModels.size() ; i++){
//                listPermasalahan.put("bapenda", bankModels.get(i));
//            }
//
//        }
//        if(bankModels.size() < bapendaModels.size()){
//            for(int i = bankModels.size() ; i < bapendaModels.size() ; i++){
//                listPermasalahan.put("bank", bapendaModels.get(i));
//            }
//        }
//        rekonsiliasi(bankModels.get(0).getNomorTransaksi(), bapendaModels.get(0).getNomorTransaksi());
//
//    }

//    public void rekonsiliasi(Long nomorTransaksiBank, Long nomorTransaksiBapenda){
//        List<DataTransaksiBankModel> dataBank = bankDb.findByNomorTransaksi(nomorTransaksiBank);
//        List<DataTransaksiModel> dataBapenda = bapendaDb.findByNomorTransaksi(nomorTransaksiBapenda);
//        if(dataBank.size() != dataBapenda.size()){
//            rekonsiliasi(dataBank, dataBapenda);
//        }
//        if(dataBank.size() == dataBapenda.size()){


//    @Override
//    public Boolean rekonsiliasiCheck(Long nomorTransaksiBank, Long nomorTransaksiBapenda) {
//        List<DataTransaksiBankModel> dataBank = bankDb.findByNomorTransaksi(nomorTransaksiBank);
//        List<DataTransaksiModel> dataBapenda = bapendaDb.findByNomorTransaksi(nomorTransaksiBapenda);
//        boolean flag = true;
//        if(dataBank.size() == dataBapenda.size()){
//            for(int i=0; i<dataBank.size();i++){
//                if (dataBank.get(i).getDenda() != dataBapenda.get(i).getDenda() && dataBank.get(i).getJumlahSetoran() == dataBapenda.get(i).getJumlahSetoran()
//                        || dataBank.get(i).getJumlahSetoran() != dataBapenda.get(i).getJumlahSetoran() && dataBank.get(i).getDenda() == dataBapenda.get(i).getDenda()
//                        || dataBank.get(i).getJumlahSetoran() != dataBapenda.get(i).getJumlahSetoran() && dataBank.get(i).getDenda() != dataBapenda.get(i).getDenda()){
//                    flag= false;
//                }
//            }
//        }
//        if(dataBank.size() != dataBapenda.size()) {
//            flag = false;
//        }
//        return flag;
//    }

}
}
