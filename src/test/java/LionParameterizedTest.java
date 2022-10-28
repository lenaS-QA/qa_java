import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedResult;

    public LionParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object [][] getCorrectHasManeValue() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals("There should be another result of hasManeTest", expectedResult, actualResult);
    }
}
