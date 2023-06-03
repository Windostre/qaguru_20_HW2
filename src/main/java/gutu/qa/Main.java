package gutu.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String welcomeMessage = "Привет";
        String instructionMessage = "Введите ваше имя";
        Scanner sc = new Scanner(System.in);
        System.out.println(instructionMessage);

        String userName = sc.nextLine();
        System.out.println(welcomeMessage + "," + " " + userName + "!");
    }
}