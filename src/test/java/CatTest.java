import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void CatSoundTest(){
        String expected = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void CatGetFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}
