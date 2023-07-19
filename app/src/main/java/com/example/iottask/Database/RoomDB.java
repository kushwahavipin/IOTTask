package com.example.iottask.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ProductEntity.class},version = 1)
public abstract class RoomDB extends RoomDatabase {
    private static final String DB_Name="ProductEntity";
    private static RoomDB instance;

    public static synchronized RoomDB getDB(Context context){
        if (instance==null){
            instance= Room.databaseBuilder(context,RoomDB.class,DB_Name)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract ProductDao productDao();
}
