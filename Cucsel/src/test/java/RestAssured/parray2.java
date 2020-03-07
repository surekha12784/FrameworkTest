package RestAssured;

public class parray2 {
	
	int deptid;
	String deptname;
	parray2(int did,String dname){
		this.deptid=did;
		this.deptname=dname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

}
