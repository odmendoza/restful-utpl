package app.restfulutpl.models;

import org.springframework.hateoas.ResourceSupport;

public class Degree extends ResourceSupport {
    private int degreeId;
    private String name;
    private int departmentId;

    public Degree(int id, String name, int departmentId) {
        this.degreeId = id;
        this.name = name;
        this.departmentId = departmentId;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Degree{" +
                "id=" + degreeId +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
