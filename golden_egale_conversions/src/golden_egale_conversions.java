import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dalton, Dylan
 * AKA: Unown294, jeff_fan
 */
public class golden_egale_conversions {

    public static void Experience(ArrayList<Integer> exp2){
        Scanner in = new Scanner(System.in);
        int ge = 0;
        int exp = 0;
        for(int i = 0; i < exp2.size();i++){
            exp = exp + exp2.get(i);
        }
        System.out.printf("What is it that your reasearching?: ");
        String name = in.nextLine();
        if(exp > 45){
            int base_exp = 45;
            double math = exp / base_exp;
            ge = (int)Math.round(math);
            if((ge * 45) < exp){
                ge++;
            }
        }
        else if(exp < 45 && exp > 0){
            ge = 1;
        }
        else{
            ge = 0;
        }
        System.out.printf("\nYou need %d golden eagles to research %s\n", ge, name);
        // Option to convert the Golden Eagles to Dollars
        
        if(ge == 0){
            //Nothing cause this negates the use of the following function so its ignored for simplification 
        }
        else{
            while(true){
                System.out.printf("Would you like to convert this to dollars?([1] yes, [2] No): ");
                int decision = in.nextInt();
                if(decision == 1){
                    System.out.printf("\n");
                    Lowest_Possible_ge(ge);
                    break;
                }
                else if(decision == 2){
                    break;  
                }
                else{
                    System.out.printf("\nPlease enter a valid option\n ");
                }
            }
        }
    }
    
    public static void lion_cost(ArrayList<Integer> aircraft_cost,int budget, int air){  // For Option 6, or cost of X ammount of aircraft
        int total_cost = 0;
        for(int i = 0; i < aircraft_cost.size(); i++){
           total_cost = total_cost + aircraft_cost.get(i);
        }
        System.out.printf("\nThe total cost is %d\n",total_cost);
        if(total_cost > budget){
            int result = total_cost - budget;
            System.out.printf("Your budget (%d lions) is not enough to cover the total cost (%d lions) by %d lions\n\n", budget, total_cost, result);
        }
        else if( total_cost <= budget){
            int result = budget - total_cost;
            System.out.printf("You will have (%d lions) to spare with your budget of %d lions\n\n", result, budget);
        }
    }
    
    public static void aircraft_rp_c(ArrayList<Integer> aircraft_rp, int air, int average_rp){   // For Option 4, For X amount of aircraft research point
        int total_rp = 0;
        for(int i = 0; i < aircraft_rp.size(); i++){
           total_rp = total_rp + aircraft_rp.get(i);
        }
        double n_match = Math.ceil(total_rp / average_rp);
        if(n_match == 0){
            n_match++;
        }
        System.out.printf("\nThe total Research Points needed are %d and with a rate of %d per match,\nwe estimate that you'll get to the end after %.0f matches\n\n", total_rp, average_rp, n_match);
    }
    
    public static void Lowest_Possible(int Lions){
        int[] ge_ammount = {1300000, 630000, 120000, 58000, 11000, 1000};
        int[] ge_price = {3000, 1500, 300, 150, 30, 3};
        int[] tally_ammount = {0,0,0,0,0,0};
        int total_cost = 0;
        for(int i = 0; i < ge_ammount.length; i++){
            if(Lions >= ge_ammount[i]){
                boolean test = true;
                while(test){
                    if(Lions >= ge_ammount[i]){
                        tally_ammount[i]++;
                        Lions = Lions - ge_ammount[i];
                    }
                    else{
                        test = false;
                    }
                }
                    
            }
            else if(Lions==0){
                
            }
            else if(Lions <= 999 && Lions >= 1){
                tally_ammount[5]++;
            }
            else{
                
            }
        }
        for(int i = 0; i < ge_ammount.length;i++){
            total_cost = total_cost + (ge_price[i] * tally_ammount[i]);
        }
        System.out.printf("You need to buy the following packs to ensure that you will have the ammount\nDesired in the lowest possible ammount:\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n\n",ge_ammount[0],tally_ammount[0],ge_ammount[1],tally_ammount[1],ge_ammount[2],tally_ammount[2],ge_ammount[3],tally_ammount[3],ge_ammount[4],tally_ammount[4],ge_ammount[5],tally_ammount[5]);    
        System.out.printf("The total cost is %d golden Eagle\n", total_cost);
        
        //Converts into dollars at this point
        if(total_cost == 0){
            //nothing to do since its zero
        }
        else{
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.printf("Would you like to convert this to dollars?([1] yes, [2] No): ");
                int decision = in.nextInt();
                if(decision == 1){
                    System.out.printf("\n");
                    Lowest_Possible_ge(total_cost);
                    break;
                }
                else if(decision == 2){
                    break;
                }
                else{
                    System.out.printf("\nPlease enter a valid option\n ");
                }
            }
        }
}
    
    public static void Lowest_Possible_ge(int Ge){
    int[] ge_ammount = {25000, 20000, 15000, 10000, 5000, 2500, 1000, 500, 150};
        int[] ge_price = {115, 95, 72, 49, 25, 15, 6, 3, 1};
        int[] tally_ammount = {0,0,0,0,0,0,0,0,0};
        int total_cost = 0;
        for(int i = 0; i < ge_ammount.length; i++){
            if(Ge >= ge_ammount[i]){
                boolean test = true;
                while(test){
                    if(Ge >= ge_ammount[i]){
                        tally_ammount[i]++;
                        Ge = Ge - ge_ammount[i];
                    }
                    else{
                        test = false;
                    }
                }
                    
            }
            else if(Ge==0){
                
            }
            else if(Ge <= 149 && Ge >= 1 && i == 8){
                tally_ammount[8]++;
            }
            else{
                
            }
        }
        for(int i = 0; i < ge_ammount.length;i++){
            total_cost = total_cost + (ge_price[i] * tally_ammount[i]);
        }
        System.out.printf("You need to buy the following packs to ensure that you will have the ammount\nDesired in the lowest possible ammount:\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n\n",ge_ammount[0],tally_ammount[0],ge_ammount[1],tally_ammount[1],ge_ammount[2],tally_ammount[2],ge_ammount[3],tally_ammount[3],ge_ammount[4],tally_ammount[4],ge_ammount[5],tally_ammount[5],ge_ammount[6],tally_ammount[6],ge_ammount[7],tally_ammount[7],ge_ammount[8],tally_ammount[8]);    
        System.out.printf("The total cost is %d Dollars\n\n", total_cost);
}
    
    public static void Membership(int days){
        int[] Membership_ammount = {365, 90, 30, 15, 7, 1};
        int[] Membership_price = {14900, 4900, 1900, 1190, 690, 190};
        int[] tally_ammount = {0,0,0,0,0,0};
        int total_cost = 0;
        for(int i = 0; i < Membership_ammount.length; i++){
            if(days >= Membership_ammount[i]){
                boolean test = true;
                while(test){
                    if(days >= Membership_ammount[i]){
                        tally_ammount[i]++;
                        days = days - Membership_ammount[i];
                    }
                    else{
                        test = false;
                    }
                }
                    
            }
            else{
                
            }
        }
        for(int i = 0; i < Membership_ammount.length;i++){
            total_cost = total_cost + (Membership_price[i] * tally_ammount[i]);
        }
        System.out.printf("You need to buy the following packs to ensure that you will have the ammount\nDesired in the lowest possible ammount:\n%d day pack : %d\n%d day pack : %d\n%d day pack : %d\n%d day pack : %d\n%d day pack : %d\n%d day pack : %d\n\n",Membership_ammount[0],tally_ammount[0],Membership_ammount[1],tally_ammount[1],Membership_ammount[2],tally_ammount[2],Membership_ammount[3],tally_ammount[3],Membership_ammount[4],tally_ammount[4],Membership_ammount[5],tally_ammount[5]);    
        System.out.printf("The total cost is %d Golden Eagles\n", total_cost);
        
        Scanner test = new Scanner(System.in);
        while(true){
            System.out.printf("Would you like to convert this to dollars?([1] yes, [2] No): ");
            int decision = test.nextInt();
            if(decision == 1){
                System.out.printf("\n");
                Lowest_Possible_ge(total_cost);
                break;
            }
            else if(decision == 2){
                break;
            }
            else{
                System.out.printf("\nPlease enter a valid option\n ");
            }
        }
}
    
    public static void main(String[] args) {
        //This is the area that will be updated every patch to keep up with the number of vehicles in the game. This is soly for making sure the vehicle selection is not exceeded in the program
        int German_aircraft = 92;   // Number of German Aircraft
        int German_tank = 60;       // Number of German Tanks
        int US_tank = 45;           // Number of American tanks
        int US_aircraft = 73;       // Number of American Aircraft
        int USSR_tank = 58;         // Number of USSR Tanks
        int USSR_aircraft = 84;     // Number of USSR Aircraft
        int GB_aircraft = 67;       // Number of Great Britain Aircraft
        int GB_tank = 36;           // Number of Great Britain Tanks
        int Japan_tank = 27;        // Number of Japanese Tanks
        int Japan_aircraft = 65;    // Number of Japanese Aircraft
        int total_number_vehicles = (German_aircraft + German_tank + US_tank + US_aircraft + USSR_tank + USSR_aircraft + GB_aircraft + GB_tank + Japan_tank + Japan_aircraft);
        // End of the vehicle number variables beginning of sequence code
        boolean stop = true;
        while(stop == true){
            Scanner in = new Scanner(System.in);
            System.out.printf("Please select the option you want to be using:\n[1].Experience conversions\n[2].Premium Membership Pass\n[3].Research Point battle average calculator\n[4].Budget Cost Calulator\n[5].Cheapest ammount you need to pay for lions\n[6].Golden Eagle lowest calculator into dollars\n[q].Quit (Is case sensitive)\nPlease Enter response here: ");
            String response = in.next();
            response = response.toLowerCase();
            if(response.equals("q")){
                System.out.printf("Exiting...\n");
                stop = false;
            }
            else if(response.equals("1")){          //Please note that the program can not do equations as a response, tested it and it crashed.
                System.out.printf("\nPlease enter the ammount of aircraft you need researched: ");
                int air = in.nextInt();
                int number = 1;
                if(air > total_number_vehicles){
                    while(true){
                        Scanner new_air = new Scanner(System.in);
                        System.out.printf("Im sorry but that is greater than the number of aircraft/tanks in the game\nPlease use a number less than or equal to %d: ",total_number_vehicles);
                        air = new_air.nextInt();
                        if(air <= total_number_vehicles){
                            break;
                        }
                    }
                }
                int check = 0;
                if(air != 1){
                    air--;
                    check = 1;
                }
                ArrayList<Integer> exp = new ArrayList<Integer>();
                for(int i = 0; i < air; i++){                                            // Building the array
                    if(i == 0){
                        System.out.printf("[%d]What is the first ammount of EXP need for the first aircraft?: ", number);
                        exp.add(in.nextInt());
                        number++;
                    }
                    if(check != 0){
                    System.out.printf("[%d]What's the next ammount of EXP need for the next aircraft?: ", number);
                    exp.add(in.nextInt());
                    number++;
                    }
                }
                Experience(exp);
            }
            else if(response.equals("2")){
                System.out.printf("\nPlease enter the ammount days you want premium: ");
                int days = in.nextInt();
                Membership(days);
            }
            else if(response.equals("3")){                                      //For option 5 of seeing how much reasearch and time will need to be aloted for the designated aircraft
                System.out.printf("\nHow many aircraft do you need to research before purchasing said aircraft?: ");
                int air = (int)in.nextInt();
                if(air > total_number_vehicles){
                    while(true){
                        Scanner new_air = new Scanner(System.in);
                        System.out.printf("Im sorry but that is greater than the number of aircraft/tanks in the game\nPlease use a number less than or equal to %d: ",total_number_vehicles);
                        air = new_air.nextInt();
                        if(air <= total_number_vehicles){
                            break;
                        }
                    }
                }
                int check = 0;
                if(air == 1){
                    check = 1;
                }
                int test = 0;
                System.out.printf("What is your average Research Point gain per match?: ");
                int average_rp = in.nextInt();
                if(air != 1){
                    air--;
                }
                int number = 1;
                ArrayList<Integer> aircraft_rp = new ArrayList<Integer>();
                for(int i = 0; i < air; i++){
                    if(i == 0){
                        System.out.printf("[%d]What is the first amount of research you need to cover ?: ",number);
                        aircraft_rp.add(in.nextInt());
                        number++;
                    }
                    if(check != 1){
                    System.out.printf("[%d]What's the next value of research points?: ",number);
                    aircraft_rp.add(in.nextInt());
                    number++;
                    }
                }
                if(test == 1){
                    air++;
                }
                aircraft_rp_c(aircraft_rp, air, average_rp);
            }
            else if(response.equals("4")){                                               // For option six in calculating if you have the right ammount of silver lions for purchasing the aircraft
                System.out.printf("\nHow many aircraft do you need to purchase before purchasing said aircraft?: ");
                int air = (int)in.nextInt();                                             // "air" is the # of aircraft being research - 1 for compatibility of the arraylist
                int check = 0;
                if(air == 1){
                    check = 1;
                }
                if(air != 1){
                    air--;
                }
                System.out.printf("\nWhat is your current Silver lion balance?: ");
                int budget = in.nextInt();                                               // For the budget of the users account
                ArrayList<Integer> aircraft_cost = new ArrayList<Integer>();
                for(int i = 0; i < air; i++){                                            // Building the array
                    if(i == 0){
                        System.out.printf("What is the first cost value in lions?: ");
                        aircraft_cost.add(in.nextInt());
                    }
                    if(check != 1){
                    System.out.printf("What's the next cost value in lions?: ");
                    aircraft_cost.add(in.nextInt());
                    }
                }
                lion_cost(aircraft_cost, budget, air);                                        // For requesting the function of calculating if there is enough lions present
            }
            else if(response.equals("5")){                                      // for the lowest possible ammount of lions you want
                System.out.printf("\nPlease enter a desired ammount of Lions you want: ");
                int lions_needed = in.nextInt();
                Lowest_Possible(lions_needed);
            }
            else if(response.equals("6")){                                      // for the lowest possible ammount of lions you want
                System.out.printf("\nPlease enter a desired ammount of Golden Eagles you want: ");
                int Ge_needed = in.nextInt();
                Lowest_Possible_ge(Ge_needed);
            }
            else{
                System.out.printf("\nPlease select a valid option\n\n");
            }
    }
    
}
}
