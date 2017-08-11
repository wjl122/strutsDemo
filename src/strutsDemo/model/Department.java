package strutsDemo.model;

public class Department {
     private String name;
     private int id ;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Department(String name) {
		this.name=name;
	}
	public Department() {
		
	}
}
