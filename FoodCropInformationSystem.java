import java.util.Scanner;
class FoodCropInformationSystem
 {
    public static void food()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Food Crop Information System!");
        while (true) 
        {
            System.out.println("\nChoose a food crop to learn more:");
            System.out.println("1. Rice");
            System.out.println("2. Wheat");
            System.out.println("3. Corn");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    displayRiceInformation();
                    break;
                case 2:
                    displayWheatInformation();
                    break;
                case 3:
                    displayCornInformation();
                    break;
                case 4:
                    System.out.println("Thank you for using the Food Crop Information System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void displayRiceInformation() 
    {
        System.out.println("\nRice Growing Conditions:");
        System.out.println("1. Temperature: Rice grows well in warm and tropical climates.");
        System.out.println("2. Water: It requires a lot of water, often grown in flooded fields (paddy fields).");
        System.out.println("3. Soil: Rice prefers well-drained, clayey or loamy soils.");
    }

    private static void displayWheatInformation() 
    {
        System.out.println("\nWheat Growing Conditions:");
        System.out.println("1. Temperature: Wheat grows best in cool to temperate climates.");
        System.out.println("2. Water: It needs moderate water, especially during the grain-filling stage.");
        System.out.println("3. Soil: Wheat prefers well-drained loamy soils.");
    }

    private static void displayCornInformation() 
    {
        System.out.println("\nCorn Growing Conditions:");
        System.out.println("1. Temperature: Corn grows in warm climates, and it's sensitive to frost.");
        System.out.println("2. Water: It requires regular water during the growing season.");
        System.out.println("3. Soil: Corn thrives in well-drained, fertile soils.");
    }
}
