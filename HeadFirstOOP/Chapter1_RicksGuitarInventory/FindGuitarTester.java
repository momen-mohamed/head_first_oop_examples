package Chapter1_RicksGuitarInventory;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public void runTest() {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
        );

        List matchingGuitar = inventory.search(whatErinLikes);
        if (!matchingGuitar.isEmpty()) {
            for (Iterator i = matchingGuitar.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("Erin, you might like this " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n " +
                        spec.getBackWood() + " back and sides,\n " +
                        spec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!\n---------------------------");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar(
                "V98123",
                200,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER)
        );
        inventory.addGuitar(
                "V95693",
                1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
    }
}
