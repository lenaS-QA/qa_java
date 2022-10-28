import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class LionTests {

    @Mock
    Feline feline;

    @Test
    public void getKittensCountCorrect() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        System.out.println(lion.getKittens());
    }

    @Test
    public void hasManeTest() throws Exception{
        Lion lion = new Lion("Самец");
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals("This lion should have mane, but hasn't it", expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println(lion.getFood());
    }
}