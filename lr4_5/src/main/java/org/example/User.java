package org.example;

enum Role {
    ADMIN,
    USER,
    GUEST
}

public class User {
    private String username;
    private Role role;

    public User(String username, Role role) {
        this.username = username;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void printInfo() {
        System.out.println(username + " — " + role);
    }
}
