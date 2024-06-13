package ru.luttsev.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testEqualsFields() {
        String firstName = "Alex";
        Long id = 10L;
        User user = User.builder()
                .id(id)
                .firstName(firstName)
                .build();
        Assertions.assertAll(
                () -> Assertions.assertEquals(user.getId(), id),
                () -> Assertions.assertEquals(user.getFirstName(), firstName),
                () -> Assertions.assertNull(user.getBirthday())
        );
    }
}
