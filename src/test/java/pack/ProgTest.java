package pack;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProgTest{

    @Test
    public void progAreaTest(){
        final double givenWidth = 3;
        final double givenHeight = 5;
        final double expectedArea = 15;
        Prog.Rectangle rect = new Prog.Rectangle(givenWidth,givenHeight);
        final double actualArea = rect.area();
        assertEquals(expectedArea,actualArea,0);

    }

    @Test
    public void progCircuitTest(){
        final double givenWidth = 4;k
        final double givenHeight = 7;
        final double expectedCircuit = 22;

        Prog.Rectangle rect = new Prog.Rectangle(givenWidth,givenHeight);
        final double actualCircuit = rect.circuit();
        assertEquals(expectedCircuit,actualCircuit,0);

    }
}
