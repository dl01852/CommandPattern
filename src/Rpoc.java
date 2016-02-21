import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2/21/2016.
 */
public class Rpoc {

    List<Command> commands;
    public Rpoc()
    {
        commands = new ArrayList<>();
    }

   public void setCommand(Command command)
   {
       commands.add(command);
   }

    public void callCommand(Command c)
    {
        if(commands.contains(c))
        {
            c.execute();
        }
        else
            System.out.println("I don't know that command");
    }
}
