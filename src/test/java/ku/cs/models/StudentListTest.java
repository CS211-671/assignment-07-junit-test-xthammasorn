package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList sl1;

    @BeforeEach
    void init(){
        sl1 = new StudentList();
        sl1.addNewStudent("123456","Bossza");
    }

    @Test
    @DisplayName("เพิ่มนักเรียนใน List")
    void addNewStudent(){
        sl1.addNewStudent("123457","Neoinwza");
        assertNotNull(sl1.findStudentById("123457"));
    }

    @Test
    @DisplayName("ค้นหานักเรียนใน List")
    void testFindStudentById(){
        assertEquals("123456",sl1.findStudentById("123456").getId());
    }

    @Test
    @DisplayName("มอบคะแนนให้นักเรียน List")
    void testGiveScoreToId(){
        sl1.giveScoreToId("123456",20);
        assertEquals(20,sl1.findStudentById("123456").getScore());
    }

    @Test
    @DisplayName("ดูเกรดของนักเรียนใน List")
    void viewGradeOfId(){
        sl1.giveScoreToId("123456",20);
        assertEquals("F",sl1.viewGradeOfId("123456"));
    }

}