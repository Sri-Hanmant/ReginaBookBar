package com.book.demo.dto;

import com.book.demo.entity.BookDetailsEntity;

import javax.validation.constraints.NotEmpty;

public class UpdateBookDetailsDTO {
    private String bookName;
    private String bookDesc;
    private double bookPrice;
    private String imagePath;

    public UpdateBookDetailsDTO() {

    }

    public UpdateBookDetailsDTO(String bookName, String bookDesc, double bookPrice, String imagePath) {
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.bookPrice = bookPrice;
        this.imagePath = imagePath;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    //Check the specific entity that needs to be changed
    public BookDetailsEntity updateSpecificEntityDetails(BookDetailsEntity updateBookEntity) {
        if (!updateBookEntity.getBookName().equals(this.bookName)) {
            updateBookEntity.setBookName(this.bookName);
        } else if (!updateBookEntity.getBookDesc().equals(this.bookDesc)) {
            updateBookEntity.setBookDesc(this.bookDesc);
        } else if (updateBookEntity.getBookPrice() != this.getBookPrice()) {
            updateBookEntity.setBookPrice(this.bookPrice);
        } else if (updateBookEntity.getImagePath().equals(this.imagePath)) {
            updateBookEntity.setImagePath(this.imagePath);
        }
        return updateBookEntity;
    }
}
