package com.saoke.mttq.repository;

import com.saoke.mttq.model.SaokeModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface saokeRepository  extends JpaRepository<SaokeModel, Long> {

    @Query("select v from SaokeModel v where v.date between :start_date and :end_date AND v.description LIKE %:name%")
    Page<SaokeModel> findSaoKeQuery(@Param("name") String name,
                        @Param("start_date") String start_date
                                    , @Param("end_date") String end_date,

                        Pageable pageable);
}