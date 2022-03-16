package app.restfulutpl.models;

import org.springframework.hateoas.ResourceSupport;

public class KnowledgeArea extends ResourceSupport {
    private int areaId;
    private String name;

    public KnowledgeArea(int areaId, String name) {
        this.areaId = areaId;
        this.name = name;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KnowledgeArea{" +
                "id=" + areaId +
                ", name='" + name + '\'' +
                '}';
    }
}
