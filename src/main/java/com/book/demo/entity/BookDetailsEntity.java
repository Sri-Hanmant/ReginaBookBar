package com.book.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="bookDetails")
public class BookDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "bookName")
    private String bookName;
    @Column (name = "bookDesc")
    private String bookDesc;
    @Column (name = "bookPrice")
    private double bookPrice;
    @Column (name = "imagePath")
    private String imagePath;

    public BookDetailsEntity(){

    }

    public BookDetailsEntity(String bookName, String bookDesc, double bookPrice, String imagePath) {
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.bookPrice = bookPrice;
        this.imagePath = imagePath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "BookDetailsEntity{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", bookPrice=" + bookPrice +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
