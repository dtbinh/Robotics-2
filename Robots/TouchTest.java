import lejos.nxt.*;
public class TouchTest
{
    public static void main(String[] args) throws Exception
    {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        while (!touch.isPressed())
        {
        	// try again
        }
        LCD.drawString("Finished", 3, 4);
    }
}
