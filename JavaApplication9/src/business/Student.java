/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Administrator
 */
public class Student {

   private String StudentID;
   private String StudentName;
   private String StudentAddress;
   private Float TheoryMark;
   private Float LabMark;
    public Student(){
        this.StudentAddress="";
        this.StudentID="";
        this.StudentName="";
    }

    public Student(String StudentID, String StudentName, String StudentAddress, Float TheoryMark, Float LabMark) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentAddress = StudentAddress;
        this.TheoryMark = TheoryMark;
        this.LabMark = LabMark;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String StudentAddress) {
        this.StudentAddress = StudentAddress;
    }

    public Float getTheoryMark() {
        return TheoryMark;
    }

    public void setTheoryMark(Float TheoryMark) {
        this.TheoryMark = TheoryMark;
    }

    public Float getLabMark() {
        return LabMark;
    }

    public void setLabMark(Float LabMark) {
        this.LabMark = LabMark;
    }
    public Float getAvg(){
        Float avg= (this.TheoryMark + this.LabMark)/2;
        return avg;
    }
}
