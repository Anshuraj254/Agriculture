import java.util.Calendar;
import java.util.Scanner;
class CropSuggestionSystem 
{
    public static void crop() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Crop Suggestion System!");

        // Get the current month (0 to 11, where 0 is January and 11 is December)
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);

        String suggestedCrop = suggestCrop(currentMonth);
        System.out.println("Based on the current month, we suggest growing: " + suggestedCrop);

        System.out.print("What type of crop would you like to grow (cash or food)? ");
        String cropType = scanner.nextLine().toLowerCase();

        if ("cash".equals(cropType)) 
        {
            displayCashCropRequirements(suggestedCrop);
        } else if ("food".equals(cropType))
        {
            displayFoodCropRequirements(suggestedCrop);
        } else {
            System.out.println("Invalid choice. Please choose 'cash' or 'food'.");
        }

        scanner.close();
    }

    private static String suggestCrop(int currentMonth) 
    {
        switch (currentMonth)
        {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                return "Wheat";
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                return "Rice";
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                return "Corn";
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                return "Sugarcane";
            default:
                return "Unknown";
        }
    }

    private static void displayCashCropRequirements(String crop)
    {
        System.out.println("\nCash Crop: " + crop);
        System.out.println("Minimum Requirements:");
        if ("Wheat".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Cool to temperate");
            System.out.println(" - Water: Moderate");
            System.out.println(" - Soil: Well-drained loamy soil");
        } else if ("Rice".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Warm and tropical");
            System.out.println(" - Water: Abundant");
            System.out.println(" - Soil: Clayey or loamy soil");
        } else if ("Corn".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Warm and temperate");
            System.out.println(" - Water: Regular");
            System.out.println(" - Soil: Well-drained fertile soil");
        } else if ("Sugarcane".equalsIgnoreCase(crop))
        {
            System.out.println(" - Suitable climate: Tropical and subtropical");
            System.out.println(" - Water: Ample");
            System.out.println(" - Soil: Fertile loamy soil");
        } else 
        {
            System.out.println(" - Unknown crop");
        }
    }

    private static void displayFoodCropRequirements(String crop) 
    {
        System.out.println("\nFood Crop: " + crop);
        System.out.println("Minimum Requirements:");
        if ("Wheat".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Cool to temperate");
            System.out.println(" - Water: Moderate");
            System.out.println(" - Soil: Well-drained loamy soil");
        } else if ("Rice".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Warm and tropical");
            System.out.println(" - Water: Abundant");
            System.out.println(" - Soil: Clayey or loamy soil");
        } else if ("Corn".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Warm and temperate");
            System.out.println(" - Water: Regular");
            System.out.println(" - Soil: Well-drained fertile soil");
        } else if ("Sugarcane".equalsIgnoreCase(crop)) 
        {
            System.out.println(" - Suitable climate: Tropical and subtropical");
            System.out.println(" - Water: Ample");
            System.out.println(" - Soil: Fertile loamy soil");
        } else 
        {
            System.out.println(" - Unknown crop");
        }
    }
}
