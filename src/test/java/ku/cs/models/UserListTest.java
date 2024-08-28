package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList ul1;

    @BeforeEach
    void init(){
        ul1 = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        ul1.addUser("Bossinwza","001349");
        ul1.addUser("BossInwza","030847");
        ul1.addUser("MhainwBoss","999999");

        // TODO: find one of them
        User user = ul1.findUserByUsername("Bossinwza");
        // TODO: assert that UserList found User
        String expected = "Bossinwza";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        ul1.addUser("Bossinwza","001349");
        ul1.addUser("BossInwza","030847");
        ul1.addUser("MhainwBoss","999999");

        // TODO: change password of one user
        boolean actual = ul1.changePassword("Bossinwza","001349","030847");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        ul1.addUser("Bossinwza","001349");
        ul1.addUser("BossInwza","030847");
        ul1.addUser("MhainwBoss","999999");

        // TODO: call login() with correct username and password
        User user = ul1.login("BossInwza","030847");
        // TODO: actual assert that User object is found
        assertEquals(ul1.findUserByUsername("BossInwza"), user);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        ul1.addUser("Bossinwza","001349");
        ul1.addUser("BossInwza","030847");
        ul1.addUser("MhainwBoss","999999");

        // TODO: call login() with incorrect username or incorrect password
        User user = ul1.login("BossInwza","999999");
        // TODO: assert that the method return null
        assertNull(user);
    }
    @Test
    @DisplayName("Add user")
    public void testAddUser() {
        ul1.addUser("Bossza007","000000");
        assertNotNull(ul1.findUserByUsername("Bossza007"));
    }
}