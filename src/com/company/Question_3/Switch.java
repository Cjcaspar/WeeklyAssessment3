package com.company.Question_3;
import java.util.Scanner;

public class Switch {

    public void platform() {


        System.out.println("What is your favorite gaming platform? \n1. PC \n2. Xbox \n3. Playstation\n4. Nintendo?");

        Scanner scan = new Scanner(System.in);

        switch (scan.nextInt()) {
            case 1:
                System.out.println("PC Master race!");
                break;
            case 2:
                System.out.println("Xbox is your preferred platform.");
                break;
            case 3:
                System.out.println("Playstation is your preferred platform.");
                break;
            case 4:
                System.out.println("Nintendo is your preferred platform.");
                break;
            default:
                System.out.println("Invalid input, please enter 1, 2, 3 or 4");
                platform();
                break;

        }

    }



}
