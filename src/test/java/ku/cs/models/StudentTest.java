package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("1234567","Bossza");
    }
    @Test
    @DisplayName("เพิ่มคะแนน")
    void testAddScore(){
        s1.addScore(40);
        assertEquals(40,s1.getScore()); // เช็คว่าเท่ากันไหม (expect,actual)
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    @DisplayName("คำนวณเกรด")
    void testCalculateGrade(){
        s1.addScore(60);
        assertEquals("C",s1.grade());
    }

    @Test
    @DisplayName("ค้นหา ID")
    void testFindId(){
        assertEquals("1234567",s1.getId());
    }

    @Test
    @DisplayName("เปลี่ยนชื่อ")
    void testChangeName(){
        s1.changeName("Neo");
        assertEquals("Neo",s1.getName());
    }

}