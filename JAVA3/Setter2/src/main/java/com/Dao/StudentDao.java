package com.Dao;

import com.exception.StudentNotFoundException;

public interface StudentDao {
    public void getStudent(int roll_no) throws StudentNotFoundException;
}
