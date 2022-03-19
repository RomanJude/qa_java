import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void getFamilyTest(){
        String expected = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
    @Test
    public void getKittensTest(){
        int expected = 1;
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(expected, actual);
        }
}
