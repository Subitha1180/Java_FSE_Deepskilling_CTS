package student;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void printStudent() {
        Student student = new Student("Subitha", 1001);
        System.out.println("Student Name: " + student.getDetails());
    }
}
