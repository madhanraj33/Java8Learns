package mad.learn.model;

public class Patients {

	private int id;
	private int age;
	private String name;
	private String address;
	private String contactnumber;

	public Patients(int id, int age, String name, String address, String contactnumber) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.contactnumber = contactnumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

}
