import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Mock
    Feline feline;

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

        @Test
    public void getKittensMockTest(){
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(1);
        }
}
