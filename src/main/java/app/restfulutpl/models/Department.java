package app.restfulutpl.models;

import org.springframework.hateoas.ResourceSupport;

public class Department extends ResourceSupport {
    private int departmentId;
    private String name;
    private int facultyId;

    public Department(int id, String name, int facultyId) {
        this.departmentId = id;
        this.name = name;
        this.facultyId = facultyId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + departmentId +
                ", name='" + name + '\'' +
                ", facultyId=" + facultyId +
                '}';
    }
}
