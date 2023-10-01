import command.TurnOnAcCommand;
import invoker.RemoteControl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import receiver.AirConditioner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestRemoteControl {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    PrintStream originalErr = System.err;

    AirConditioner ac = new AirConditioner();
    RemoteControl acRemote = new RemoteControl();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restore() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testCommandExecution() {
        acRemote.setCommand(new TurnOnAcCommand(ac));
        acRemote.pressButton();
        assertEquals("AC has been turned on\n", outContent.toString());
    }

    @Test
    public void testCommandUndo() {
        acRemote.setCommand(new TurnOnAcCommand(ac));
        acRemote.pressButton();
        acRemote.undo();
        assertEquals("AC has been turned on\nAC has been turned off\n", outContent.toString());
    }
}
