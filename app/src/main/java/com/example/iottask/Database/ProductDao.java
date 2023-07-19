package com.example.iottask.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * FROM ProductEntity")
    List<ProductEntity> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAddress(ProductEntity varargs);


}
