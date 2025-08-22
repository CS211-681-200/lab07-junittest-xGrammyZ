package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    @BeforeEach
    void initialize() {
        student = new Student("6710000001", "First");
    }

    @Test
    @DisplayName("Test addScore")
    void testAddScore() {
        student.addScore(60);
        assertEquals(60, student.getScore());
        student.addScore(10);
        assertEquals(70, student.getScore());
    }

    @Test
    @DisplayName("Test grade")
    void testGrade() {
        student.addScore(80);
        assertEquals("A", student.grade());
    }

    @Test
    @DisplayName("Test IsId")
    void testIsId() {
        assertTrue(student.isId("6710000001"));
        assertFalse(student.isId("6710000002"));
    }
    @Test
    @DisplayName("Test IsNameContains")
    void testIsNameContains() {
        assertTrue(student.isNameContains("First"));
        assertFalse(student.isNameContains("Second"));
    }

    @Test
    @DisplayName("Test changeName")
    void testChangeName() {
        student.changeName("Second");
        assertEquals("Second", student.getName());

    }

    @Test
    @DisplayName("Test getGrade")
    void testGetGrade() {
        student.addScore(80);
        assertEquals("A", student.getGrade());
    }
    
}