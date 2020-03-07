package RestAssured;



public class Pojoarrayfinal {
	Pojoarray1 p1;
	Pojoarray2 p2;
	
	Pojoarray3 p3;
	public Pojoarrayfinal(Pojoarray1 p1,Pojoarray2 p2,Pojoarray3 p3){
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	public Pojoarray1 getP1() {
		return p1;
	}
	public void setP1(Pojoarray1 p1) {
		this.p1 = p1;
	}
	public Pojoarray2 getP2() {
		return p2;
	}
	public void setP2(Pojoarray2 p2) {
		this.p2 = p2;
	}
	public Pojoarray3 getP3() {
		return p3;
	}
	public void setP3(Pojoarray3 p3) {
		this.p3 = p3;
	}
	
	
	
}
