package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList users;
    @BeforeEach
    void init(){
        users = new UserList();
    }
    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {

        users.addUser("Boss","1234");
        users.addUser("Neo","12345");
        users.addUser("Keam","1236");
        // TODO: add 3 users to UserList
        // TODO: find one of them

        User user = users.findUserByUsername("Boss");
        // TODO: assert that UserList found User
        String expected = "Boss";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        users.addUser("Boss","1234");
        users.addUser("Neo","12345");
        users.addUser("Keam","1236");

        // TODO: change password of one user
        User user = users.findUserByUsername("Boss");
        String newpass = "5555";
        boolean actual = users.changePassword(user.getUsername(), user.getPassword(), newpass);
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}