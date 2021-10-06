package Lap_17_Unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Simple_app {
    @Test
    void shouldShowHello(){
        String actual = Simple_app.sayHello();
        String expected = "hello";
        Assertions.assertEquals(expected, actual);
    }
}
