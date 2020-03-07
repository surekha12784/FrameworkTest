package RestAssured;

public class PJar1 {
	String name;
	int age;
	String[] rights;
	public PJar1(String n,int a,String[] r){
		this.name=n;
		this.age=a;
		this.rights=r;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getRights() {
		return rights;
	}
	public void setRights(String[] rights) {
		this.rights = rights;
	}

}
