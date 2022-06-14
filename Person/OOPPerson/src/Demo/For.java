package Demo;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("FOR");
        for (int i = 0; i < input ; i++ ){
            System.out.println("I " + i);
        }

        // WHILE
        // reset input
        System.out.println("DO WHILE");
        input = 0;
        while (input < 5){
            input ++;
            System.out.println("input: " + input);
        }

        System.out.println("DO WHILE");
        input = 0;
        do {
            input ++;

            System.out.println("Input" + input);
        }
        while (input < 5);

        System.out.println("1: Xuat ra 1");
        System.out.println("2: Xuat ra 2");
        System.out.println("3: Xuat ra 3");
        System.out.print("Nhap lua chon: ");
        int selected = scanner.nextInt();
        switch (selected){
            case 1: {
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            default:{
                System.out.println("Nhap sai");
            }
        }
    }
}
