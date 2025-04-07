package ua.mk.berkut.lecture0407.service;

import org.springframework.stereotype.Service;
import ua.mk.berkut.lecture0407.data.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<Student>();

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }
}
