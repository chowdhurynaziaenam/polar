package controller;

import model.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="std")
@SessionScoped
public class StudentController {
    Student student1=new Student();
    Student student2=new Student();

    public StudentController() {
    }

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }
    public String isNextPage(){

        student1.setId(1);
        student1.setName("prima");
        student2.setId(2);
        student2.setName("Tithi");
        return "viewstudent";
    }
}
