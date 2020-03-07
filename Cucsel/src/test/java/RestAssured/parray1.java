package RestAssured;

public class parray1 {
	
	 int empid;
	 String empname;
	 int empsal;
	 public parray1(int id,String name,int sal){
		 
		 this.empid=id;
		 this.empname=name;
		 this.empsal=sal;
		 
	 }
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	 

}
