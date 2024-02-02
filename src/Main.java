import entity.sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        sim sim=applicationContext.getBean("sim", entity.sim.class);
        sim.calling();
        sim.data();
        sim jioSim=applicationContext.getBean("jiosim",entity.sim.class);
        jioSim.calling();
        jioSim.data();

    }
}