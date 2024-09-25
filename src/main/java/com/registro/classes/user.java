package com.registro.classes;

import org.jetbrains.annotations.NotNull;

public class user {
    @NotNull
    private String name;
    @NotNull
    private String lastname;
    @NotNull
    private String email;
    private String phone;
    private String age;

    public user(@NotNull String name, String age, String phone, @NotNull String email, @NotNull String lastname) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.lastname = lastname;
    }

    public @NotNull String getName() {
        return name;
    }

    public @NotNull String getLastname() {
        return lastname;
    }

    public @NotNull String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAge() {
        return age;
    }
}
