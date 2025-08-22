package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    @DisplayName("Test readData returns correct StudentList")
    void testReadData() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList studentList = datasource.readData();

        assertEquals(4, studentList.getStudents().size());

        Student first = studentList.findStudentById("6710400001");
        assertNotNull(first);
        assertEquals("First", first.getName());

        assertNotNull(studentList.findStudentById("6710400002"));
        assertNotNull(studentList.findStudentById("6710400003"));
        assertNotNull(studentList.findStudentById("6710400004"));

        assertNull(studentList.findStudentById("9999999999"));
    }
}

