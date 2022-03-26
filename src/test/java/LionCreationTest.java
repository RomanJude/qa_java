import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;

@RunWith(Parameterized.class)
public class LionCreationTest {
    private final String checkedText;

    public LionCreationTest(String checkedText){
        this.checkedText = checkedText;
    }

    @Test
    public void lionSexTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(checkedText, feline);
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][] {
                {"Самец"},
                {"Самка"}
        };
    }
}
