package gutu.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как к вам обращаться?");
        String welcomeMessage = "Привет, ";
        String userName = sc.nextLine();
        System.out.println(welcomeMessage + userName + "!");
    }
}