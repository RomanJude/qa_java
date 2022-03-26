import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        int expected = 3;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        List<String> expected = List.of("Test1", "Test2", "Test3");
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(expected);
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void doesHaveManeLgbtTest() throws Exception {
        String sex = "Оно";
        Lion lion = new Lion(sex, feline);
    }

    @Test(expected = Exception.class)
    public void getFoodStrangeTest() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Камни");
    }
}
