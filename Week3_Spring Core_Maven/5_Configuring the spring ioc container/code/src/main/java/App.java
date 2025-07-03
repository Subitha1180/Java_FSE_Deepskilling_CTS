import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student", Student.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter your age: ");
        student.setAge(scanner.nextInt());

        System.out.println("\n--- Student Info ---");
        student.displayInfo();
    }
}
