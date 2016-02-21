/**
 * Created by David on 2/21/2016.
 */
public class ColumnLeft implements Command {

    private Division division;
    public ColumnLeft(Division d)
    {
        this.division = d;

    }

    public void execute()
    {
        division.columnLeft();
    }
}
