
package controller;

import common.Library;
import view.Menu;


public class GarbageCollectionApp extends Menu<String>{
    Library lb;
    static String[] options = {"Input", "Print", "Exit"};
    public GarbageCollectionApp() {
        super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
        lb = new Library();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> lb.inputGarbageAtStations();
            case 2 -> lb.displayCost();
            case 3 -> System.exit(0);
        }
    }
  
}








