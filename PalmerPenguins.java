//PalmerPenguins.java
//Juwan Burden
//9/05/2026
//Introduce the Palmer Panguin Species

public class PalmerPenguins {

    //constants to represnt the species and count
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    
    static final int TOTAL_SPECIES = 3;
    
    public static void main(String[] args) {
    
        //output for introducing the palmer penguin species
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but no least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a  total of " + TOTAL_SPECIES + 
                            " penguin species in this dataset.");
    }
}

