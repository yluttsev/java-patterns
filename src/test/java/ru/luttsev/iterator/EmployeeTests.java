package ru.luttsev.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTests {

    @Test
    public void testGetSkillsForEmployee() {
        String[] skills = new String[] { "Java", "PostgreSQL", "Apache Kafka", "Spring" };
        Employee employee = new Employee(
                "Ivan",
                skills
        );
        int counter = 0;
        for (String skill : employee) {
            Assertions.assertEquals(skill, skills[counter++]);
        }
    }
}
