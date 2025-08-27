/**
 * TNG Digital Sdn Bhd Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.BaseBuilderDemo;

/**
 * @author Guo Xi'an
 * @description: 最基础的建造者模式
 */
public class User {
    private final String name;
    private final int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User(this);
            if (user.getAge() < 10) {
                throw new IllegalArgumentException("User age must be greater than 10");
            }
            return user;
        }
    }

    public static void main(String[] args) {
        User user = User.newBuilder().age(11).name("Guo Xi'an").build();
    }

}