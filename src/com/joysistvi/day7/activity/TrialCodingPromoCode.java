package com.joysistvi.day7.activity;

import java.util.Scanner;

public class TrialCodingPromoCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Dial the USSD Code Requirement
        while (true) {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            String ussdInput = scanner.nextLine().trim();

            if (ussdInput.equals("*143#")) {
                System.out.println("\nAccess Granted!\n");
                showMainMenu(scanner);
                break;
            } else {
                System.out.println("Error: Invalid USSD code. Please try again.\n");
            }
        }

        scanner.close();
    }

    // 2. Main Menu: Load Registration
    public static void showMainMenu(Scanner scanner) {
        while (true) {
            System.out.println("*Load Registration *");
            System.out.println("[1] Go+");
            System.out.println("[2] GO");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] UNLI 5G");
            System.out.println("[5] ALLNET");
            System.out.print("Enter a choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showGoPlusMenu(scanner);
                    return;
                case "2":
                    showGoMenu(scanner);
                    return;
                case "3":
                    showGoExtraMenu(scanner);
                    return;
                case "4":
                    showUnli5GMenu(scanner);
                    return;
                case "5":
                    showAllNetMenu(scanner);
                    return;
                default:
                    System.out.println("\nError: Invalid main menu choice. Try again.\n");
            }
        }
    }

    // 3. Sub-Menu: Go+
    public static void showGoPlusMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n*** Go+ Promos ***");
            System.out.println("[1] Go+99");
            System.out.println("[2] Go+129");
            System.out.println("[3] Go+149");
            System.out.print("Enter a choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showPromoDetail(scanner, "Go+99", "Get 8GB for all sites + 8GB");
                    return;
                case "2":
                    showPromoDetail(scanner, "Go+129", "Get 10GB for all sites + 8GB");
                    return;
                case "3":
                    showPromoDetail(scanner, "Go+149", "Get 12GB for all sites + 8GB");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 3. Sub-Menu: GO
    public static void showGoMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n*** Go Promos ***");
            System.out.println("[1] Go50");
            System.out.println("[2] Go90");
            System.out.println("[3] Go120");
            System.out.print("Enter a choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showPromoDetail(scanner, "Go50", "Get 5GB for all sites + 3GB for apps");
                    return;
                case "2":
                    showPromoDetail(scanner, "Go90", "Get 8GB for all sites + 8GB for apps");
                    return;
                case "3":
                    showPromoDetail(scanner, "Go120", "Get 10GB for all sites + 10GB for apps");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 3. Sub-Menu: GoEXTRA
    public static void showGoExtraMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n*** GoEXTRA Promos ***");
            System.out.println("[1] GoEXTRA99");
            System.out.println("[2] GoEXTRA129");
            System.out.println("[3] GoEXTRA149");
            System.out.print("Enter a choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showPromoDetail(scanner, "GoEXTRA99", "Get 10GB data + Unli Allnet Texts");
                    return;
                case "2":
                    showPromoDetail(scanner, "GoEXTRA129", "Get 12GB data + Unli Allnet Texts & Calls");
                    return;
                case "3":
                    showPromoDetail(scanner, "GoEXTRA149", "Get 15GB data + Unli Allnet Texts & Calls");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 3. Sub-Menu: UNLI 5G
    public static void showUnli5GMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n*** UNLI 5G Promos ***");
            System.out.println("[1] UNLI 5G 99");
            System.out.println("[2] UNLI 5G 149");
            System.out.println("[3] UNLI 5G 199");
            System.out.print("Enter a choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showPromoDetail(scanner, "UNLI 5G 99", "Get Unli 5G data for 3 days");
                    return;
                case "2":
                    showPromoDetail(scanner, "UNLI 5G 149", "Get Unli 5G data for 7 days");
                    return;
                case "3":
                    showPromoDetail(scanner, "UNLI 5G 199", "Get Unli 5G data for 15 days");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 3. Sub-Menu: ALLNET
    public static void showAllNetMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n*** ALLNET Promos ***");
            System.out.println("[1] ALLNET99");
            System.out.println("[2] ALLNET149");
            System.out.println("[3] ALLNET199");
            System.out.print("Enter a choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showPromoDetail(scanner, "ALLNET99", "Get All-Network Calls & Texts for 3 days");
                    return;
                case "2":
                    showPromoDetail(scanner, "ALLNET149", "Get All-Network Calls & Texts for 7 days");
                    return;
                case "3":
                    showPromoDetail(scanner, "ALLNET199", "Get All-Network Calls & Texts for 15 days");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 4. Promo Detail Menu (Handles subscription confirmation or exit)
    public static void showPromoDetail(Scanner scanner, String promoName, String details) {
        while (true) {
            System.out.println("\n*** " + promoName + " Promos ***");
            System.out.println("-> " + details);
            System.out.println("[1] Subscribe");
            System.out.println("[2] Exit");
            System.out.print("Enter a choice\nChoice: ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                System.out.println("You are now subscribed to " + promoName);
                System.exit(0); // Ends the program successfully
            } else if (choice.equals("2")) {
                System.exit(0); // Ends the program immediately
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}