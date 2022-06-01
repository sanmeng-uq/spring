import com.ch9.entity.Account;
import com.ch9.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    @Test
    public void insert(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        Account account=new Account();
        account.setUsername("张婶");
        account.setBalance(1000.0);
        Account result=accountService.insert(account);
        System.out.println(result);
    }
    @Test
    public void update(){
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
    public void delete(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        boolean result=accountService.deleteById(1);
        System.out.println(result);
    }
    @Test
    public void select(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        Account result=accountService.queryById(3);
        System.out.println(result);
    }
    @Test
    public void transfer(){
        ApplicationContext aptx=new ClassPathXmlApplicationContext("application-dao.xml");
        AccountService accountService=(AccountService) aptx.getBean("accountService");
        accountService.transfer("lisi","zhangsan",100.0);
    }
}
