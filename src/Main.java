import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Sweets> candies = new ArrayList<>();
//
//        candies.add(new Sweets("Karūna",true,1));
//        candies.add(new Sweets("fortūna",true,1));
//        candies.add(new Sweets("raffaello",false,23));
//
//        while (true){
//            printInfo();
//            int result = scannerValidatedInt(sc);
//            switch (result){
//                case 1:
//                    Sweets.printSweets(candies);
//                    break;
//                case 2:
//                   candies.add(Sweets.createSweets(sc));
//                    break;
//                case 3:
//                    System.out.println("redagavimo funkionalumas dar kuriamas");
//                    break;
//                case 4:
//                   Sweets.removeSweets(sc,candies);
//                    break;
//                case 5:
//                    System.exit(1);
//                    break;
//                default:
//                    System.out.println("nesupratau komandos, bandykite dar karta");
//            }
//        }


        String[] numbers = {" +37063500697" ,
                "863500697",
                "37063500697" ,
                "0037063500697" ,
                "63500697"};
        for (int i = 0; i <numbers.length ; i++) {
            validatePhoNo(numbers[i]);
        }
    }

    public static int scannerValidatedInt(Scanner sc){
        int result = 0;
        while (true) {
            try {
                result = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("iveskite skaiciu");
            }
        }
        sc.nextLine();
        return result;
    }

    public static void validatePhoNo(String phoNo){
        System.out.println(phoNo.substring(5,phoNo.length()));
        /*
        +37063500697
        863500697
        37063500697
        0037063500697
        63500697


        863500697
        8 63500697
        8635 00697
        8-63500697
        8635-00697
        8(635)00697
        8(635) 00697
        8 (635) 00697


        63500697
        63500697
        635 00697
        63500697
        635-00697
        (635)00697
        (635) 00697
        (635) 00697

        37063500697
        370 63500697
        370 635 00697
        370-63500697
        370-635-00697
        370(635)00697
        370 (635) 00697
        370 (635) 00697

        +37063500697
        +370 63500697
        +370 635 00697
        +370-63500697
        +370-635-00697
        +370(635)00697
        +370 (635) 00697
        +370 (635) 00697

        0037063500697
        00370 63500697
        00370 635 00697
        00370-63500697
        00370-635-00697
        00370(635)00697
        00370 (635) 00697
        00370 (635) 00697



         */
    }
    public static void printInfo(){
        System.out.println();
        System.out.println("------------------------");
        System.out.println("1. pamatyti saldainius");
        System.out.println("2. prideti saldaini");
        System.out.println("3. redaguoti saldaini");
        System.out.println("4. trinti saldaini");
        System.out.println("5. iseiti is programos");
    }
}