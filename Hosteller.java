import java.util.Scanner;
import java.util.StringJoiner;



public class Main {

protected int studentId;
protected String name;
protected int departmentId;
protected String gender;
protected String phone;



public int getStudentId() {
return studentId;
}



public void setStudentId(int studentId) {
this.studentId = studentId;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public int getDepartmentId() {
return departmentId;
}



public void setDepartmentId(int departmentId) {
this.departmentId = departmentId;
}



public String getGender() {
return gender;
}



public void setGender(String gender) {
this.gender = gender;
}



public String getPhone() {
return phone;
}



public void setPhone(String phone) {
this.phone = phone;
}




public static class Hosteller extends Main {
private String hostelName;
private int roomNumber;



public String getHostelName() {
return hostelName;
}



public void setHostelName(String hostelName) {
this.hostelName = hostelName;
}



public int getRoomNumber() {
return roomNumber;
}



public void setRoomNumber(int roomNumber) {
this.roomNumber = roomNumber;
}
}
public static Hosteller getHostellerDetails() {
Scanner scanner = new Scanner(System.in);



System.out.println("Enter the Details:");
System.out.println("Student Id");
int id = scanner.nextInt();



System.out.println("Student Name");
String name = scanner.next();



System.out.println("Department Id");
int department = scanner.nextInt();



System.out.println("Gender");
String gender = scanner.next();



System.out.println("Phone Number");
String phNo = scanner.next();



System.out.println("Hostel Name");
String hostel = scanner.next();



System.out.println("Room Number");
int room = scanner.nextInt();



Hosteller hosteller = new Hosteller();
hosteller.setStudentId(id);
hosteller.setName(name);
hosteller.setDepartmentId(department);
hosteller.setGender(gender);
hosteller.setPhone(phNo);
hosteller.setHostelName(hostel);
hosteller.setRoomNumber(room);



return hosteller;
}



public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Hosteller hosteller = getHostellerDetails();



System.out.println("Modify Room Number(Y/N)");
char updateRoom = scanner.next().charAt(0);


int comp=Character.compare(updateRoom,'Y');

if (comp>=0) {
System.out.println("New Room Number");
int room = scanner.nextInt();
hosteller.setRoomNumber(room);
}



System.out.println("Modify Phone Number(Y/N)");
char updatePhone = scanner.next().charAt(0);
int comp1=Character.compare(updateRoom,'Y');
if (comp1>=0) {
System.out.println("New Phone Number");
String phNo = scanner.next();
hosteller.setPhone(phNo);
}



StringJoiner stringJoiner = new StringJoiner(" ");
stringJoiner.add(String.valueOf(hosteller.getStudentId()))
.add(hosteller.getName())
.add(String.valueOf(hosteller.getDepartmentId()))
.add(hosteller.getGender())
.add(hosteller.getPhone())
.add(hosteller.getHostelName())
.add(String.valueOf(hosteller.getRoomNumber()));



System.out.println("The Student Details:");
System.out.println(stringJoiner.toString());
}
}