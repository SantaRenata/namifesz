import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sánta Renáta Diána, Szoft II N, 2022-10-24");
        NameRegistry nameRegistry = new NameRegistry();
        ArrayList<String> nameList = nameRegistry.getNames();
        for(String name : nameList){
            System.out.println(name);
        }
    }
}
