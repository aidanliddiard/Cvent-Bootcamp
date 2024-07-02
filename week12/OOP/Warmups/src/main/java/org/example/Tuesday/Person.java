package org.example.Tuesday;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Enter a name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && !email.isBlank() && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Enter a valid email with @");
        }
    }
}
