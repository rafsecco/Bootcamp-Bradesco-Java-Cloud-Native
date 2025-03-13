
public record PersonRecord(String name, int age) {
	
	public PersonRecord {
		System.out.println("++++++");
		System.out.println(name);
		System.out.println(age);
		System.out.println("++++++End");
	}
	
	public PersonRecord(String name) {
		this(name, 1);
	}
	
	public String getInfo() {
		return "Name: " + name + " age: " + age;
	}
}
