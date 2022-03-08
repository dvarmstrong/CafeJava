public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready  ";
        String  displayTotalMessage = " Your total is $ ";

        //  Menu variables 
        double mochaPrice = 3.5;
        double oatMealLatte = 4.5;
        double whiteChoclateCappucino = 5.95;
        double ameicanoEspresso = 5.25;
        double ExpressoDouble = 10.25;
        double PumpkinLatte = 4.25;
        double MochaCappuccino = 7.25;

        // Customer name variables 

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order Completions 

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        

        System.out.println(customer1 + pendingMessage  +  mochaPrice);

        if(isReadyOrder1) {
            System.out.println(customer4 +  pendingMessage);
        }
        else if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage + whiteChoclateCappucino );
        }
        

        System.out.println(customer2 + displayTotalMessage + PumpkinLatte * 2  );

        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println( customer3 + displayTotalMessage + (mochaPrice - PumpkinLatte));

        oatMealLatte = 12.00;

        System.out.println(oatMealLatte);

        isReadyOrder2 = false;
        isReadyOrder2 = true;

        System.out.println(customer1 + pendingMessage +   isReadyOrder2  +  oatMealLatte);








    }
}
