import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catSoundTest(){
        String expected = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodMockTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Test1", "Test2", "Test3");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List <String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}
