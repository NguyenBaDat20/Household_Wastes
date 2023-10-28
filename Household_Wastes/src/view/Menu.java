package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> option;

    public Menu() {
    }

    public Menu(String title, String[] mc) {
        this.title = title;
        option = new ArrayList<>();
        for (String e : mc) {
            this.option.add((T) e);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("-----------------------------");
        for (int i = 0; i < option.size(); i++) {
            System.out.println((i + 1) + "." + option.get(i));
        }
        System.out.println("-----------------------------");
    }

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter selection..");
        try {
            int selection = sc.nextInt();
            sc.nextLine(); 
            return selection;
        } catch (Exception e) {
            sc.nextLine(); 
            
            return -1;
        }
    }

    public abstract void execute(int n);

    public void run() {
        while (true) {
            int n = getSelected();
            if (n > option.size()) {
                System.out.println("Invalid selection. Please enter a valid option.");
                continue; 
            }
            if (n<1){
                System.out.println("Please Enter a number!!");
            }
            execute(n);
            if (n == option.size()) {
                break;
            }
        }
    }

}
