
import com.yu.ssm.pojo.book;
import com.yu.ssm.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;


public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);
        book book = bookService.queryBookName("御鬼者传奇");
        System.out.println(book);
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);
        ArrayList<book> query = bookService.query();
        for (book book : query) {
            System.out.println(book);
        }
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);
      bookService.update(new book("御鬼者传奇","张三"));
    }
}
