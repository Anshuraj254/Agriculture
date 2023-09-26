import java.util.Scanner;
class CashCropInformationSystem
 {
    public static void cash()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cash Crop Information System!");
        while (true)
        {
            System.out.println("\nChoose a cash crop to learn more:");
            System.out.println("1. Cotton");
            System.out.println("2. Sugarcane");
            System.out.println("3. Tea");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    displayCottonInformation();
                    break;
                case 2:
                    displaySugarcaneInformation();
                    break;
                case 3:
                    displayTeaInformation();
                    break;
                case 4:
                    System.out.println("Thank you for using the Cash Crop Information System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void displayCottonInformation() 
    {
        System.out.println("\nCotton Growing Conditions in India:");
        System.out.println("1. Climate: Cotton grows well in tropical and subtropical climates.");
        System.out.println("2. Water: It needs adequate but well-distributed rainfall.");
        System.out.println("3. Soil: Cotton prefers well-drained, sandy loam soil.");
        System.out.println("Average Rate in India: Rs. 5,000 per quintal (as of 2023).");
    }

    private static void displaySugarcaneInformation() 
    {
        System.out.println("\nSugarcane Growing Conditions in India:");
        System.out.println("1. Climate: Sugarcane thrives in tropical and subtropical regions.");
        System.out.println("2. Water: It requires ample water, especially during the initial growth stages.");
        System.out.println("3. Soil: Sugarcane prefers well-drained, fertile loamy soil.");
        System.out.println("Average Rate in India: Rs. 3,000 per ton (as of 2023).");
    }

    private static void displayTeaInformation() 
    {
        System.out.println("\nTea Plantation Conditions in India:");
        System.out.println("1. Climate: Tea grows well in regions with high rainfall and cool temperatures.");
        System.out.println("2. Water: It requires consistent rainfall throughout the year.");
        System.out.println("3. Soil: Tea thrives in acidic, well-drained soils.");
        System.out.println("Average Rate in India: Rs. 150 per kg (as of 2023).");
    }
}
