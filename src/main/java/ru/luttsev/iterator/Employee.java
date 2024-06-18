package ru.luttsev.iterator;

import java.util.Iterator;

public class Employee implements Iterable<String> {
    private String name;
    private String[] skills;

    public Employee(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator<String> iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<String> {
        private int position;

        public EmployeeIterator() {
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < skills.length;
        }

        @Override
        public String next() {
            return skills[position++];
        }
    }
}
