import com.example.Animal;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class AnimalTest {

    @Mock
    Animal animal;

    @Test
    public void getFamilyTest (){
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }

   @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
       List<String> actual = animal.getFood("Травоядное");
       List<String> expected = List.of("Трава", "Различные растения");
       assertEquals(expected, actual);
       }

    @Test(expected = Exception.class)
    public void getFoodStrangeTest() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Камни");
    }

    @Test
    public void getFoodHerbivoreMockTest () throws Exception{
        animal.getFood("Травоядное");
        Mockito.verify(animal).getFood("Травоядное");
    }

    @Test
    public void getFoodPredatorMockTest () throws Exception{
        animal.getFood("Хищник");
        Mockito.verify(animal).getFood("Хищник");
    }


}
