package com.saoke.mttq.service;

import com.saoke.mttq.model.SaokeModel;
import com.saoke.mttq.repository.saokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaokeService {

    @Autowired
    private saokeRepository saoke1Repository;

//    public Page<SaokeModel> getSaoke(int pageNumber, int size) {
//        Page<SaokeModel> page = saoke1Repository.findAll(PageRequest.of(pageNumber, size));
//        return page;
//    }

    public Page<SaokeModel> findSaoKe(String name, String start_date, String  end_date, int pageNumber, int size, boolean isAscending, String sortBy){
        // Thiết lập thứ tự sắp xếp
        Sort sort = isAscending ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        Pageable paging = PageRequest.of(pageNumber, size, sort);

        return saoke1Repository.findSaoKeQuery(name, start_date, end_date, paging);
    }

}
