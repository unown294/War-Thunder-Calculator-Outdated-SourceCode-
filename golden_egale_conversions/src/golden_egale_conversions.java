/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author(s) Dalton Redman, Dylan
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
        System.out.printf("\nYou need %d golden eagles to research %s\n\n", ge, name);
    }
    
    public static void silver_lion(int lions_needed){
        int sl = 1000;        // Silver lions pack 1
        int sl2 = 11000;      // Silver lions pack 2
        int sl3 = 58000;      // Silver lions pack 3
        int sl4 = 120000;     // Silver lions pack 4
        int sl5 = 630000;     // Silver lions pack 5
        int sl6 = 1300000;    // Silver lions pack 6
        int i = lions_needed;
        if(i <= sl){
            System.out.printf("\nWe recommend buying the %d for a better deal\n\n", sl);
        }
        else if(i <= sl2 && i > sl){
            System.out.printf("\nWe recommend buying the %d for a better deal\n\n", sl2);
        }
        else if(i > sl2 && i <= sl3){
            System.out.printf("\nWe recommend buying the %d for a better deal\n\n", sl3);
        }
        else if(i > sl3 && i <= sl4){
            System.out.printf("\nWe recommend buying the %d for a better deal\n\n", sl4);
        }
        else if(i > sl4 && i <= sl5){
            System.out.printf("\nWe recommend buying the %d for a better deal\n\n", sl5);
        }
        else if(i > sl5 && i <= sl6){
            System.out.printf("\nWe recommend buying the %d for a better deal\n\n", sl6);
        }
        else{
            System.out.printf("\nWe recommend buying the %d for a better deal plus another of the listed packages\n\n", sl6);
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
            System.out.printf("You will have (%d lions) to spare with your budget of %d lions\n", result, budget);
        }
    }
    
    public static void aircraft_rp_c(ArrayList<Integer> aircraft_rp, int air, int average_rp){   // For Option 5, For X amount of aircraft research point
        int total_rp = 0;
        for(int i = 0; i < aircraft_rp.size(); i++){
           total_rp = total_rp + aircraft_rp.get(i);
        }
        int n_match = total_rp / average_rp;
        System.out.printf("The total Research Points needed are %d and with a rate of %d per match, we estimate that you'll get to the end after %d matches\n", total_rp, average_rp, n_match);
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
        System.out.printf("You need to buy the following packs to ensure that you will have the ammount desired in the lowest possible ammount\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n\n",ge_ammount[0],tally_ammount[0],ge_ammount[1],tally_ammount[1],ge_ammount[2],tally_ammount[2],ge_ammount[3],tally_ammount[3],ge_ammount[4],tally_ammount[4],ge_ammount[5],tally_ammount[5]);    
        System.out.printf("The total cost is %d golden Eagle, Please enter this number into the converter to find the cheapest option\n\n", total_cost);
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
        System.out.printf("You need to buy the following packs to ensure that you will have the ammount desired in the lowest possible ammount\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n%d pack : %d\n\n",ge_ammount[0],tally_ammount[0],ge_ammount[1],tally_ammount[1],ge_ammount[2],tally_ammount[2],ge_ammount[3],tally_ammount[3],ge_ammount[4],tally_ammount[4],ge_ammount[5],tally_ammount[5],ge_ammount[6],tally_ammount[6],ge_ammount[7],tally_ammount[7],ge_ammount[8],tally_ammount[8]);    
        System.out.printf("The total cost is %d Dollars, Please enter this number into the converter to find the cheapest option\n\n", total_cost);
}
    
    public static void Membership(int days){
        Scanner in = new Scanner(System.in);
        int ge = 190;    // 1 day pass
        int ge_o = 1;
        int ge2 = 690;   // 7 day pass
        int ge_o2 = 7;
        int ge3 = 1190;  // 15 day pass
        int ge_o3 = 15;
        int ge4 = 1900;  // 30 day pass
        int ge_o4 = 30;
        int ge5 = 4900;  // 90 day pass
        int ge_o5 = 90;
        int ge6 = 14900; // 365 day pass
        int ge_o6 = 365;
        //Below are the lines that have included logic to solve various methods of attaining said GE ammount.
        System.out.printf("What option do you intend to pay for the membership?(1-6): ");
        int ge_payment_option = in.nextInt();
        int grand_total = 0;
        if(ge_payment_option == 1){
            grand_total = days * ge;
        }
        else if(ge_payment_option == 2){
            int multiplyer = (int)Math.round(days / ge_o2);
            grand_total = multiplyer * ge2;
        }
        else if(ge_payment_option == 3){
            int multiplyer = (int)Math.round(days / ge_o3);
            grand_total = multiplyer * ge3;
        }
        else if(ge_payment_option == 4){
            int multiplyer = (int)Math.round(days / ge_o4);
            grand_total = multiplyer * ge4;
        }
        else if(ge_payment_option == 5){
            int multiplyer = (int)Math.round(days / ge_o5);
            grand_total = multiplyer * ge5;
        }
        else if(ge_payment_option == 6){
            int multiplyer = (int)Math.round(days / ge_o6);
            grand_total = multiplyer * ge6;
        }
        
        System.out.printf("\nIt will cost you %d eagles\n\n", grand_total);
}
    
    public static void ge_cost(int ge){
        Scanner in = new Scanner(System.in);
        int ge_o1 = 150;        //Package 1
        int ge_c1 = 1;          
        int ge_o2 = 500;        //Package 2
        int ge_c2 = 3;
        int ge_o3 = 1000;       //Package 3
        int ge_c3 = 6;
        int ge_o4 = 2500;       //Package 4
        int ge_c4 = 14;
        int ge_o5 = 5000;       //Package 5
        int ge_c5 = 25;
        int ge_o6 = 10000;      //Package 6
        int ge_c6 = 49;
        int ge_o7 = 15000;      //Package 7
        int ge_c7 = 72;
        int ge_o8 = 20000;      //Package 8
        int ge_c8 = 95;
        int ge_o9 = 25000;      //Package 9
        int ge_c9 = 115;
    
        System.out.printf("What option do you intend to pay for the Golden Eagles?: ");
        int ge_payment_option = in.nextInt();
        int grand_total = 0;
        if(ge_payment_option == 1){
            grand_total = ge * ge_c1;
        }
        else if(ge_payment_option == 2){
            int multiplyer = (int)Math.round(ge / ge_o2);
            grand_total = multiplyer * ge_c2;
        }
        else if(ge_payment_option == 3){
            int multiplyer = (int)Math.round(ge / ge_o3);
            grand_total = multiplyer * ge_c3;
        }
        else if(ge_payment_option == 4){
            int multiplyer = (int)Math.round(ge / ge_o4);
            grand_total = multiplyer * ge_c4;
        }
        else if(ge_payment_option == 5){
            int multiplyer = (int)Math.round(ge / ge_o5);
            grand_total = multiplyer * ge_c5;
        }
        else if(ge_payment_option == 6){
            int multiplyer = (int)Math.round(ge / ge_o6);
            grand_total = multiplyer * ge_c6;
        }
        else if(ge_payment_option == 7){
            int multiplyer = (int)Math.round(ge / ge_o7);
            grand_total = multiplyer * ge_c7;
        }
        else if(ge_payment_option == 8){
            int multiplyer = (int)Math.round(ge / ge_o8);
            grand_total = multiplyer * ge_c8;
        }
        else if(ge_payment_option == 9){
            int multiplyer = (int)Math.round(ge / ge_o9);
            grand_total = multiplyer * ge_c9;
        }
        System.out.printf("Your grand total is $%d", grand_total, "/n/n");
}
    
    public static void main(String[] args) {
        boolean stop = true;
        while(stop == true){
            Scanner in = new Scanner(System.in);
            System.out.printf("Please select the option you want to be using:\n[1].Experience conversions\n[2].Silver Lions\n[3].Premium Membership Pass\n[4].Convert Golden Eagle to Real Money\n[5].Research Point battle average calculator\n[6].Purchase Cost Calulator\n[7].Lowest possible ammount you need to pay for lions\n[8].Golden Eagle lowest calculator into dollars\n[Q].Quit \nPlease Enter response here: ");
            String response = in.next();
            response = response.toLowerCase();
            if(response.equals("q") || response.equals("Q")){
                System.out.printf("Exiting...\n");
                stop = false;
            }
            else if(response.equals("1")){          //Please note that the program can not do equations as a response, tested it and it crashed.
                System.out.printf("Please enter the ammount of aircraft you need researched: ");
                int air = in.nextInt();
                if(air != 1){
                    air--;
                }
                ArrayList<Integer> exp = new ArrayList<Integer>();
                for(int i = 0; i < air; i++){                                            // Building the array
                    if(i == 0){
                        System.out.printf("What is the first cost value in lions?: ");
                        exp.add(in.nextInt());
                    }
                    System.out.printf("What's the next cost value in lions?: ");
                    exp.add(in.nextInt());
                }
                Experience(exp);
            }
            else if(response.equals("2")){
                System.out.printf("Please enter a desired ammount of Lions you want: ");
                int lions_needed = in.nextInt();
                silver_lion(lions_needed);
            }
            else if(response.equals("3")){
                System.out.printf("Please enter the ammount days you want premium: ");
                int days = in.nextInt();
                Membership(days);
            }
            else if(response.equals("4")){
                double single_eagle_cost = 1/150;
                System.out.printf("How many golden eagles do you need?: ");
                int ge = in.nextInt();
                ge_cost(ge);
            }
            else if(response.equals("5")){                                      //For option 5 of seeing how much reasearch and time will need to be aloted for the designated aircraft
                System.out.printf("\nHow many aircraft do you need to research before purchasing said aircraft?: ");
                int air = (int)in.nextInt();
                int test = 0;
                System.out.printf("What is your average Research Point gain per match?: ");
                int average_rp = in.nextInt();
                if(air != 1){
                    air--;
                }
                ArrayList<Integer> aircraft_rp = new ArrayList<Integer>();
                for(int i = 0; i < air; i++){
                    if(i == 0){
                        System.out.printf("What is the first amount of research you need to cover ?: ");
                        aircraft_rp.add(in.nextInt());
                    }
                    System.out.printf("What's the next value of research points?: ");
                    aircraft_rp.add(in.nextInt());
                }
                if(test == 1){
                    air++;
                }
                aircraft_rp_c(aircraft_rp, air, average_rp);
            }
            else if(response.equals("6")){                                               // For option six in calculating if you have the right ammount of silver lions for purchasing the aircraft
                System.out.printf("\nHow many aircraft do you need to purchase before purchasing said aircraft?: ");
                int air = (int)in.nextInt();                                             // "air" is the # of aircraft being research - 1 for compatibility of the arraylist
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
                    System.out.printf("What's the next cost value in lions?: ");
                    aircraft_cost.add(in.nextInt());
                }
                lion_cost(aircraft_cost, budget, air);                                        // For requesting the function of calculating if there is enough lions present
            }
            else if(response.equals("7")){                                      // for the lowest possible ammount of lions you want
                System.out.printf("Please enter a desired ammount of Lions you want: ");
                int lions_needed = in.nextInt();
                Lowest_Possible(lions_needed);
            }
            else if(response.equals("8")){                                      // for the lowest possible ammount of lions you want
                System.out.printf("Please enter a desired ammount of Lions you want: ");
                int Ge_needed = in.nextInt();
                Lowest_Possible_ge(Ge_needed);
            }
            else{
                System.out.printf("\nPlease select a valid option\n\n");
            }
        }
    
    }
}
