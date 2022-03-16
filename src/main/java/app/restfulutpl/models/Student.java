package app.restfulutpl.models;

import org.springframework.hateoas.ResourceSupport;

public class Student extends ResourceSupport {
    private int studentId;
    private String fullName;
    private String email;
    private int age;
    private int subjectId;

    public Student(int id, String fullName, String email, int age, int subjectId) {
        this.studentId = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.subjectId = subjectId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", subjectId=" + subjectId +
                '}';
    }
}
