import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello");
//        Car car=new Car();
//        car.drive();
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj=(Vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
