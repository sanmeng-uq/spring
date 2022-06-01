import com.ch9.entity.Account;
import com.ch9.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    @Test
    public void testA(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        Account account=new Account();
        account.setUsername("张婶");
        account.setBalance(1000.0);
        Account result=accountService.insert(account);
        System.out.println(result);
    }
    @Test
    public void testB(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        Account account=new Account();
        account.setId(1);
        account.setUsername("wangu");
        account.setBalance(1090.0);
        Account result=accountService.update(account);
        System.out.println(result);
    }
    @Test
    public void testC(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        boolean result=accountService.deleteById(1);
        System.out.println(result);
    }
    @Test
    public void testD(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        Account result=accountService.queryById(3);
        System.out.println(result);
    }
}
