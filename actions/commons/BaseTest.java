package commons;

import java.util.Random;

public class BaseTest {
    protected int generateNumber(){
        return new Random().nextInt(999);
    }
}
