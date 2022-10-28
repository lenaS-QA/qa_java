import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String extendedGetSound = "Мяу";
        String actualGetSound = cat.getSound();
        Assert.assertEquals("There should be another sound", extendedGetSound, actualGetSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println(cat.getFood());
    }
}
