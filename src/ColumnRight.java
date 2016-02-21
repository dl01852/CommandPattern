/**
 * Created by David on 2/21/2016.
 */
public class ColumnRight implements Command {

    Division division;

    public ColumnRight(Division division)
    {
        this.division = division;
    }

    public void execute()
    {
        division.columnRight();
    }
}
