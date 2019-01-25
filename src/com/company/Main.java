package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputUser();
    }


    public static void inputUser() {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your question ?");

        String askQues = input.nextLine();

        System.out.println("YOU ASKED:\t" + askQues);

        System.out.println("MAGIC 8 BALL SAYS:");

        String answer = Random(askQues);
        System.out.println(answer);

        System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
        String choice = input.nextLine();

        while (choice.equalsIgnoreCase("Y")) {

            System.out.println("What is your question ?");

             askQues = input.nextLine();

            System.out.println("YOU ASKED:\t" + askQues);

            System.out.println("MAGIC 8 BALL SAYS:");

             answer = Random(askQues);
            System.out.println(answer);

            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
             choice = input.nextLine();
        }

        if (choice.equalsIgnoreCase("N")){
            System.out.println("Thank you for playing");
            System.exit(0);
        }
        else {
            System.out.println("Invalid");
            System.exit(0);
        }
    }



        public static String Random (String askQues){

            ArrayList<String> MagicAnswer = new ArrayList<String>();

            MagicAnswer.add("● It is certain");
            MagicAnswer.add("● It is decidedly so");
            MagicAnswer.add("● Yes definitely");
            MagicAnswer.add("● You may rely on it");
            MagicAnswer.add("● As I see it, yes");
            MagicAnswer.add("● Most likely");
            MagicAnswer.add("● Outlook good");
            MagicAnswer.add("● Yes");
            MagicAnswer.add("● Signs point to yes");
            MagicAnswer.add("● Reply hazy try again");
            MagicAnswer.add("● Ask again later");
            MagicAnswer.add("● Better not tell you now");
            MagicAnswer.add("● Cannot predict now");
            MagicAnswer.add("● Concentrate and ask again");
            MagicAnswer.add("● Don't count on it");
            MagicAnswer.add("● My reply is no");
            MagicAnswer.add("● My sources say no");
            MagicAnswer.add("● Outlook not so good");
            MagicAnswer.add("● Very doubtful");

            Collections.shuffle(MagicAnswer);
            return MagicAnswer.get(0);
        }
    }
