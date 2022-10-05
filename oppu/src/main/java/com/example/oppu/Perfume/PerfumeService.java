package com.example.oppu.Perfume;

import com.example.oppu.DataNotFoundException;
import com.example.oppu.Perfume.Entity.PerfumeInfo;
import com.example.oppu.Perfume.Entity.PerfumerList;
import com.example.oppu.Perfume.Repository.PerfumeInfoRepository;
//import com.example.oppu.Perfume.Repository.PerfumeRepository;
import com.example.oppu.Perfume.Repository.PerfumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfumeService {

//    private final PerfumeRepository perfumeRepo;
    private final PerfumeInfoRepository perfumeInfoRepo;
    private final PerfumerRepository perfumerRepo;


    @Autowired
    public PerfumeService(PerfumeInfoRepository perfumeInfoRepo, PerfumerRepository perfumerRepo) {
//        this.perfumeRepo = perfumeRepo;
        this.perfumeInfoRepo = perfumeInfoRepo;
        this.perfumerRepo = perfumerRepo;
    }
    @Transactional
    List<PerfumeInfo> getPerfumeList(){
        return perfumeInfoRepo.findByNameAndBrand();
    }

   public PerfumeInfo getPerfumeInfo(String name ) {
       PerfumeInfo infos = perfumeInfoRepo.findByPerfumeName(name);
       if (infos == null) {
           throw new DataNotFoundException(("존재하지 않음"));
       }
       return infos;
   }

   public PerfumerList getPerfumerList(String name){
        PerfumerList perfumerLists = perfumerRepo.findByPerfumeName(name);
       return perfumerLists;
   }


}
