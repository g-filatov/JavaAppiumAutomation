import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Before
    public void textStartTest(){
        System.out.println("Тест начался");
    }
    @After
    public void textFinishTest(){
        System.out.println("Тест завершён");
    }
    @Test
    public void testGetLocalNumber(){
        Assert.assertEquals(getLocalNumber(), 14);
        System.out.println("Метод getLocalNumber возвращает значение 14");
    }
    @Test
    public void testGetClassNumber(){
        int expected = 45;
        int actual = getClassNumber() ;
        Assert.assertTrue("Значение переменной class_number меньше, либо равно 45",actual > expected);
    }
}
