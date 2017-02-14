import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/2/3.
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-config.xml");
        context.start();
        System.out.println(context.getBean("dataSource"));
    }
}
