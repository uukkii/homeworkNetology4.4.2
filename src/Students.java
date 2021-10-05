import java.util.*;

public class Students {

    private String name;
    private String group;
    private String studentId;

    public Students(String name, String group, String  studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString(){
        return name + ", " + group + ", " + studentId + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !object.getClass().equals(Students.class))
            return false;

        Students altStudent = (Students) object;
        return getStudentId() != null ? getStudentId().equals(altStudent.getStudentId()) : altStudent.getStudentId() == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
