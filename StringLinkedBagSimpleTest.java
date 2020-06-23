package lab04stringlinkedbagsum19;

/**
 *
 * unless you are commenting out a method call for testing, no need to change
 * this file
 *
 * Lab 4 StringLinkedBag/StringNode - tester for Lab 4 SEE SAMPLE OUTPUT AT
 * BOTTOM OF FILE Programmed by Stephen Brower Inspired by Michael Main
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 * updated by Linda Yang
 */
public class StringLinkedBagSimpleTest {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create bag - fruitBag
        StringLinkedBag fruitBag = new StringLinkedBag();

        // display empty fruitBag
        displayBagAndSize(fruitBag, "fruitBag upon startup");

        // add fruit to fruitBag
        fruitBag.add("Pear");
        displaySize(fruitBag, "\nadded Pear...");
        fruitBag.add("Plum");
        displaySize(fruitBag, "added Plum...");
        fruitBag.add("Watermellon");
        displaySize(fruitBag, "added Watermellon...");
        fruitBag.add("Mango");
        displaySize(fruitBag, "added Mango...");
        fruitBag.add("Apple");
        displaySize(fruitBag, "added Apple...");
        fruitBag.add("Nectarine");
        displaySize(fruitBag, "added Nectarine...");
        fruitBag.add("Cherry");
        displaySize(fruitBag, "added Cherry...");

        // display fruitBag after 7 adds
        displayBagAndSize(fruitBag, "fruitBag after 7 adds");

        // does banana exist in fruitBag?
        if (fruitBag.exists("banana")) {
            System.out.println("\nYes!  There is a banana in the fruitBag!");
        } else {
            System.out.println("\nNo!  No banana in the fruitBag");
        }

        // does nectarine exist in fruitBag?
        if (fruitBag.exists("nectarine")) {
            System.out.println("Yes!  There is a nectarine in the fruitBag!");
        } else {
            System.out.println("No!  No nectarine in the fruitBag");
        }

        // does watermellon exist in fruitBag?
        if (fruitBag.exists("watermellon")) {
            System.out.println("Yes!  There is a watermellon in the fruitBag!");
        } else {
            System.out.println("No!  No watermellon in the fruitBag");
        }

        // removes
        // show fruitBag before call to remove()
        displayBagAndSize(fruitBag, "\nfruitBag before removing banana");

        // attempt to remove banana from fruitBag
        if (fruitBag.remove("banana")) {
            System.out.println("Was able to remove banana from fruitBag.");
        } else {
            System.out.println("Sorry! unable to remove banana from fruitBag!");
        }

        // show fruitBag after call to remove()
        displayBagAndSize(fruitBag, "fruitBag after removing banana");

        // show fruitBag before call to remove()
        displayBagAndSize(fruitBag, "\nfruitBag before removing watermellon");

        // attempt to remove watermellon from fruitBag
        if (fruitBag.remove("watermellon")) {
            System.out.println("Was able to remove watermellon from fruitBag.");
        } else {
            System.out.println("Sorry! unable to remove watermellon from fruitBag!");
        }

        displayBagAndSize(fruitBag, "fruitBag after removing watermellon");

        // show fruitBag before call to remove()
        displayBagAndSize(fruitBag, "\nfruitBag before removing nectarine");

        // attempt to remove nectarine from fruitBag
        if (fruitBag.remove("nectarine")) {
            System.out.println("Was able to remove nectarine from fruitBag.");
        } else {
            System.out.println("Sorry! unable to remove nectarine from fruitBag!");
        }

        displayBagAndSize(fruitBag, "fruitBag after removing nectarine");
    }

    public static void displaySize(StringLinkedBag bagToDisplay, String label) {
        System.out.println(label + "\tSize: " + bagToDisplay.getSize());
    }

    public static void displayBagAndSize(StringLinkedBag bagToDisplay, String label) {

        System.out.println(label);
        System.out.print("n=" + bagToDisplay.getSize() + " Bag: ");

        if (bagToDisplay.getSize() == 0) {
            System.out.println("size is 0, therefore assumed Empty");
        } else {
            ListerPrototype2 stringLinkedLister = bagToDisplay.iteratorPrototype();
            while (stringLinkedLister.hasNext()) {
                String displayString = stringLinkedLister.next();
                System.out.print("{" + displayString + "}");
                if (stringLinkedLister.hasNext()) {
                    System.out.print(", ");
                }
            }
            System.out.println();

        }

    }

}
/*

**************************************************************************
****** WITH EXTRA CREDIT A..Z *********    Sample Run Should Be:
run:
fruitBag upon startup
n=0 Bag: size is 0, therefore assumed Empty

added Pear...	Size: 1
added Plum...	Size: 2
added Watermellon...	Size: 3
added Mango...	Size: 4
added Apple...	Size: 5
added Nectarine...	Size: 6
added Cherry...	Size: 7
fruitBag after 7 adds
n=7 Bag: {Apple}, {Cherry}, {Mango}, {Nectarine}, {Pear}, {Plum}, {Watermellon}

No!  No banana in the fruitBag
Yes!  There is a nectarine in the fruitBag!
Yes!  There is a watermellon in the fruitBag!

fruitBag before removing banana
n=7 Bag: {Apple}, {Cherry}, {Mango}, {Nectarine}, {Pear}, {Plum}, {Watermellon}
Sorry! unable to remove banana from fruitBag!
fruitBag after removing banana
n=7 Bag: {Apple}, {Cherry}, {Mango}, {Nectarine}, {Pear}, {Plum}, {Watermellon}

fruitBag before removing watermellon
n=7 Bag: {Apple}, {Cherry}, {Mango}, {Nectarine}, {Pear}, {Plum}, {Watermellon}
Was able to remove watermellon from fruitBag.
fruitBag after removing watermellon
n=6 Bag: {Apple}, {Cherry}, {Mango}, {Nectarine}, {Pear}, {Plum}

fruitBag before removing nectarine
n=6 Bag: {Apple}, {Cherry}, {Mango}, {Nectarine}, {Pear}, {Plum}
Was able to remove nectarine from fruitBag.
fruitBag after removing nectarine
n=5 Bag: {Apple}, {Cherry}, {Mango}, {Pear}, {Plum}
BUILD SUCCESSFUL (total time: 0 seconds)



*/
