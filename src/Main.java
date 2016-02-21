/**
 * Created by David on 2/21/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        Rpoc rpoc = new Rpoc();
        Division division = new Division();
        ColumnRight columnRight = new ColumnRight(division);
        ColumnLeft columnLeft = new ColumnLeft(division);
        rpoc.setCommand(columnRight);
        rpoc.setCommand(columnLeft);


        rpoc.callCommand(columnLeft);
        rpoc.callCommand(columnRight);
    }
}
