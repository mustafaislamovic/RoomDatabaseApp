package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TodoDao {
    @Insert
    void add(Todo todo);

    @Query("SELECT * FROM todos")
    List<Todo> getAll();

    @Query("SELECT * FROM todos WHERE id=:id LIMIT 1")
    Todo getTodoById(long id);

}
