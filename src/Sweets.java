import java.util.ArrayList;
import java.util.Scanner;

public class Sweets {
    private String title;
    private boolean hasChocolate;
    private int units;

    public Sweets(String title, boolean hasChocolate, int units) {
        this.title = title;
        this.hasChocolate = hasChocolate;
        this.units = units;
    }

    public Sweets() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasChocolate() {
        return hasChocolate;
    }

    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public static void printSweets(ArrayList<Sweets> candies){
        for (Sweets candie:candies) {
            System.out.println(candie);
        }
    }
    public static Sweets createSweets(Scanner sc){
        Sweets candie = new Sweets();
        System.out.println("Iveskite saldainiu pavadinima");
        String title = sc.nextLine().trim().replaceAll(" +", " ");//trim pasalina tarpus pradzioje ir pabaigoje teksto, replaceAll panaikina dublikuotus tarpus tekste.
        title = title.substring(0,1).toUpperCase() + title.substring(1, title.length());//pirma raide didzioji, likusios kaip buvo
        candie.setTitle(title);
        System.out.println("Iveskite saldainiu kieki pakuoteje");
        candie.setUnits( Main.scannerValidatedInt(sc) );
        System.out.println("Iveskite ar saldainiai turi sokolado");
        candie.setHasChocolate( sc.nextBoolean() );
        sc.nextLine();
        return candie;
    }

    public static void removeSweets(Scanner sc, ArrayList<Sweets> candies){
        System.out.println("iveskite pavadinima prekes kuria norite trinti");
        String item = sc.nextLine().trim();
        boolean isCandy = false;
        for (Sweets sw : candies) {
            if(sw.getTitle().equalsIgnoreCase(item)){// palyginam pavadinima su ieskomu zodziu ignoruodami didziasas mazasas raides
                candies.remove(sw);
                System.out.println("saldainis sekmingai istrintas");
                isCandy = true;
                break;
            }
        }
        if(!isCandy){
            System.out.println("tokio saldainio nera");
        }
    }

    @Override
    public String toString() {
        return "Saldainiu pavadinimas: '" +
                title +
                "', saldainiai yra " +
                ((hasChocolate) ? "sokoladiniai" : "be sokolado")+
                ", pakuoteje yra " +
                units +
                " saldainiu.";
    }
}
