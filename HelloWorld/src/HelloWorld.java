public class HelloWorld
{
    private final String message;

    public HelloWorld()
    {
        message = "Andrew says: Hello World!";
        printHW();
    }

    public void printHW()
    {
        System.out.println(message);
    }
}
