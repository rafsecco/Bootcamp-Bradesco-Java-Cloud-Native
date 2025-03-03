
public class Main {

	public static void main(String[] args) {
		var male = new Person("João");
		// male.setName("João");
		// male.setAge(12);
		male.incAge();
		male.incAge();
		male.incAge();
		
		
		var female = new Person("Maria", 2);
		//female.setName("Maria");
		// female.setAge(10);
		female.incAge();
		
		System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
		System.out.println("FeMale name: " + female.getName() + " age: " + female.getAge());
		
		// var person = new PersonRecord("João", 10);
		var person = new PersonRecord("João");
		System.out.println(person);
		System.out.println(person.name());
	}
}
