    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class studentApp {
  public static void main(String agrs[]){
    //  Student st= new Student();
     ArrayList<Student> studentList= new ArrayList<>();
      Scanner sc= new Scanner(System.in);
      System.out.println("nhap so luong sv");
      int soluong =sc.nextInt();
      sc.nextLine();
      String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("---------------------");
            System.out.println("         MENU       ");
            System.out.println("---------------------");
            System.out.println("1.Nhap thong tin SV");
            System.out.println("2.View");
            System.out.println("3.Search SV");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    addStudent(studentList,soluong);
                    break;
                case 2:
                   printStudentList(studentList);
                    break;
                case 3: 
                    searachStudentByName(studentList);
                default: break;
            }
            System.out.println("Continue: Y/N?");
            choice = sc.nextLine();
        }     
  }
     public static void addStudent(ArrayList<Student> studentList, int soluong){
     //  ArrayList<Student> studentList= new ArrayList();
       Scanner sc= new Scanner(System.in);
       for( int i=0;i<soluong;i++){
           System.out.println("nhap vao ID");
           String id= sc.nextLine();
           System.out.println("nhap vao ten sv");
           String name = sc.nextLine();  
           System.out.println("nhap vao dia chi");
           String addr= sc.nextLine();
           System.out.println("nhap diem TheoryMark");
           Float the= sc.nextFloat();
           sc.nextLine();
           System.out.println("nhap diem LabMark");
           Float lab = sc.nextFloat();
           sc.nextLine();
           Student st= new Student();
           st.setStudentID(id);
           st.setStudentName(name);
           st.setStudentAddress(addr);
           st.setTheoryMark(the);
           st.setLabMark(lab);
           studentList.add(st);
       } 
     }  
        public static void printStudentList(ArrayList<Student> studentList) {
	for (int i = 0; i < studentList.size(); i++) {
	    System.out.println("Thong tin cua phan tu thu: " + i);
	    Student st = studentList.get(i);
	    System.out.println("ID: " + st.getStudentID());
	    System.out.println("NameSV: " + st.getStudentName());
	    System.out.println("AddressSV: " + st.getStudentAddress());
	    System.out.println("TheoryMark: " + st.getTheoryMark());
	    System.out.println("LabMark: " + st.getLabMark());
	    System.out.println("=================================");
	}
    }
        public static void searachStudentByName(ArrayList<Student> studentList){
            Scanner sc= new Scanner(System.in);
            System.out.println("Nhap vao ten sinh vien");
            String name = sc.nextLine();
            for (int i=0 ; i< studentList.size();i++) {
		    Student st = studentList.get(i);
		    if (name.equalsIgnoreCase(st.getStudentName())) {
                        System.out.println("Thong tin SV duoc tim thay:");
			System.out.println("ten:" + st.getStudentName());
                        System.out.println("ID SV:" + st.getStudentID());
                        System.out.println("ADDRESS:" + st.getStudentAddress());
                        System.out.println("TheoryMark:" + st.getTheoryMark());
                        System.out.println("LapMark:" + st.getLabMark());
                        break;
		    }
                    else
                      System.out.println("khong co sv nao");
        }
        }
        public static void Average(ArrayList<Student> studentList){
            for ( int i=0;i< studentList.size();i++){
                Student st = studentList.get(i);
                Float avg = (st.getTheoryMark() + st.getLabMark())/2;
            }
        }
}
