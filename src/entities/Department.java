package entities;

public class Department {

	// Attributes
	private String name;

	// Builders
	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	// Accessor Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
