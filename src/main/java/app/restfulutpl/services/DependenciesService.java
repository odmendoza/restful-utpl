package app.restfulutpl.services;

import app.restfulutpl.database.DataRepository;
import app.restfulutpl.models.*;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class DependenciesService {

    DataRepository repository = new DataRepository();

    @GetMapping("/areas")
    public List<KnowledgeArea> getAllAreas() {
        ArrayList<KnowledgeArea> areas = repository.getAreas();
        for (KnowledgeArea area : areas ) {
            area.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass())
                            .getFaculties(area.getAreaId()))
                            .withRel("faculty")
                            .withType("GET")
                            .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
        }
        return areas;
    }

    @GetMapping("/area/{id}")
    public KnowledgeArea getArea(@PathVariable int id){
        KnowledgeArea area = repository.getKnowledgeAreaById(id).get();
        area.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getAllAreas())
                .withRel("area")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        area.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getFaculties(id))
                .withRel("faculties")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        return area;
    }


    @GetMapping("/faculties/{id}")
    public List<Faculty> getFaculties(@PathVariable int id){
        ArrayList<Faculty> Faculties = repository.getFacultiesOfArea(id);
        for (Faculty faculty : Faculties) {
            faculty.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getArea(id))
                    .withRel("area")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
            faculty.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDepartments(faculty.getFacultyId()))
                    .withRel("department")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
        }
        return Faculties;

    }

    @GetMapping("/faculty/{id}")
    public Faculty getFaculty(@PathVariable int id){
        Faculty faculty = repository.getFacultyById(id).get();
        faculty.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getArea(faculty.getAreaId()))
                .withRel("area")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        faculty.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDepartments(faculty.getFacultyId()))
                .withRel("department")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        return faculty;
    }

    @GetMapping("/departments/{id}")
    public List<Department> getDepartments(@PathVariable int id){
        ArrayList<Department> departments = repository.getDepartmentsOfFaculty(id);
        for (Department department : departments) {
            department.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getFaculty(id))
                    .withRel("faculties")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
            department.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDegrees(department.getDepartmentId()))
                    .withRel("degrees")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
        }
        return departments;
    }
    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable int id){
        Department department = repository.getDepartmentById(id).get();
        department.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getFaculty(department.getFacultyId()))
                .withRel("faculties")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        department.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDegrees(department.getDepartmentId()))
                .withRel("degrees")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        return department;
    }
    @GetMapping("/degree/{id}")
    public List<Degree> getDegrees(@PathVariable int id){
        ArrayList<Degree> degrees = repository.getDegreesOfDepartment(id);
        for (Degree degree : degrees) {
            degree.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDepartment(id))
                    .withRel("department")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
            degree.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getSubjects(degree.getDegreeId()))
                    .withRel("subject")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE));
        }
        return degrees;
    }
    @GetMapping("/degrees/{id}")
    public Degree getDegree(@PathVariable int id){
        Degree degree = repository.getDegreeById(id).get();
        degree.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDepartment(degree.getDepartmentId()))
                .withRel("department")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        degree.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getSubjects(degree.getDegreeId()))
                .withRel("subject")
                .withType("GET")
                .withMedia(MediaType.APPLICATION_JSON_VALUE)
        );
        return degree;
    }
    @GetMapping("/subject/{id}")
    public List<Subject> getSubjects(@PathVariable int id){
        ArrayList<Subject> Subjects = repository.getSubjectsOfDegree(id);
        for (Subject subject : Subjects) {
            subject.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getDegree(id))
                    .withRel("degree")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
            subject.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getStudents(id))
                    .withRel("student")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
        }
        return Subjects;
    }


    @GetMapping("/students/{id}")
    public List<Student> getStudents(@PathVariable int id){
        ArrayList<Student> students = repository.getStudentsOfSubject(id);
        for (Student student : students) {
            student.add(linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getSubjects(id))
                    .withRel("subject")
                    .withType("GET")
                    .withMedia(MediaType.APPLICATION_JSON_VALUE)
            );
        }
        return students;
    }

}
