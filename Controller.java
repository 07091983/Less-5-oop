package controller;

import java.util.List;

import model.Student;
import model.Teacher;
import model.Type;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

public class Controller {
    
    private  final DataService service = new DataService();

    private final StudentView view = new StudentView();

    private final StudyGroupService service = new StudyGroupService();

    public void createStudyGroup(String firstName, String lastName, String midlleName) {
        service.create(firstName, lastName, midlleName, Type.STUDENT);
    }

    public void getAllStudentId() {
        List<Student> studentList = service.getAllStudentId();
        for (Student student : studentList) {
            Student studentId = (Student) student; 
            view.printOnConsole(studentId);
        }
    }

    public void createStudyGroup(String firstName, String lastName, String midlleName) {
        service.create(firstName, lastName, midlleName, Type.TEACHER);
    }

    public void getAllTeacherId() {
        List<Teacher> teacherList = service.getAllTeacherId();
        for (Teacher teacher : teacherList) {
            Teacher teacherId = (Teacher) teacher; 
            view.printOnConsole(teacherId);
        }
    }


    public void createStudent(String firstName, String lastName, String midlleName) {
        service.create(firstName, lastName, midlleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }

    }
}
