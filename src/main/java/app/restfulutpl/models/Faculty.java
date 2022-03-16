package app.restfulutpl.models;

import org.springframework.hateoas.ResourceSupport;

public class Faculty extends ResourceSupport {
    private int facultyId;
    private String name;
    private int areaId;

    public Faculty(int id, String name, int areaId) {
        this.facultyId = id;
        this.name = name;
        this.areaId = areaId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + facultyId +
                ", name='" + name + '\'' +
                ", areaId=" + areaId +
                '}';
    }
}
