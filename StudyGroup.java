package model;

public class StudyGroup extends User{

    public StudyGroup(String firstName, String lastName, String midlleName, int studentId, int teacherId) {
        super(firstName, lastName, midlleName);
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    private int studentId;
    
    private int teacherId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    
    
}
