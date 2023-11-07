package src.ui;
import src.domain.Doctor;
import src.service.Service;

import java.util.Scanner;

public class UI {
    private Service serv;

    public UI(Service serv)
    {
        this.serv = serv;
    }

    public void displayMenu()
    {
        System.out.println("1 - Show doctors");
        System.out.println("0 - Exit");
    }

    public void printAll()
    {
        for (Doctor d: this.serv.getAll())
            System.out.println(d);
    }

    public void run()
    {
        while (true)
        {
            this.displayMenu();
            System.out.println("Input a command: ");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command)
            {
                case 0:
                    return;
                case 1:
                    this.printAll();
                    break;
            }
        }
    }
}
