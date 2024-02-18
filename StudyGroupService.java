package service;

import java.security.Identity;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFileFormat.Type;

import model.Student;
import model.Teacher;

public class StudyGroupService {

    private List<Student> studentList;
    
    private List<Teacher> teacherList;

    public void create(String firstName, String lastName, String midlleName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, lastName, midlleName, id);
            studentList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, lastName, midlleName, id);
            teacherList.add(teacher);
        }

    }

    public Student getStudentById(Type type, int id) {
        boolean itsStudent = Type.STUDENT == type;
        
        Student currentstudent = null;

        for (Student student : studentList) {
            if (student instanceof Student && !itsTeacher && ((Student)student).getStudentId() == id) {
                currentstudent = student;
            }
            
        }

        return currentstudent;
        
    }

    public Student getTeacherById(Type type, int id) {
        boolean itsTeacher = Type.TEACHER == type;
        
        Teacher currentteacher = null;

        for (Teacher teacher : teacherList) {
            if (teacher instanceof Teacher && !itsStudent && ((Teacher)teacher).getTeacherId() == id) {
                currentteacher = teacher;
            }
            
        }
        return currentteacher;

        
    }

    public List<Student> getAllStudents() {
        return studentList;

    }

    public List<Teacher> getAllTeachers() {
        return teacherList;

    }

    public List<Student> getAllStudentId(){
        List<Student> studentId = new ArrayList<>();
        for (Student student : studentList);
            if (studentId instanceof Student) {
                studentId.add(student);
            } 
        return studentId;
    }

    public List<Teacher> getAllTeacherId(){
        List<Teacher> teacherId = new ArrayList<>();
        for (Teacher teacher : teacherList);
            if (teacherId instanceof Teacher) {
                teacherId.add(teacher);
            } 
        return teacherId;
    }
    



    private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (Teacher teacher : teacherList) {
            if (teacher instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) teacher).getTeacherId() + 1;
            }
            
        }
        return lastId;
    }

    private int getFreeId(Type type) {
        boolean itsTeacher = Type.TEACHER == type;
        int lastId = 1;
        for (Student student : studentList) {
            if (student instanceof Student && !itsTeacher) {
                lastId = ((Student) student).getStudentId() + 1;
            }
            
        }
        return lastId;
    }
   
}
