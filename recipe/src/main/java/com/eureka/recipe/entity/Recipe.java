package com.eureka.recipe.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "icecream_id")
    private Long icecreamId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Float price;

    @Column(name = "status")
    private Short status;

    @Column(name = "view_count")
    private int viewCount;

    @Column(name = "image")
    private String image;

    @Column(name = "detail")
    private String detail;

    @Column(name = "uploaded_date")
    private Timestamp uploadedDate;

    public Recipe() {

    }

    public Recipe(Long id, Long userId, Long icecreamId, String title, String description, Float price, Short status, int viewCount, String image, String detail, Timestamp uploadedDate) {
        this.id = id;
        this.userId = userId;
        this.icecreamId = icecreamId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.status = status;
        this.viewCount = viewCount;
        this.image = image;
        this.detail = detail;
        this.uploadedDate = uploadedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIcecreamId() {
        return icecreamId;
    }

    public void setIcecreamId(Long icecreamId) {
        this.icecreamId = icecreamId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Timestamp getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(Timestamp uploadedDate) {
        this.uploadedDate = uploadedDate;
    }
}
