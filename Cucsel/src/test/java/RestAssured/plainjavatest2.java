package RestAssured;

public class plainjavatest2 {
	
	String name;
	PlainJavatest pjt;
	
	plainjavatest2(String name1,PlainJavatest p){
		this.name=name1;
		this.pjt=p;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PlainJavatest getPjt() {
		return pjt;
	}
	public void setPjt(PlainJavatest pjt) {
		this.pjt = pjt;
	}
	
	

}
