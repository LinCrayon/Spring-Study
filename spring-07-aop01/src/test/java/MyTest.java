import com.lsq.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }

        @Test
        public void test02(){
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            UserService userService = (UserService) context.getBean("userService");
            userService.add();
    }
}