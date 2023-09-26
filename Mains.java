import java.util.*;
class Mains
{
    public static void main(String args[]) throws InterruptedException
    {
        Agriculture_Animation anim=new Agriculture_Animation();
        anim.Animation();
        Loading loads= new Loading();
        System.out.println("                             ");
        loads.loading();
        Scanner s=new Scanner(System.in);
        System.out.println("1.FoodCropInformation");
        System.out.println("2.CashCropInformation");
        System.out.println("3.CropSuggestion");
        System.out.println("4.Exit");
        int choice = s.nextInt();
        switch (choice) 
        {
            case 1:
                loads.loading();
                FoodCropInformationSystem disk=new FoodCropInformationSystem();
                disk.food();
                break;
                
            case 2:
                loads.loading();
                CashCropInformationSystem cal=new CashCropInformationSystem();
                cal.cash();
                break;
            case 3:
                loads.loading();
                CropSuggestionSystem noob=new CropSuggestionSystem();
                noob.crop();
                break;
                
            case 4:
                System.out .println("Exiting..........");
        }
    }
}