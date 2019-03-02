import java.util.Scanner;

public class Sticks {
    public static void main(String[] args) {
        int player1Hand1 = 1;
        int player1Hand2 = 1;
        int player2Hand1 = 1;
        int player2Hand2 = 1;
        int counter = 1;
        String hitWith = "";
        String hit = "";
        Scanner sc = new Scanner(System.in);
        while (!((player1Hand1 >= 5 && player1Hand1 >= 5) || (player1Hand1 >= 5
            && player1Hand1 >= 5))) {
            if (counter % 2 == 1) {
                System.out.println(
                    "Player 1: Which hand do you wish to hit with?  Enter 1 or 2");
                hitWith = sc.next();
                System.out.println(
                    "Player 1: Which hand of player 2 do you wish to hit?  Enter 1 or 2");
                hit = sc.next();
                if(hitWith.equals("1") && hit.equals("1")) {
                    if(player2Hand1 < 5) {
                        player2Hand1 += player1Hand1;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else if(hitWith.equals("1") && hit.equals("2")) {
                    if(player2Hand2 < 5) {
                        player2Hand2 += player1Hand1;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else if(hitWith.equals("2") && hit.equals("1")) {
                    if(player2Hand1 < 5) {
                        player2Hand1 += player1Hand2;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else if(hitWith.equals("2") && hit.equals("2")) {
                    if(player2Hand2 < 5) {
                        player2Hand2 += player1Hand2;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else {
                    System.out.println("fool u didn't follow the instructions dumbass");
                    break;
                }
                counter++;
            }
            else {
                System.out.println(
                    "Player 2: Which hand do you wish to hit with?  Enter 1 or 2");
                hitWith = sc.next();
                System.out.println(
                    "Player 2: Which hand of player 1 do you wish to hit?  Enter 1 or 2");
                hit = sc.next();
                if(hitWith.equals("1") && hit.equals("1")) {
                    if(player1Hand1 < 5) {
                        player1Hand1 += player2Hand1;
                        
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else if(hitWith.equals("1") && hit.equals("2")) {
                    if(player1Hand2 < 5) {
                        player1Hand2 += player2Hand1;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else if(hitWith.equals("2") && hit.equals("1")) {
                    if(player1Hand2 < 5) {
                        player1Hand2 += player2Hand1;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else if(hitWith.equals("2") && hit.equals("2")) {
                    if(player1Hand2 < 5) {
                        player1Hand2 += player2Hand2;
                        System.out.println("Player 1 Hand 1: " + player1Hand1 + "   Player 1 Hand 2: " + player1Hand2);
                        System.out.println("Player 2 Hand 1: " + player2Hand1 + "   Player 2 Hand 2: " + player2Hand2);
                    }
                }
                else {
                    System.out.println("fool u didn't follow the instructions dumbass");
                }
                counter++;
            }
        }
        sc.close();
        if(player1Hand1 >= 5 && player1Hand2 >= 5) {
            System.out.println("Player 2 Wins!");
        }
        else if(player2Hand1 >= 5 && player2Hand2 >= 5) {
            System.out.println("Player 1 Wins");
            
        }
        else {
            System.out.println("someone didn't follow the instructions so yall suck ass");
        }
    }

}
