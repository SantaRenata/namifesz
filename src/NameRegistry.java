/*
* File: NameRegistry.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft II N
* Date: 2022-10-24
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

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
