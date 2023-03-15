import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    Feline feline = new Feline();

    private final int testCountKittens;

    public FelineTest (int testCountKittens) {
        this.testCountKittens = testCountKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getTestDataForCountKittens() {
        return new Object[][]{
                {1},
                {-1},
                {0},
        };
    }

    @Test
    public void validateEatMeatFelline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void validateGetFamilyFelline() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected,actual);
    }

    @Test
    public void validateGetKittensFelline() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void validateGetKittensWithTestDataSet() {
        int actual = feline.getKittens(testCountKittens);
        assertEquals(testCountKittens, actual);
    }
}
