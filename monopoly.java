
import java.util.*;

public class monopoly {

    public static void main(String[] args) {
        System.out.println("\t welcome to");
        System.out.println("|--------------------------|\n"
                + "|         MONOPOLY         |\n"
                + "|--------------------------|");

        int currentMoneyPlayer1 = 500;
        int currentMoneyPlayer2 = 500;
        int currentMoneyPlayer3 = 500;
        int currentMoneyPlayer4 = 500;

        ArrayList<String> propertiesOfPlayer1 = new ArrayList<>();
        ArrayList<String> propertiesOfPlayer2 = new ArrayList<>();
        ArrayList<String> propertiesOfPlayer3 = new ArrayList<>();
        ArrayList<String> propertiesOfPlayer4 = new ArrayList<>();

        int diceValue;
        int userInputRent;
        String location = null;
        int cost = 0;
        int rent = 0;
        int buyOrSkip;
        int userInputUpgrade;
        int upgradeCharge = 40;
        int addedDiceValue2 = 0;
        int addedDiceValue3 = 0;
        int addedDiceValue4 = 0;

        String a = "'Berlin'";
        int plotPrice1 = 80;
        ArrayList<Integer> rentA1 = new ArrayList<>();
        rentA1.add(10);

        String b = "'Moscow'";
        int plotPrice2 = 95;
        ArrayList<Integer> rentA2 = new ArrayList<>();
        rentA2.add(15);

        String c = "'Oslo'";
        int plotPrice3 = 100;
        ArrayList<Integer> rentA3 = new ArrayList<>();
        rentA3.add(20);

        String d = "'Agra'";
        int plotPrice4 = 110;
        ArrayList<Integer> rentA4 = new ArrayList<>();
        rentA4.add(30);

        String e = "'Los Angeles'";
        int plotPrice5 = 125;
        ArrayList<Integer> rentA5 = new ArrayList<>();
        rentA5.add(35);

        String f = "'Hongkong'";
        int plotPrice6 = 140;
        ArrayList<Integer> rentA6 = new ArrayList<>();
        rentA6.add(40);

        String g = "'Singapore'";
        int plotPrice7 = 150;
        ArrayList<Integer> rentA7 = new ArrayList<>();
        rentA7.add(50);

        String h = "'bali'";
        int plotPrice8 = 160;
        ArrayList<Integer> rentA8 = new ArrayList<>();
        rentA8.add(55);

        String I = "'Sanghai'";
        int plotPrice9 = 175;
        ArrayList<Integer> rentA9 = new ArrayList<>();
        rentA9.add(60);

        String j = "'Tokyo'";
        int plotPrice10 = 200;
        ArrayList<Integer> rentA10 = new ArrayList<>();
        rentA10.add(70);

        String k = "'Delhi'";
        int plotPrice11 = 250;
        ArrayList<Integer> rentA11 = new ArrayList<>();
        rentA11.add(75);

        String l = "'Police Station'";
        int plotPrice12 = 300;
        ArrayList<Integer> rentA12 = new ArrayList<>();
        rentA12.add(80);

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "This game can be played by 4 members.\nFirst tell me how many of you are playing this game");
        int noOfPlayer;

        do {
            noOfPlayer = scanner.nextInt();
            if (noOfPlayer == 4) {
                System.out.printf("Okey so there are %d no. of players\n", noOfPlayer);
                break;
            } else {
                System.out.println("I already said this game can be played by only 4 members only!!");
            }
        } while (noOfPlayer != 4);

        // player 1
        int addedDiceValue1 = 0;
        do {
            System.out.println("Press 1 to roll the dice");
            int userInput;
            for (int i = 1; i < noOfPlayer; ) {

                do {
                    diceValue = ((int) (Math.random() * 6) + 1);
                    userInput = scanner.nextInt();

                    if (userInput == 1) {
                        System.out.printf(" You got %d,\n  moving %d step\n", diceValue, diceValue);
                        addedDiceValue1 += diceValue;
                    } else {
                        System.out.println("Incorrect action");
                    }

                } while (userInput != 1);

                if (addedDiceValue1 > 12) {
                    addedDiceValue1 = addedDiceValue1 % 12;
                }

                i++;

                if (addedDiceValue1 == 1) {
                    location = a;
                    cost = plotPrice1;
                    rent = Collections.max(rentA1);
                } else if (addedDiceValue1 == 2) {
                    location = b;
                    cost = plotPrice2;
                    rent = Collections.max(rentA2);
                } else if (addedDiceValue1 == 3) {
                    location = c;
                    cost = plotPrice3;
                    rent = Collections.max(rentA3);
                } else if (addedDiceValue1 == 4) {
                    location = d;
                    cost = plotPrice4;
                    rent = Collections.max(rentA4);
                } else if (addedDiceValue1 == 5) {
                    location = e;
                    cost = plotPrice5;
                    rent = Collections.max(rentA5);
                } else if (addedDiceValue1 == 6) {
                    location = f;
                    cost = plotPrice6;
                    rent = Collections.max(rentA6);
                } else if (addedDiceValue1 == 7) {
                    location = g;
                    cost = plotPrice7;
                    rent = Collections.max(rentA7);
                } else if (addedDiceValue1 == 8) {
                    location = h;
                    cost = plotPrice8;
                    rent = Collections.max(rentA8);
                } else if (addedDiceValue1 == 9) {
                    location = I;
                    cost = plotPrice9;
                    rent = Collections.max(rentA9);
                } else if (addedDiceValue1 == 10) {
                    location = j;
                    cost = plotPrice10;
                    rent = Collections.max(rentA10);
                } else if (addedDiceValue1 == 11) {
                    location = k;
                    cost = plotPrice11;
                    rent = Collections.max(rentA11);
                } else if (addedDiceValue1 == 12) {
                    location = l;
                    cost = plotPrice12;
                    rent = Collections.max(rentA12);
                }

                if (propertiesOfPlayer2.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,now you have to pay the rent $%d to player 2.\n    Press 3 to pay the rent.",
                            location, rent);

                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer1 -= rent;
                            System.out.printf("     Rent paid.\n      Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer1,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer1.contains(location)) {
                    System.out.printf(
                            "You are at your own property %s,relaxx :)\nWould you like to upgrade your property,(upgrade charge :$%d) it will charge some money but increase the rent value.\ncurrent rent%d\nPress 4 to upgrade and 0 to skip.",
                            location,
                            upgradeCharge, rent);
                    do {
                        userInputUpgrade = scanner.nextInt();
                        if (userInputUpgrade == 4) {
                            currentMoneyPlayer1 -= upgradeCharge;
                            rent += 10;
                            if (addedDiceValue1 == 1) {
                                rentA1.add(rent);
                            } else if (addedDiceValue1 == 2) {
                                rentA2.add(rent);
                            } else if (addedDiceValue1 == 3) {
                                rentA3.add(rent);
                            } else if (addedDiceValue1 == 4) {
                                rentA4.add(rent);
                            } else if (addedDiceValue1 == 5) {
                                rentA5.add(rent);
                            } else if (addedDiceValue1 == 6) {
                                rentA6.add(rent);
                            } else if (addedDiceValue1 == 7) {
                                rentA7.add(rent);
                            } else if (addedDiceValue1 == 8) {
                                rentA8.add(rent);
                            } else if (addedDiceValue1 == 9) {
                                rentA9.add(rent);
                            } else if (addedDiceValue1 == 10) {
                                rentA10.add(rent);
                            } else if (addedDiceValue1 == 11) {
                                rentA11.add(rent);
                            } else if (addedDiceValue1 == 12) {
                                rentA12.add(rent);
                            }
                            System.out.printf(
                                    "Upgraded!\n upgraded rent :$%d\nNow you have :$%d\nNow turn of player 2.\n", rent,
                                    currentMoneyPlayer1);
                            upgradeCharge += 10;
                            break;
                        } else if (userInputUpgrade == 0) {
                            System.out.printf("Now turn of player 2.");
                            break;
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputUpgrade != 0);
                } else if (propertiesOfPlayer3.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,now you have to pay the rent $%d to player 3.\n    Press 3 to pay the rent.",
                            location, rent);

                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer1 -= rent;
                            System.out.printf("     Rent paid.\n      Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer1,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer4.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,now you have to pay the rent $%d to player 4.\n    Press 3 to pay the rent.",
                            location, rent);

                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer1 -= rent;
                            System.out.printf("     Rent paid.\n       Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer1,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else {
                    System.out.printf(
                            "   Now you are on %s Plot price:$%d currentMoney:$%d \n    Press 2 to purchase or press 0 to skip.",
                            location, cost,
                            currentMoneyPlayer1);

                    do {
                        buyOrSkip = scanner.nextInt();
                        if (buyOrSkip == 2) {
                            currentMoneyPlayer1 -= cost;
                            System.out.printf("     Congratulations! You purchased %s.\n      Now you have $%d\n",
                                    location,
                                    currentMoneyPlayer1);
                            propertiesOfPlayer1.add(location);

                            System.out.printf("Now turn of player %d.", i);
                            break;
                        } else if (buyOrSkip == 0) {
                            System.out.printf("Now turn of player %d.", i);
                        } else {
                            System.out.println("Incorrect action");
                        }
                    } while (buyOrSkip != 1 || buyOrSkip != 0);
                }

                // player 2
                System.out.println("\nPress 1 to roll the dice");
                i++;

                do {
                    diceValue = (int) (Math.random() * 6) + 1;

                    userInput = scanner.nextInt();
                    if (userInput == 1) {
                        System.out.printf("  You got %d,\n   moving %d step\n", diceValue, diceValue);
                        addedDiceValue2 += diceValue;
                    } else {
                        System.out.println("Incorrect action");
                    }

                } while (userInput != 1);

                if (addedDiceValue2 > 12) {
                    addedDiceValue2 = addedDiceValue2 % 12;
                }

                if (addedDiceValue2 == 1) {
                    location = a;
                    cost = plotPrice1;
                    rent = Collections.max(rentA1);
                } else if (addedDiceValue2 == 2) {
                    location = b;
                    cost = plotPrice2;
                    rent = Collections.max(rentA2);
                } else if (addedDiceValue2 == 3) {
                    location = c;
                    cost = plotPrice3;
                    rent = Collections.max(rentA3);
                } else if (addedDiceValue2 == 4) {
                    location = d;
                    cost = plotPrice4;
                    rent = Collections.max(rentA4);
                } else if (addedDiceValue2 == 5) {
                    location = e;
                    cost = plotPrice5;
                    rent = Collections.max(rentA5);
                } else if (addedDiceValue2 == 6) {
                    location = f;
                    cost = plotPrice6;
                    rent = Collections.max(rentA6);
                } else if (addedDiceValue2 == 7) {
                    location = g;
                    cost = plotPrice7;
                    rent = Collections.max(rentA7);
                } else if (addedDiceValue2 == 8) {
                    location = h;
                    cost = plotPrice8;
                    rent = Collections.max(rentA8);
                } else if (addedDiceValue2 == 9) {
                    location = I;
                    cost = plotPrice9;
                    rent = Collections.max(rentA9);
                } else if (addedDiceValue2 == 10) {
                    location = j;
                    cost = plotPrice10;
                    rent = Collections.max(rentA10);
                } else if (addedDiceValue2 == 11) {
                    location = k;
                    cost = plotPrice11;
                    rent = Collections.max(rentA11);
                } else if (addedDiceValue2 == 12) {
                    location = l;
                    cost = plotPrice12;
                    rent = Collections.max(rentA12);
                }

                if (propertiesOfPlayer1.contains(location)) {
                    System.out.printf(
                            "    Oops you are at %s,now you have to pay the rent $%d to player 1.\n     Press 3 to pay the rent.",
                            location, rent);
                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer2 -= rent;
                            System.out.printf("      Rent paid.\n       Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer2,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer2.contains(location)) {
                    System.out.printf(
                            "You are at your own property %s,relaxx :)\nWould you like to upgrade your property,(upgrade charge :$%d) it will charge some money but increase the rent value.\ncurrent rent%d\nPress 4 to upgrade and 0 to skip.",
                            location,
                            upgradeCharge, rent);
                    do {
                        userInputUpgrade = scanner.nextInt();
                        if (userInputUpgrade == 4) {
                            currentMoneyPlayer2 -= upgradeCharge;
                            rent += 10;

                            if (addedDiceValue2 == 1) {
                                rentA1.add(rent);
                            } else if (addedDiceValue2 == 2) {
                                rentA2.add(rent);
                            } else if (addedDiceValue2 == 3) {
                                rentA3.add(rent);
                            } else if (addedDiceValue2 == 4) {
                                rentA4.add(rent);
                            } else if (addedDiceValue2 == 5) {
                                rentA5.add(rent);
                            } else if (addedDiceValue2 == 6) {
                                rentA6.add(rent);
                            } else if (addedDiceValue2 == 7) {
                                rentA7.add(rent);
                            } else if (addedDiceValue2 == 8) {
                                rentA8.add(rent);
                            } else if (addedDiceValue2 == 9) {
                                rentA9.add(rent);
                            } else if (addedDiceValue2 == 10) {
                                rentA10.add(rent);
                            } else if (addedDiceValue2 == 11) {
                                rentA11.add(rent);
                            } else if (addedDiceValue2 == 12) {
                                rentA12.add(rent);
                            }

                            System.out.printf(
                                    "Upgraded! upgraded rent :$%d\nNow you have :$%d\nNow turn of player 3.\n", rent,
                                    currentMoneyPlayer2);
                            upgradeCharge += 10;
                            break;
                        } else if (userInputUpgrade == 0) {
                            System.out.printf("Now turn of player 3.");
                            break;
                        } else {
                            System.out.println("Invalid operation,Try again");

                        }
                    } while (userInputUpgrade != 0);
                } else if (propertiesOfPlayer3.contains(location)) {
                    System.out.printf(
                            "    Oops you are at %s,now you have to pay the rent $%d to player 3.\n     Press 3 to pay the rent.",
                            location, rent);

                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer2 -= rent;
                            System.out.printf("      Rent paid.\n       Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer2,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer4.contains(location)) {
                    System.out.printf(
                            "    Oops you are at %s,now you have to pay the rent $%d to player 4.\n     Press 3 to pay the rent.",
                            location, rent);

                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer2 -= rent;
                            System.out.printf("      Rent paid.\n       Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer2,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else {
                    System.out.printf(
                            "    Now you are on %s  Plot price:$%d currentMoney:$%d \n     Press 2 to purchase or press 0 to skip.",
                            location, cost,
                            currentMoneyPlayer2);

                    do {
                        buyOrSkip = scanner.nextInt();
                        if (buyOrSkip == 2) {
                            currentMoneyPlayer2 -= cost;
                            System.out.printf("      Congratulations! You purchased %s.\n       Now you have $%d\n",
                                    location,
                                    currentMoneyPlayer2);
                            propertiesOfPlayer2.add(location);

                            System.out.printf("Now turn of player %d.", i);
                            break;
                        } else if (buyOrSkip == 0) {
                            System.out.printf("Now turn of player %d.", i);
                            break;
                        } else {
                            System.out.println("Incorrect action");
                        }
                    } while (buyOrSkip != 1 || buyOrSkip != 0);
                }

                // player3
                System.out.println("\nPress 1 to roll the dice");
                i++;

                do {
                    diceValue = (int) (Math.random() * 6) + 1;

                    userInput = scanner.nextInt();
                    if (userInput == 1) {
                        System.out.printf(" You got %d,\n  moving %d step\n", diceValue, diceValue);
                        addedDiceValue3 += diceValue;
                    } else {
                        System.out.println("Incorrect action");
                    }

                } while (userInput != 1);

                if (addedDiceValue3 > 12) {
                    addedDiceValue3 = addedDiceValue3 % 12;
                }

                if (addedDiceValue3 == 1) {
                    location = a;
                    cost = plotPrice1;
                    rent = Collections.max(rentA1);
                } else if (addedDiceValue3 == 2) {
                    location = b;
                    cost = plotPrice2;
                    rent = Collections.max(rentA2);
                } else if (addedDiceValue3 == 3) {
                    location = c;
                    cost = plotPrice3;
                    rent = Collections.max(rentA3);
                } else if (addedDiceValue3 == 4) {
                    location = d;
                    cost = plotPrice4;
                    rent = Collections.max(rentA4);
                } else if (addedDiceValue3 == 5) {
                    location = e;
                    cost = plotPrice5;
                    rent = Collections.max(rentA5);
                } else if (addedDiceValue3 == 6) {
                    location = f;
                    cost = plotPrice6;
                    rent = Collections.max(rentA6);
                } else if (addedDiceValue3 == 7) {
                    location = g;
                    cost = plotPrice7;
                    rent = Collections.max(rentA7);
                } else if (addedDiceValue3 == 8) {
                    location = h;
                    cost = plotPrice8;
                    rent = Collections.max(rentA8);
                } else if (addedDiceValue3 == 9) {
                    location = I;
                    cost = plotPrice9;
                    rent = Collections.max(rentA9);
                } else if (addedDiceValue3 == 10) {
                    location = j;
                    cost = plotPrice10;
                    rent = Collections.max(rentA10);
                } else if (addedDiceValue3 == 11) {
                    location = k;
                    cost = plotPrice11;
                    rent = Collections.max(rentA11);
                } else if (addedDiceValue3 == 12) {
                    location = l;
                    cost = plotPrice12;
                    rent = Collections.max(rentA12);
                }

                if (propertiesOfPlayer1.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,Now you have to pay the rent $%d to player 1.\n    Press 3 to pay the rent.",
                            location,
                            rent);
                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer3 -= rent;
                            System.out.printf("      Rent paid.\n       Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer3,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer2.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,Now you have to pay the rent $%d to player 2.\n    Press 3 to pay the rent.",
                            location,
                            rent);
                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer3 -= rent;
                            System.out.printf("     Rent paid.\n      Now you have %d\nNow turn of player%d",
                                    currentMoneyPlayer3,
                                    i);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer3.contains(location)) {
                    System.out.printf(
                            "You are at your own property %s,relaxx :)\nWould you like to upgrade your property,(upgrade charge :$%d) it will charge some money but increase the rent value.\ncurrent rent:$%d\nPress 4 to upgrade and 0 to skip.",
                            location,
                            upgradeCharge, rent);

                    do {
                        userInputUpgrade = scanner.nextInt();
                        if (userInputUpgrade == 4) {
                            currentMoneyPlayer3 -= upgradeCharge;
                            rent += 10;

                            if (addedDiceValue3 == 1) {
                                rentA1.add(rent);
                            } else if (addedDiceValue3 == 2) {
                                rentA2.add(rent);
                            } else if (addedDiceValue3 == 3) {
                                rentA3.add(rent);
                            } else if (addedDiceValue3 == 4) {
                                rentA4.add(rent);
                            } else if (addedDiceValue3 == 5) {
                                rentA5.add(rent);
                            } else if (addedDiceValue3 == 6) {
                                rentA6.add(rent);
                            } else if (addedDiceValue3 == 7) {
                                rentA7.add(rent);
                            } else if (addedDiceValue3 == 8) {
                                rentA8.add(rent);
                            } else if (addedDiceValue3 == 9) {
                                rentA9.add(rent);
                            } else if (addedDiceValue3 == 10) {
                                rentA10.add(rent);
                            } else if (addedDiceValue3 == 11) {
                                rentA11.add(rent);
                            } else if (addedDiceValue3 == 12) {
                                rentA12.add(rent);
                            }

                            System.out.printf("Upgraded!  upgraded rent :$%d\nNow you have :$%d\nNow turn of player 4.",
                                    rent, currentMoneyPlayer3);
                            upgradeCharge += 10;
                            break;
                        } else if (userInputUpgrade == 0) {
                            System.out.printf("Now turn of player 4.");
                            break;
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }

                    } while (userInputUpgrade != 0);
                } else if (propertiesOfPlayer4.contains(location)) {
                    System.out.printf(
                            "    Oops you are at %s,now you have to pay the rent $%d to player 4.\n     Press 3 to pay the rent.",
                            location,
                            rent);

                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer3 -= rent;
                            System.out.printf("      Rent paid.\n       Now you have %d\nNow turn of player %d",
                                    currentMoneyPlayer3,
                                    i);
                        } else {
                            System.out.println("Invalid operation");
                        }
                    } while (userInputRent != 3);
                } else {
                    System.out.printf(
                            "   Now you are on %s  Plot price:$%d currentMoney:$%d \n    Press 2 to purchase or press 0 to skip.",
                            location, cost,
                            currentMoneyPlayer3);
                    do {
                        buyOrSkip = scanner.nextInt();
                        if (buyOrSkip == 2) {
                            currentMoneyPlayer3 -= cost;
                            System.out.printf("     Congratulations! You purchased %s.\n      Now you have $%d\n",
                                    location,
                                    currentMoneyPlayer3);
                            propertiesOfPlayer3.add(location);

                            System.out.printf("Now turn of player %d.", i);
                            break;
                        } else if (buyOrSkip == 0) {
                            System.out.printf("Now turn of player %d.", i);
                            break;
                        } else {
                            System.out.println("Incorrect action");
                        }
                    } while (buyOrSkip != 1 || buyOrSkip != 0);
                }

                // player 4
                System.out.println("\nPress 1 to roll the dice");

                do {
                    diceValue = (int) (Math.random() * 6) + 1;

                    userInput = scanner.nextInt();
                    if (userInput == 1) {
                        System.out.printf(" You got %d,\n  moving %d step\n", diceValue, diceValue);
                        addedDiceValue4 += diceValue;
                    } else {
                        System.out.println("Incorrect action");
                    }

                } while (userInput != 1);

                if (addedDiceValue4 > 12) {
                    addedDiceValue4 = addedDiceValue4 % 12;
                }

                if (addedDiceValue4 == 1) {
                    location = a;
                    cost = plotPrice1;
                    rent = Collections.max(rentA1);
                } else if (addedDiceValue4 == 2) {
                    location = b;
                    cost = plotPrice2;
                    rent = Collections.max(rentA2);
                } else if (addedDiceValue4 == 3) {
                    location = c;
                    cost = plotPrice3;
                    rent = Collections.max(rentA3);
                } else if (addedDiceValue4 == 4) {
                    location = d;
                    cost = plotPrice4;
                    rent = Collections.max(rentA4);
                } else if (addedDiceValue4 == 5) {
                    location = e;
                    cost = plotPrice5;
                    rent = Collections.max(rentA5);
                } else if (addedDiceValue4 == 6) {
                    location = f;
                    cost = plotPrice6;
                    rent = Collections.max(rentA6);
                } else if (addedDiceValue4 == 7) {
                    location = g;
                    cost = plotPrice7;
                    rent = Collections.max(rentA7);
                } else if (addedDiceValue4 == 8) {
                    location = h;
                    cost = plotPrice8;
                    rent = Collections.max(rentA8);
                } else if (addedDiceValue4 == 9) {
                    location = I;
                    cost = plotPrice9;
                    rent = Collections.max(rentA9);
                } else if (addedDiceValue4 == 10) {
                    location = j;
                    cost = plotPrice10;
                    rent = Collections.max(rentA10);
                } else if (addedDiceValue4 == 11) {
                    location = k;
                    cost = plotPrice11;
                    rent = Collections.max(rentA11);
                } else if (addedDiceValue4 == 12) {
                    location = l;
                    cost = plotPrice12;
                    rent = Collections.max(rentA12);
                }

                if (propertiesOfPlayer1.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,now you have to pay the rent $%d to player 1.\n    Press 3 to pay the rent.",
                            location,
                            rent);
                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer4 -= rent;
                            System.out.printf("     Rent paid.\n      Now you have %d\n",
                                    currentMoneyPlayer4);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer2.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,now you have to pay the rent $%d to player 2.\n    Press 3 to pay the rent.",
                            location, rent);
                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer4 -= rent;
                            System.out.printf("     Rent paid.\n      Now you have %d\n",
                                    currentMoneyPlayer4);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else if (propertiesOfPlayer4.contains(location)) {
                    System.out.printf(
                            "You are at your own property %s,relaxx :)\nWould you like to upgrade your property,(upgrade charge :$%d) it will charge some money but increase the rent value.\ncurrent rent:$%d\nPress 4 to upgrade and 0 to skip.",
                            location,
                            upgradeCharge, rent);
                    do {
                        userInputUpgrade = scanner.nextInt();
                        if (userInputUpgrade == 4) {

                            currentMoneyPlayer4 -= upgradeCharge;
                            rent += 10;
                            if (addedDiceValue3 == 1) {
                                rentA1.add(rent);
                            } else if (addedDiceValue4 == 2) {
                                rentA2.add(rent);
                            } else if (addedDiceValue4 == 3) {
                                rentA3.add(rent);
                            } else if (addedDiceValue4 == 4) {
                                rentA4.add(rent);
                            } else if (addedDiceValue4 == 5) {
                                rentA5.add(rent);
                            } else if (addedDiceValue4 == 6) {
                                rentA6.add(rent);
                            } else if (addedDiceValue4 == 7) {
                                rentA7.add(rent);
                            } else if (addedDiceValue4 == 8) {
                                rentA8.add(rent);
                            } else if (addedDiceValue4 == 9) {
                                rentA9.add(rent);
                            } else if (addedDiceValue4 == 10) {
                                rentA10.add(rent);
                            } else if (addedDiceValue4 == 11) {
                                rentA11.add(rent);
                            } else if (addedDiceValue4 == 12) {
                                rentA12.add(rent);
                            }
                            System.out.printf(
                                    "Upgraded!  upgraded rent :$%d\nNow you have :$%d\n", rent,
                                    currentMoneyPlayer4);
                            upgradeCharge += 10;
                            break;
                        } else if (userInputUpgrade == 0) {
                            break;
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }

                    } while (userInputUpgrade != 0);
                } else if (propertiesOfPlayer3.contains(location)) {
                    System.out.printf(
                            "   Oops you are at %s,now you have to pay the rent $%d to player 3.\n    Press 3 to pay the rent.",
                            location,
                            rent);
                    do {
                        userInputRent = scanner.nextInt();
                        if (userInputRent == 3) {
                            currentMoneyPlayer4 -= rent;
                            System.out.printf("     Rent paid.\n      Now you have %d\n",
                                    currentMoneyPlayer4);
                        } else {
                            System.out.println("Invalid operation,Try again");
                        }
                    } while (userInputRent != 3);
                } else {
                    System.out.printf(
                            "   Now you are on %s  Plot price:$%d currentMoney:$%d \n    Press 2 to purchase or press 0 to skip.",
                            location, cost,
                            currentMoneyPlayer4);
                    do {
                        buyOrSkip = scanner.nextInt();
                        if (buyOrSkip == 2) {
                            currentMoneyPlayer4 -= cost;
                            propertiesOfPlayer4.add(location);
                            System.out.printf("     Congratulations! You purchased %s.\n      Now you have $%d\n",
                                    location,
                                    currentMoneyPlayer4);
                            break;
                        } else if (buyOrSkip == 0) {
                            break;
                        } else {
                            System.out.println("Incorrect action");
                        }
                    } while (buyOrSkip != 1 || buyOrSkip != 0);
                }
            }
            System.out.println("\nRound complete ,you all got salary $100.\n\nNow turn of player 1.");
            currentMoneyPlayer1 += 100;
            currentMoneyPlayer2 += 100;
            currentMoneyPlayer3 += 100;
            currentMoneyPlayer4 += 100;
        } while (currentMoneyPlayer1 >= 0 && currentMoneyPlayer2 >= 0 && currentMoneyPlayer3 >= 0
                && currentMoneyPlayer4 >= 0);
        System.out.printf(
                "\nLooking a player has ran out of money :( \n Current money of all players respectively : %d, %d, %d, %d\n Press 9 to close the game",
                currentMoneyPlayer1, currentMoneyPlayer2, currentMoneyPlayer3, currentMoneyPlayer4);
        int closeOrNot;
        do {
            closeOrNot = scanner.nextInt();
            if (closeOrNot == 9) {
                System.out.println("Thanks for playing.  :)");
            } else {
                System.out.println("Press 9 and close the game properly!");
            }
        } while (closeOrNot != 9);
        scanner.close();
    }
}
