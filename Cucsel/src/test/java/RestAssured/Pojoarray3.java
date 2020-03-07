package RestAssured;

public class Pojoarray3 {
	
	String rights[];
	public Pojoarray3(String[] ri){
		this.rights=ri;
		
	}
	public String[] getRights(){
		return rights;
	}
	public void setRights(String[] Rights){
		this.rights=Rights;
	}

}
