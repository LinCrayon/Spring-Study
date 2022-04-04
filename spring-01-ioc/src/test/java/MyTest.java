import com.lsq.mapper.UserDaoMySqlImpl;
import com.lsq.mapper.UserDaoOracleImpl;
import com.lsq.service.UserService;
import com.lsq.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {
    @Test
    public void test01(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }

    @Test
    public void test02(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMySqlImpl() );
        service.getUser();
        //那我们现在又想用Oracle去实现呢
        service.setUserDao( new UserDaoOracleImpl() );
        service.getUser();
    }
}
