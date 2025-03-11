import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
	public static void main(String[] args) {
		printEmployee(new Manager());
		printEmployee(new Salesman());
	}

	public static void printEmployee(Employee employee) {
		System.out.printf("==========%s==========\n", employee.getClass().getCanonicalName());
		switch (employee) {
			case Manager manager -> {
				manager.setCode("123");
				manager.setName("João");
				manager.setSalary(5000);
				manager.setLogin("joao");
				manager.setPassword("123456");
				manager.setCommission(1200);

				System.out.println("Code: " + manager.getCode());
				System.out.println("Name: " + manager.getName());
				System.out.println("Salary: " + manager.getSalary());
				System.out.println("Login: " + manager.getLogin());
				System.out.println("Password: " + manager.getPassword());
				System.out.println("Commission: " + manager.getCommission());

			}
			case Salesman salesman -> {
				salesman.setCode("456");
				salesman.setName("Lucas");
				salesman.setSalary(2800);
				salesman.setPercentPerSold(10);
				salesman.setSoldAmount(1000);

				System.out.println("Code: " + salesman.getCode());
				System.out.println("Name: " + salesman.getName());
				System.out.println("Salary: " + salesman.getSalary());
				System.out.println("PercentPerSold: " + salesman.getPercentPerSold());
				System.out.println("SoldAmount: " + salesman.getSoldAmount());

			}
		}
		System.out.println("FullSalary: " + employee.getFullSalary());
		System.out.println("FullSalary_extra: " + employee.getFullSalary(500));
		System.out.println("FullSalary_extra2: " + employee.getFullSalary(500, 30));
		System.out.println("==================================");
	}
}