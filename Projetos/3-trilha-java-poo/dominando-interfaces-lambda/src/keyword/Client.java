package keyword;

public class Client {
	private String name;
	private int age;
	// private Address address = new Address();
	private static String staticName;

	public String getStaticName() {
		return staticName;
	}
	public void setStaticName(String staticName) {
		Client.staticName = staticName;
	}
	public String getName() {
		//System.out.println(address.description);
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

}


