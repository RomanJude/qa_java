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
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
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
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
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
