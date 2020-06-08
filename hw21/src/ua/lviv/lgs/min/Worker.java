package ua.lviv.lgs.min;

public class Worker {
	
	@FieldInfo(author = "alex L", yearOfCreation = 2020)
	private String name;
	@FieldInfo(yearOfCreation = 2019)
	private int id;
	
	private int age;

	
	public Worker(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Worker [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
	
	
}
