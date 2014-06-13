package at.binarycheese.amazoncopy;
import org.junit.*;

/**
 * Created by Joyce on 13.06.2014.
 */
public class StatusAutomatTest {

    @Test
    public  void ConstructorTest(){
        StatusAutomat automat = new StatusAutomat();
        Assert.assertEquals(Status.UNIDENTIFIED, automat.getStatus());
    }
}
