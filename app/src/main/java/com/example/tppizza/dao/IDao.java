package com.example.tppizza.dao;
import java.util.List;

public interface IDao<T> {
    boolean create(T o);          // Method to create a new object
    boolean update(T o);          // Method to update an existing object
    boolean delete(T o);          // Method to delete an object
    List<T> findAll();            // Method to find all objects, returns a list
    T findById(int id);           // Method to find an object by its ID
}

