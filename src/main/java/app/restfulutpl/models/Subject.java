package app.restfulutpl.models;

import org.springframework.hateoas.ResourceSupport;

public class Subject extends ResourceSupport {
    private int subjectId;
    private String name;
    private int degreeId;

    public Subject(int id, String name, int degreeId) {
        this.subjectId = id;
        this.name = name;
        this.degreeId = degreeId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + subjectId +
                ", name='" + name + '\'' +
                ", degreeId=" + degreeId +
                '}';
    }
}
