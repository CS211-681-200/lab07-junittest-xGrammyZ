package ku.cs.models;

import javafx.fxml.FXML;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentListTest {

    StudentList studentList;

    @BeforeEach
    void initialize() {
        studentList = new StudentList();
        studentList.addNewStudent("6710000001", "First");
        studentList.addNewStudent("6710000002", "Second");
        studentList.addNewStudent("6710000003", "Third", 70);
    }


    @Test
    @DisplayName("Test addNewStudent")
    void testAddNewStudent(){
        studentList.addNewStudent("6710000003", "Third");
        assertEquals(3, studentList.getStudents().size());

        studentList.addNewStudent("6710000004", "Fourth", 80);
        assertEquals(4, studentList.getStudents().size());
    }

    @Test
    @DisplayName("Test filterByName")
    void testFilterByName(){
        StudentList filteredList = studentList.filterByName("Third");
        assertEquals(1, filteredList.getStudents().size());
    }

    @Test
    @DisplayName("Test giveScoreToId")
    void testGiveScoreToId(){
        studentList.giveScoreToId("6710000003", 10);
        assertEquals(80, studentList.getStudents().get(2).getScore());
    }

    @Test
    @DisplayName("Test viewGradeOfId")
    void testViewGradeOfId(){
        assertEquals("B", studentList.viewGradeOfId("6710000003"));
    }

    @Test
    @DisplayName("Test findStudentById")
    void testFindStudentById(){
        Student student = studentList.findStudentById("6710000003");
        assertEquals("Third", student.getName());
    }

    @Test
    @DisplayName("Test getStudents")
    void testGetStudents(){
        assertEquals(3, studentList.getStudents().size());
    }


}