package com.vik.design.patterns.builder;

public class Student {

    public final String firstName;
    public final String lastName;

    public Student(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Student(final Builder builder) {
        this.firstName = builder.fName;
        this.lastName = builder.lName;
    }

    public static class Builder {
        private String fName;
        private String lName;

        public Builder() {}

        public Builder addFirstName(final String firstName) {
            this.fName = firstName;
            return this;
        }

        public Builder addLastName(final String lastName) {
            this.lName = lastName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}
