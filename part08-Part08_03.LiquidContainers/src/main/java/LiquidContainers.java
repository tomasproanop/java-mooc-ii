import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {  // Validate input length
                System.out.println("Invalid command");
                continue;
            }

            String command = parts[0];
            int amount;

            // Validate amount as an integer
            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount");
                continue;
            }

            if (amount <= 0) {
                // Ignore non-positive amounts
                continue;
            }

            switch (command) {
                case "add":
                    // Add to the first container
                    first = Math.min(first + amount, 100);
                    break;

                case "move":
                    // Move from first to second
                    if (first > 0) {
                        int moveAmount = Math.min(amount, first);
                        first -= moveAmount;
                        second = Math.min(second + moveAmount, 100);
                    }
                    break;

                case "remove":
                    // Remove from the second container
                    if (second > 0) {
                        second -= Math.min(amount, second);
                    }
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}

// alternative
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         int first = 0;
//         int second = 0;

//         while (true) {
//             System.out.println("First: " + first + "/100");
//             System.out.println("Second: " + second + "/100");

//             String input = scan.nextLine();
            
//             if (input.equals("quit")) {
//                 break;
//             }

//             String[] parts = input.split(" ");
//             if (parts.length != 2) {  // Validate input length
//                 System.out.println("Invalid command");
//                 continue;
//             }

//             String command = parts[0];
//             int amount;

//             // Validate amount as an integer
//             try {
//                 amount = Integer.parseInt(parts[1]);
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid amount");
//                 continue;
//             }

//             if (amount <= 0) {
//                 // Ignore non-positive amounts
//                 continue;
//             }

//             switch (command) {
//                 case "add":
//                     // Add to the first container
//                     if (first + amount > 100) {
//                         first = 100; // Cap at 100
//                     } else {
//                         first += amount;
//                     }
//                     break;

//                 case "move":
//                     // Move from first to second
//                     if (first > 0) {
//                         int moveAmount = amount;
//                         if (moveAmount > first) {
//                             moveAmount = first; // Move only what's available in first
//                         }

//                         first -= moveAmount;

//                         if (second + moveAmount > 100) {
//                             second = 100; // Cap second at 100
//                         } else {
//                             second += moveAmount;
//                         }
//                     }
//                     break;

//                 case "remove":
//                     // Remove from the second container
//                     if (second > 0) {
//                         if (amount > second) {
//                             second = 0; // Remove all if amount exceeds second
//                         } else {
//                             second -= amount;
//                         }
//                     }
//                     break;

//                 default:
//                     System.out.println("Unknown command");
//                     break;
//             }
//         }
//     }
// }

