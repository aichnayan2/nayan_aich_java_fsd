package ProblemStatement6_3;


public class Employee {
	 private int empid;
	 private String ename, address;
	 public Employee (int empid, String ename, String address) {
		 super();
		 this.empid=empid;
		 this.ename=ename;
		 this.address=address;
		 }
	 public int getEmpid() {
		 return empid;
	 }
	 public void setEmpid(int empid) {
		 this.empid=empid;
	 }
	 public String getEname() {
		 return ename;
	 }
	 public void setEname(String ename) {
		 this.ename=ename;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddres(String address) {
		 this.address=address;
	 }
	}