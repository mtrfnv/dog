package com.company;

import java.util.Scanner;

public class Main
{
    public static String s;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("write name of your dog");

        s = sc.nextLine();

        System.out.println("Hello, my name is " + s + " and i woke up. Do I want eat?");
        eatyes();

    }

    public static void barking()
    {
        System.out.println("Oh,no. My bowl is empty! That's why I'm barking. Has my owner heard me and filled my bowl?");
        s = sc.nextLine();
        if (s.equals("yes"))
        {
            System.out.println("Oh,year. That's good. It' so delicious. Do I want to eat more?");
            eatyes();
        }
        else    barking();

    }

    public static void eatyes()
    {
        s = sc.nextLine();
        if (s.equals("yes"))
        {
            System.out.println("Well, i go to the kitchen and see the bowl. is it empty?");

            s = sc.nextLine();
            if (s.equals("yes"))
            {
                barking();
            }

            else
            {
                System.out.println("Oh,year. That's good. It' so delicious. Do I want to eat more?");
                eatyes();
            }
        }
        else  eatno();
    }

    public static void eatno()
    {

            System.out.println("Well, I don't eat and now you need to decide what i'll do next:");
            System.out.println("1 - play with the ball");
            System.out.println("2 - gnaw bone");
            System.out.println("3 - sleep");
            System.out.println("4 - go for a walk");

            s = sc.nextLine();

            if (s.equals("1"))
            {
                System.out.println("Ok, I played with a ball. And do I want to eat?");
                eatyes();
            }

            if (s.equals("2"))
            {
                System.out.println("Ok, I gnawed my bone. And do I want to eat?");
                eatyes();
            }

            if (s.equals("3"))
            {
                System.out.println("Ok, I slept. And do I want to eat?");
                eatyes();
            }

            if (s.equals("4")) goforawoalk();

    }
            private static void goforawoalk()
                {
                    System.out.println("Ok, I went for a walk with my owner. Are we on the playground for the dogs?");
                    s = sc.nextLine();
                    if (s.equals("yes"))
                    {
                        System.out.println("Hooray! We are on the playground. And what are we going to do here?");
                        System.out.println("1 - play with other dogs");
                        System.out.println("2 - run after the stick");
                        System.out.println("3 - overcome different obstacles");

                    }
                    else
                    {
                        System.out.println("Ok. We didn't go to the playground. So i'd like to do:");
                        System.out.println("1 - go the toilet");
                        System.out.println("2 - bark");
                        System.out.println("3 - bite the hooligan");
                        System.out.println("4 - run after the car");
                    }
                    s = sc.nextLine();
                    System.out.println("Well. I played a lot here. Am I tired?");
                    s = sc.nextLine();

                    if (s.equals("yes")) {
                        System.out.println("Oh, i'm tired. and i want:");
                        System.out.println("1 - ask for the hand");
                        System.out.println("2 - nap");
                        System.out.println("3 - go home");

                        s = sc.nextLine();
                        System.out.println("Well. We went home. Am I hungry?");
                        eatyes();
                    }

                    else
                    {
                        System.out.println("Well, I'm not tired. However does my owner go home?");
                        s = sc.nextLine();
                        if (s.equals("yes"))
                        {
                            System.out.println("Well. We went home. Am I hungry?");
                            s = sc.nextLine();
                            eatyes();

                        }
                        else goforawoalk();
                    }
                }
}






