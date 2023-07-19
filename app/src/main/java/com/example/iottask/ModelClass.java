package com.example.iottask;

import android.graphics.Bitmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelClass {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("productList")
    @Expose
    private List<Product> productList;

    public ModelClass(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public static class Product {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("unitParams")
        @Expose
        private String unitParams;
        @SerializedName("price")
        @Expose
        private Integer price;
        @SerializedName("specialPrice")
        @Expose
        private Integer specialPrice;
        @SerializedName("rating")
        @Expose
        private Integer rating;
        @SerializedName("productBannner")
        @Expose
        private List<String> productBannner;
        @SerializedName("desc")
        @Expose
        private String desc;
        @SerializedName("productImage")
        @Expose
        private String productImage;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("offer")
        @Expose
        private Integer offer;
        @SerializedName("offerType")
        @Expose
        private String offerType;
        @SerializedName("disc")
        @Expose
        private String disc;
        @SerializedName("manufacturer")
        @Expose
        private String manufacturer;
        @SerializedName("categoryName")
        @Expose
        private String categoryName;
        @SerializedName("categoryId")
        @Expose
        private String categoryId;
        @SerializedName("trending")
        @Expose
        private Boolean trending;
        @SerializedName("discountProduct")
        @Expose
        private Boolean discountProduct;
        @SerializedName("stock")
        @Expose
        private Integer stock;
        @SerializedName("gst")
        @Expose
        private String gst;
        @SerializedName("gstRate")
        @Expose
        private Integer gstRate;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUnitParams() {
            return unitParams;
        }

        public void setUnitParams(String unitParams) {
            this.unitParams = unitParams;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getSpecialPrice() {
            return specialPrice;
        }

        public void setSpecialPrice(Integer specialPrice) {
            this.specialPrice = specialPrice;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public List<String> getProductBannner() {
            return productBannner;
        }

        public void setProductBannner(List<String> productBannner) {
            this.productBannner = productBannner;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getProductImage() {
            return productImage;
        }

        public void setProductImage(String productImage) {
            this.productImage = productImage;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getOffer() {
            return offer;
        }

        public void setOffer(Integer offer) {
            this.offer = offer;
        }

        public String getOfferType() {
            return offerType;
        }

        public void setOfferType(String offerType) {
            this.offerType = offerType;
        }

        public String getDisc() {
            return disc;
        }

        public void setDisc(String disc) {
            this.disc = disc;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public Boolean getTrending() {
            return trending;
        }

        public void setTrending(Boolean trending) {
            this.trending = trending;
        }

        public Boolean getDiscountProduct() {
            return discountProduct;
        }

        public void setDiscountProduct(Boolean discountProduct) {
            this.discountProduct = discountProduct;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }

        public String getGst() {
            return gst;
        }

        public void setGst(String gst) {
            this.gst = gst;
        }

        public Integer getGstRate() {
            return gstRate;
        }

        public void setGstRate(Integer gstRate) {
            this.gstRate = gstRate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

    }
}
