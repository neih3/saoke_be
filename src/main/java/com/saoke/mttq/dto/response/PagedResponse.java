package com.saoke.mttq.dto.response;

import com.saoke.mttq.model.SaokeModel;

import java.util.List;

public class PagedResponse {
    private List<SaokeModel> saokeList;
    private int totalItems;
    private int totalPages;
    private int currentPage;

    public PagedResponse(){

    }

    public PagedResponse(List<SaokeModel> tutorials, int totalItems, int totalPages, int currentPage) {
        this.saokeList = tutorials;
        this.totalItems = totalItems;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<SaokeModel> getTutorials() {
        return saokeList;
    }

    public void setTutorials(List<SaokeModel> tutorials) {
        this.saokeList = tutorials;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
