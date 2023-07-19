package com.example.iottask.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ProductEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "price")
    public String price;

    @ColumnInfo(name = "categoryName")
    public String categoryName;

    @ColumnInfo(name = "image")
    public String image;

    public ProductEntity(String name, String price, String categoryName, String image) {
        this.name = name;
        this.price = price;
        this.categoryName = categoryName;
        this.image = image;
    }
}
