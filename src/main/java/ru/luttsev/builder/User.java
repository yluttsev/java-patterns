package ru.luttsev.builder;

import java.time.LocalDate;

/**
 * Класс сущности пользователя в БД, реализующий паттерн Builder
 * @author Yuri Luttsev
 */
public class User {
    private Long id;
    private String username;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthday;
    private String address;
    private Role role;

    /**
     * Приватный конструктор для создания пользователя на основе билдера
     * @param builder Внутренний класс билдера {@link UserBuilder}
     */
    private User(UserBuilder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.birthday = builder.birthday;
        this.address = builder.address;
        this.role = builder.role;
    }

    /**
     * Метод для получения билдера
     * @return Билдер класса
     */
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Внутренний класс билдера
     */
    public static class UserBuilder {
        private Long id;
        private String username;
        private String firstName;
        private String middleName;
        private String lastName;
        private LocalDate birthday;
        private String address;
        private Role role;

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder role(Role role) {
            this.role = role;
            return this;
        }

        /**
         * Метод для создания конечного экземпляра пользователя
         * @return Экземпляр пользователя
         */
        public User build() {
            return new User(this);
        }
    }
}
