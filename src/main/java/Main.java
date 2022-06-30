import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String playAgain;
        Scanner input = new Scanner(System.in);
        double amountInShekel;
        double amountInDollar;
        int conversionChoice = 0;
        Coin usd = CoinsFactory.getCoinInstance(Coins.USD);
        Coin ils = CoinsFactory.getCoinInstance(Coins.ILS);
        double result = 0;
        ArrayList<Double> results = new ArrayList<Double>();
        boolean repeat;

        //Welcome Screen
        System.out.println(" Welcome to currency converter");

        do {
                  System.out.println(" Please choose an option (1/2) \n1. Dollars to Shekels\n2. Shekels to Dollars");

                    do{
                        if(input.hasNextInt()) {
                            conversionChoice = input.nextInt();
                            input.nextLine();
                            repeat = false;
                     } else {
                            System.out.println("Invalid choice, please try again");
                            input.nextLine();
                            repeat = true;}
                    }while (repeat == true);



              //Choice Screen
              switch (conversionChoice) {
                  case 1: //dollar to shekel
                      do {
                          System.out.println("please enter an amount to convert: ");
                          if (input.hasNextDouble()) {

                              amountInDollar = input.nextDouble();
                              result = usd.calculate(amountInDollar);
                              System.out.println(amountInDollar + " dollars equals to " + result + " shekels");
                              repeat = false;
                          }else {
                              System.out.println("Invalid choice, please try again");
                              input.nextLine();
                              repeat = true;
                          }
                      }while (repeat == true);



                  case 2: //shekel to dollar
                      do
                      {
                          System.out.println("please enter an amount to convert: ");
                          if (input.hasNextDouble()){
                              amountInShekel = input.nextDouble();
                              result = ils.calculate(amountInShekel);
                              System.out.println(amountInShekel + " shekels equals to " + result + " dollars");
                              repeat = false;
                          }else {
                              System.out.println("Invalid choice, please try again");
                              input.nextLine();
                                  repeat = true;}


                      }  while (repeat == true);
              }

              results.add(result);
            for (int i = 0; i < results.size(); i++) {}


          //third screen (results are shown at the end of switch case)

          System.out.println("Would you like to start over? ");
            do
            { input = new Scanner(System.in);
                playAgain= input.nextLine();

                if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    repeat = false;
                }

                else{
                    System.out.println("Invalid choice, please try again");
                    input.nextLine();
                    repeat = true;


                }
            }  while (repeat == true);

      } while (playAgain.equalsIgnoreCase("Y"));



        //        end screen
        if (playAgain.equalsIgnoreCase("N")){
        System.out.println("Thanks for using our currency converter");
            System.out.println("The results are: ");
        results.forEach(System.out::println);
           File resultsFile = new File("results.txt");
           resultsFile.createNewFile();

           PrintStream writeList = new PrintStream(resultsFile);
           for (double line : results){
               writeList.println(line);
           }
           writeList.close();}
    }
}





