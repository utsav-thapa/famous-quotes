package com.pluralsight;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "1. The only thing we have to fear is fear itself. – Franklin D. Roosevelt",
                "2. I think, therefore I am. – René Descartes",
                "3. That's one small step for man, one giant leap for mankind. – Neil Armstrong",
                "4. In the middle of difficulty lies opportunity. – Albert Einstein",
                "5. To be, or not to be, that is the question. – William Shakespeare",
                "6. The unexamined life is not worth living. – Socrates",
                "7. Stay hungry, stay foolish. – Steve Jobs",
                "8. The journey of a thousand miles begins with a single step. – Lao Tzu",
                "9. That which does not kill us makes us stronger. – Friedrich Nietzsche",
                "10. Life is what happens when you're busy making other plans. – John Lennon"
        };
        System.out.println("\t \t Great quotes.");
        for (int i = 0; i < quotes.length; i++) {
            System.out.println(quotes[i]);
        }
        Scanner scanner = new Scanner(System.in);
        boolean wantsAnotherQuote = false;
        do{
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Choose a quote to display or enter random for a random quote or exit to exit the program.");
            String userInput = scanner.nextLine();



            switch (userInput) {
                case ("random"):
                    int random = (int) (Math.random() * 10);
                    System.out.println(quotes[random]);
                    break;
                case ("exit"):
                    wantsAnotherQuote = true;
                    break;
                default:
                    try {
                        int user = Integer.parseInt(userInput);
                        System.out.println(quotes[user - 1]);
                        System.out.println("Would you like to see another quote? (Y/N)");
                        String redo = scanner.nextLine();
                        if(redo.equals("n")){
                            wantsAnotherQuote = true;
                        }

                    } catch (Exception s) {
                        System.out.println(s);
                        System.err.println("Wrong input!");
                        System.out.println("Choose a quote to display or enter random for a random quote or exit to exit the program.");

                    }

            }
        }
        while(!wantsAnotherQuote);
    }
}



