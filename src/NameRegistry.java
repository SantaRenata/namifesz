import java.util.ArrayList;
import java.util.Arrays;

public class NameRegistry implements Name{

    @Override
    public ArrayList<String> getNames() {
        String[] nevek = {"Béla","Géza"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(nevek));
        return nameList;
    }
    
}
