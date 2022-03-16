package app.restfulutpl.database;

import app.restfulutpl.models.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public class DataRepository {
    private ArrayList<KnowledgeArea> areas;
    private ArrayList<Faculty> faculties;
    private ArrayList<Department> departments;
    private ArrayList<Degree> degrees;
    private ArrayList<Subject> subjects;
    private ArrayList<Student> students;

    public DataRepository() {
        this.areas = new ArrayList<>();
        this.areas.add(new KnowledgeArea(0, "Área Administrativa"));
        this.areas.add(new KnowledgeArea(1, "Área Biológica"));
        this.areas.add(new KnowledgeArea(2, "Área Sociohumanística"));
        this.areas.add(new KnowledgeArea(3, "Área Técnica"));

        this.faculties = new ArrayList<>();
        this.faculties.add(new Faculty(0, "Facultad de Ciencias Sociales, Educación y humanidades", 2));
        this.faculties.add(new Faculty(1, "Facultad de Ciencias Exactas y Naturales", 1));
        this.faculties.add(new Faculty(2, "Facultad de Ciencias de la Salud", 1));
        this.faculties.add(new Faculty(3, "Facultad de Ciencias Económicas y Empresariales", 0));
        this.faculties.add(new Faculty(5, "Facultad de Ciencias Jurídicas y Políticas", 2));
        this.faculties.add(new Faculty(4, "Facultad de Ingenierías y Arquitectura", 3));

        this.departments = new ArrayList<>();
        this.departments.add(new Department(0, "Departamento de Ciencias de la Comunicación", 0));
        this.departments.add(new Department(1, "Departamento de Ciencias Jurídicas", 5));
        this.departments.add(new Department(2, "Departamento de Ciencias Biológicas y Agropecuarias", 1));
        this.departments.add(new Department(3, "Departamento de Ciencias de la Computación y Electrónica", 4));
        this.departments.add(new Department(4, "Departamento de Ingeniería Civil y Geociencias", 4));
        this.departments.add(new Department(5, "Departamento de Ciencias de la Salud", 2));
        this.departments.add(new Department(6, "Departamento de Ciencias empresariales", 3));
        this.departments.add(new Department(7, "Departamento de Ciencias de Economía", 3));

        this.degrees = new ArrayList<>();
        this.degrees.add(new Degree(0, "Carrera de Comunicación social", 1));
        this.degrees.add(new Degree(1, "Carrera de Derecho", 1));
        this.degrees.add(new Degree(2, "Carrera de Alimentos", 2));
        this.degrees.add(new Degree(3, "Carrera de Agropecuaria", 2));
        this.degrees.add(new Degree(4, "Carrera de Tecnologías de la Información", 3));
        this.degrees.add(new Degree(5, "Carrera de Telecomunicaciones", 3));
        this.degrees.add(new Degree(6, "Carrera de Ingeniería Civil", 4));
        this.degrees.add(new Degree(7, "Carrera de Ingeniería Industrial", 4));
        this.degrees.add(new Degree(8, "Carrera de Enfermería", 5));
        this.degrees.add(new Degree(9, "Carrera de Medicina", 5));
        this.degrees.add(new Degree(10, "Carrera de Administración de Empresas", 6));
        this.degrees.add(new Degree(11, "Carrera de Economía", 6));

        this.subjects = new ArrayList<>();
        this.subjects.add(new Subject(0, "Teoría de la Comunicación", 0));
        this.subjects.add(new Subject(2, "Teoría de la Imagen", 0));
        this.subjects.add(new Subject(3, "Derecho Romano", 1));
        this.subjects.add(new Subject(4, "Investigación Jurídica", 1));
        this.subjects.add(new Subject(5, "Análisis Sensorial de Alimentos", 2));
        this.subjects.add(new Subject(6, "Microbiología de los Alimentos", 2));
        this.subjects.add(new Subject(7, "Biología General", 3));
        this.subjects.add(new Subject(8, "Química General", 3));
        this.subjects.add(new Subject(9, "Algoritmos y Resolución de Problemas", 4));
        this.subjects.add(new Subject(10, "Fundamentos de Programación", 4));
        this.subjects.add(new Subject(11, "Electrotecnia", 5));
        this.subjects.add(new Subject(12, "Electrónica Analógica", 5));
        this.subjects.add(new Subject(13, "Análisis Matemático Múltivariado", 6));
        this.subjects.add(new Subject(14, "Abastecimiento de Agua", 6));
        this.subjects.add(new Subject(15, "Computación Aplicada a la Ingeniería", 7));
        this.subjects.add(new Subject(16, "Transferencia de Calor", 7));
        this.subjects.add(new Subject(17, "Bioquímica Aplicada a la Enfermería", 8));
        this.subjects.add(new Subject(18, "Legislación en Enfermería", 8));
        this.subjects.add(new Subject(19, "Biología molecular", 9));
        this.subjects.add(new Subject(20, "Farmacología general", 9));
        this.subjects.add(new Subject(21, "Habilidades Gerenciales", 10));
        this.subjects.add(new Subject(22, "Finanzas Estructurales", 10));
        this.subjects.add(new Subject(23, "Economía de la Empresa y Mercado", 11));
        this.subjects.add(new Subject(24, "Macroeconomía Abierta", 11));

        this.students = new ArrayList<>();
        this.students.add(new Student(0, "Edelmira Landa Perales", "elanda@utpl.edu.ec", 21, 1));
        this.students.add(new Student(1, "Montserrat Arenas Menendez", "mareanas@utpl.edu.ec", 22, 1));
        this.students.add(new Student(2, "Nadia del Garcés", "ngarces@utpl.edu.ec", 21, 2));
        this.students.add(new Student(3, "Dionisia Mayol Hernandez", "smayol@utpl.edu.ec", 25, 2));
        this.students.add(new Student(4, "Prudencia Colom-Jordá", "pcolom@utpl.edu.ec", 21, 3));
        this.students.add(new Student(5, "Sofía Linares", "slinares@utpl.edu.ec", 25, 3));
        this.students.add(new Student(6, "Adrián Urrutia Cabeza", "aurrutia@utpl.edu.ec", 21, 4));
        this.students.add(new Student(7, "Abilio César Carbonell Márquez", "acarbonell@utpl.edu.ec", 81, 4));
        this.students.add(new Student(8, "Nazario Fito Juan Valle", "nfito@utpl.edu.ec", 22, 5));
        this.students.add(new Student(9, "Alma Montoya-Corominas", "amontoya@utpl.edu.ec", 21, 5));
        this.students.add(new Student(10, "Flor León Bauzà", "fleon@utpl.edu.ec", 23, 6));
        this.students.add(new Student(11, "Simón Leal Aguirre", "sleal@utpl.edu.ec", 21, 6));
        this.students.add(new Student(12, "Melisa Ayala", "mayala@utpl.edu.ec", 24, 7));
        this.students.add(new Student(13, "Herberto Valentín Aroca", "hvalentin@utpl.edu.ec", 25, 7));
        this.students.add(new Student(14, "Felipe Rodríguez", "frodriguez@utpl.edu.ec", 21, 8));
        this.students.add(new Student(15, "Piedad Valentín Bertrán", "pvalentin@utpl.edu.ec", 26, 8));
        this.students.add(new Student(16, "Fabiana de Ferrera", "fferrera@utpl.edu.ec", 21, 9));
        this.students.add(new Student(17, "Francisco Javier de Ortega", "fjavier@utpl.edu.ec", 27, 9));
        this.students.add(new Student(18, "Ximena Marquez Carrillo", "xmarquez@utpl.edu.ec", 21, 10));
        this.students.add(new Student(19, "Leocadia Ferrándiz Mateos", "lferrandiz@utpl.edu.ec", 28, 10));
        this.students.add(new Student(20, "Gloria Peñas Sainz", "gpenas@utpl.edu.ec", 21, 11));
        this.students.add(new Student(21, "Josefa Arregui Cózar", "jarregui@utpl.edu.ec", 29, 11));
        this.students.add(new Student(22, "Clemente Castrillo Lobato", "ccastrillo@utpl.edu.ec", 21, 12));
        this.students.add(new Student(23, "Modesto Ortuño", "mortuno@utpl.edu.ec", 22, 12));
        this.students.add(new Student(24, "Azeneth Font", "afont@utpl.edu.ec", 21, 13));
        this.students.add(new Student(25, "Nando Galván Pi", "ngalvan@utpl.edu.ec", 31, 13));
        this.students.add(new Student(26, "Yago Fajardo Falcón", "yjajardo@utpl.edu.ec", 24, 14));
        this.students.add(new Student(27, "José Mari Esteve-Espada", "jesteve@utpl.edu.ec", 21, 14));
        this.students.add(new Student(28, "Pepita Giralt Rius", "pgiralt@utpl.edu.ec", 25, 15));
        this.students.add(new Student(29, "Clímaco Llanos Barco", "cllanos@utpl.edu.ec", 21, 15));
        this.students.add(new Student(30, "Valero Montalbán Garrido", "vmoltalban@utpl.edu.ec", 26, 16));
        this.students.add(new Student(31, "Nydia Puga", "npuga@utpl.edu.ec", 21, 16));
        this.students.add(new Student(32, "Teresita Coello Girón", "tcoello@utpl.edu.ec", 27, 17));
        this.students.add(new Student(33, "Otilia Palma Checa", "opalma@utpl.edu.ec", 21, 17));
        this.students.add(new Student(34, "Trinidad Palacio Fuentes", "tpalacio@utpl.edu.ec", 28, 18));
        this.students.add(new Student(35, "Candela Chaparro Robledo", "cchaparro@utpl.edu.ec", 21, 18));
        this.students.add(new Student(36, "Benigna Bernat Vila", "bbernat@utpl.edu.ec", 29, 19));
        this.students.add(new Student(37, "Armando Barceló-Fernández", "abarcelo@utpl.edu.ec", 21, 19));
        this.students.add(new Student(38, "Maura Torralba Sarabia", "mtorralba@utpl.edu.ec", 22, 20));
        this.students.add(new Student(39, "Felicia Izaguirre Ayllón", "fizaguirre@utpl.edu.ec", 21, 20));
        this.students.add(new Student(40, "Guiomar Robles Bartolomé", "grobles@utpl.edu.ec", 23, 21));
        this.students.add(new Student(41, "Graciana Portero-Duran", "gportero@utpl.edu.ec", 21, 21));
        this.students.add(new Student(42, "Hilario Sánchez Montserrat", "hsanchez@utpl.edu.ec", 25, 22));
        this.students.add(new Student(43, "Benjamín Cámara Cabanillas", "bcamara@utpl.edu.ec", 21, 22));
        this.students.add(new Student(44, "Piedad Nicolau Hervia", "pnicolau@utpl.edu.ec", 26, 23));
        this.students.add(new Student(45, "Aureliano Llabrés Losada", "allabres@utpl.edu.ec", 21, 23));
        this.students.add(new Student(46, "Elodia Bernal-Villalba", "ebernal@utpl.edu.ec", 27, 24));
        this.students.add(new Student(47, "Oswaldo Danilo Mendoza Capa", "odmendoza@utpl.edu.ec", 21, 24));
    }

    /*
    * Knowledge areas
    * */

    public ArrayList<KnowledgeArea> getAreas (){
        return this.areas;
    }

    public Optional<KnowledgeArea> getKnowledgeAreaById (int id){
        return this.areas.stream().filter(area -> area.getAreaId() == id).findFirst();
    }

    /*
     * Faculties
     * */

    public ArrayList<Faculty> getFaculties (){
        return this.faculties;
    }

    public Optional<Faculty> getFacultyById(int id){
        return this.faculties.stream().filter(faculty -> faculty.getFacultyId() == id).findFirst();
    }

    public ArrayList<Faculty> getFacultiesOfArea(int areaId){
        ArrayList<Faculty> result = new ArrayList<Faculty>();
        for (Faculty faculty : this.faculties) {
            if(areaId == faculty.getAreaId()){
                result.add(faculty);
            }
        }
        return result;
    }

    /*
     * Departments
     * */

    public ArrayList<Department> getDepartments (){
        return this.departments;
    }

    public Optional<Department> getDepartmentById (int id){
        return this.departments.stream().filter(department -> department.getDepartmentId() == id).findFirst();
    }

    public ArrayList<Department> getDepartmentsOfFaculty (int facultyId){
        ArrayList<Department> result = new ArrayList<Department>();
        for (Department department : this.departments) {
            if(facultyId == department.getFacultyId()){
                result.add(department);
            }
        }
        return result;
    }

    /*
     * Degrees
     * */

    public ArrayList<Degree> getDegrees (){
        return this.degrees;
    }

    public Optional<Degree> getDegreeById (int id){
        return this.degrees.stream().filter(degree -> degree.getDegreeId() == id).findFirst();
    }

    public ArrayList<Degree> getDegreesOfDepartment (int departmentId){
        ArrayList<Degree> result = new ArrayList<Degree>();
        for (Degree degree : this.degrees) {
            if(departmentId == degree.getDepartmentId()){
                result.add(degree);
            }
        }
        return result;
    }

    /*
     * Subjects
     * */

    public ArrayList<Subject> getSubjects (){
        return this.subjects;
    }

    public Optional<Subject> getSubjectById (int id){
        return this.subjects.stream().filter(subject -> subject.getSubjectId() == id).findFirst();
    }

    public ArrayList<Subject> getSubjectsOfDegree (int degreeId){
        ArrayList<Subject> result = new ArrayList<Subject>();
        for (Subject subject : this.subjects) {
            if(degreeId == subject.getDegreeId()){
                result.add(subject);
            }
        }
        return result;
    }

    /*
     * Students
     * */

    public ArrayList<Student> getStudents (){
        return this.students;
    }

    public Optional<Student> getStudentsById (int id){
        return this.students.stream().filter(subject -> subject.getStudentId() == id).findFirst();
    }

    public ArrayList<Student> getStudentsOfSubject (int subjectId){
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student student : this.students) {
            if(subjectId == student.getSubjectId()){
                result.add(student);
            }
        }
        return result;
    }

}
