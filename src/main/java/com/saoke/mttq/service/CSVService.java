package com.saoke.mttq.service;

import java.io.IOException;
import java.util.List;

import com.saoke.mttq.helper.CSVHelper;
import com.saoke.mttq.model.SaokeModel;
import com.saoke.mttq.repository.saokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service
public class CSVService {
    @Autowired
    saokeRepository repository;

    public void save(MultipartFile file) {
        try {
            List<SaokeModel> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<SaokeModel> getAllTutorials() {
        return repository.findAll();
    }
}
