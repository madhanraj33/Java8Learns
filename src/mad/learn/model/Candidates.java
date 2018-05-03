package mad.learn.model;

public class Candidates {

	private String name;
	private String natives;
	private int age;

	public Candidates(String name, String natives, int age) {
		super();
		this.name = name;
		this.natives = natives;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNatives() {
		return natives;
	}

	public void setNatives(String natives) {
		this.natives = natives;
	}

}
