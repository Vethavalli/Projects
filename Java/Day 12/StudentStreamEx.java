package com.src1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStreamEx {
  public static void main(String[] args) {
    ArrayList<Student> al =new ArrayList();
    al.add(new Student(12, "rupa", "mdu", 98, 45, 64));
    al.add(new Student(14, "Abi", "chn", 56, 78, 65));
    al.add(new Student(16, "anu", "bgl", 87, 94, 98));
    al.add(new Student(22, "ramya", "chn", 87, 98, 99));
    al.add(new Student(24, "nithya", "cbe", 95, 68, 79));
    al.add(new Student(68, "jhansi", "mdu", 78, 87, 94));
    al.add(new Student(19, "kavya", "hyd", 85, 56, 64));
    al.add(new Student(13, "maha", "chn", 54, 96, 47));
    al.add(new Student(54, "jothi", "cbe", 54, 84, 64));
    Stream<Student> s1 = al.stream();
    List<Student> ul = (List<Student>) s1.map((o) -> {
      Student s = (Student) o;
      s.total = s.mathmark + s.scimark + s.socmark;
      return s;
    }).collect(Collectors.toList());
    System.out.println(ul);
    Student stu = (Student) al.stream().max((i1, i2) -> ((Student) i1).compareTo(i2)).get();
    System.out.println(stu);
    List<Student> l = (List<Student>) al.stream().sorted((o1, o2) -> 
        ((Student)o1).sname.length() > ((Student)o2).sname.length() ? -1 : 1).collect(Collectors.toList());
    System.out.println(l);
    List<Student> l1 = (List<Student>) al.stream().sorted((i1, i2) -> 
        ((Student)i1).total / 3 > ((Student)i2).total / 3 ? -1 : 1).collect(Collectors.toList());
    System.out.println(l1);
  }
}
class Student implements Comparable {
  int sid;
  String sname;
  String address;
  int mathmark;
  int scimark;
  int socmark;
  int total;
  double avg;
  
  public Student() {
    super();
  }
  
  public Student(int sid, String sname, String address, int mathmark, int scimark, int socmark) {
    super();
    this.sid = sid;
    this.sname = sname;
    this.address = address;
    this.mathmark = mathmark;
    this.scimark = scimark;
    this.socmark = socmark;
  }

  public int getSid() {
    return sid;
  }
  
  public void setSid(int sid) {
    this.sid = sid;
  }
  
  public String getSname() {
    return sname;
  }
  
  public void setSname(String sname) {
    this.sname = sname;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public int getMathmark() {
    return mathmark;
  }
  
  public void setMathmark(int mathmark) {
    this.mathmark = mathmark;
  }
  
  public int getScimark() {
    return scimark;
  }
  
  public void setScimark(int scimark) {
    this.scimark = scimark;
  }
  
  public int getSocmark() {
    return socmark;
  }
  
  public void setSocmark(int socmark) {
    this.socmark = socmark;
  }
  
  @Override
  public String toString() {
    return "Student [ " + sid + " " + sname + " " + address + " " + " " + mathmark 
            + " " + scimark + " " + socmark + " " + total + " ] ";
  }

  @Override
  public int compareTo(Object o) {
    Student s1 = (Student) o;
    return s1.total > this.total ? -1 : 1;
  }

}
	