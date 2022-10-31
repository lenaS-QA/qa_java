import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String extendedGetFamily = "Кошачьи";
        String actualGetFamily = feline.getFamily();
        Assert.assertEquals("There should be another family", extendedGetFamily, actualGetFamily);
    }

    @Test
    public void getKittensCount() {
        Feline feline = new Feline();
        int extendedGetKittens = 1;
        int actualGetKittens = feline.getKittens();
        Assert.assertEquals("KittensCount isn't right", extendedGetKittens, actualGetKittens);
    }

    @Test
    public void eatMeatTest() throws Exception{
        Feline feline = new Feline();
        String animalKind = "Хищник";
        List<String> extendedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.getFood(animalKind);
        Assert.assertEquals("The food list should be different", extendedEatMeat, actualEatMeat);
    }
}
