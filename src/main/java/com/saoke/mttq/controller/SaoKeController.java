package com.saoke.mttq.controller;

import com.saoke.mttq.dto.response.PagedResponse;
import com.saoke.mttq.model.SaokeModel;
import com.saoke.mttq.service.SaokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api")
public class SaoKeController {

    @Autowired
    SaokeService saokeService ;

//    @GetMapping("/saoke")
//    public PagedResponse  getSaoke(@RequestParam(defaultValue = "0") int pageNumber, @RequestParam(defaultValue = "3") int size) {
//        Page<SaokeModel> page = saokeService.getSaoke(pageNumber, size);
//
//        List<SaokeModel> saokeModels = page.getContent();
//        int totalItems = (int) page.getTotalElements();
//        int totalPages = page.getTotalPages();
//        int currentPage = page.getNumber() + 1; // +1 vì trang bắt đầu từ 0
//
//        return new PagedResponse(saokeModels, totalItems, totalPages, currentPage);
//    }

    @GetMapping("/saoke")
    public PagedResponse findSaoke(
            @RequestParam(required = false, defaultValue = "") String name,
            @RequestParam(defaultValue = "10/09/2024") String start_date,
            @RequestParam(defaultValue ="14/09/2024") String end_date,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "false") boolean isAscending,//tăng dần
            @RequestParam(defaultValue = "date") String sortBy
    ) {
        PagedResponse pagedResponse = new PagedResponse();

        Page<SaokeModel> results = saokeService.findSaoKe(name,start_date, end_date, pageNumber, size,isAscending, sortBy);

        pagedResponse.setTutorials(results.getContent());
        pagedResponse.setCurrentPage(results.getNumber());
        pagedResponse.setTotalItems((int) results.getTotalElements());
        pagedResponse.setTotalPages(results.getTotalPages());

        return pagedResponse;
    }

}

