package com.book.demo.dto;

import com.book.demo.entity.BookDetailsEntity;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class BookDetailsDTO {
    private String bookName;
    @NotEmpty(message = "Description cannot be empty buddy")
    private String bookDesc;
    private double bookPrice;
    private String imagePath;

    public BookDetailsDTO(){

    }
    public BookDetailsDTO(String bookName, String bookDesc, double bookPrice, String imagePath) {
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.bookPrice = bookPrice;
        this.imagePath = imagePath;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public BookDetailsEntity toEntity (){
        BookDetailsEntity bookEntity = new BookDetailsEntity();
        bookEntity.setBookName(this.bookName);
        bookEntity.setBookDesc(this.bookDesc);
        bookEntity.setBookPrice(this.bookPrice);
        bookEntity.setImagePath(this.imagePath);
        return bookEntity;
    }

//    public static List<BookDetailsDTO> fromEntity(List<BookDetailsEntity> entityList) {
//        List<BookDetailsDTO> listBookDTO = new ArrayList<>();
//        entityList.stream().forEach(s -> {
//            BookDetailsDTO bookDTO = new BookDetailsDTO();
//            bookDTO.setBookName(s.getBookName());
//            bookDTO.setBookDesc(s.getBookDesc());
//            listBookDTO.add(bookDTO);
//        });
//        return listBookDTO;
//    }

    public static BookDetailsDTO singleEntityConversion (BookDetailsEntity singleEntity){
        BookDetailsDTO singleDTO = new BookDetailsDTO();
        singleDTO.setBookName(singleEntity.getBookName());
        singleDTO.setBookDesc(singleEntity.getBookDesc());

        return singleDTO;
    }
}
