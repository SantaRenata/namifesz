/*
* File: App.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft II N
* Date: 2022-10-24
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

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
