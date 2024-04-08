package ca.bcit.comp2522.termproject.oishiiramen;

/**
 * Shoyu class.
 *
 * @author Atsuko Uemura, Misuzu Taniguchi
 * @version 12-April-2024
 */
public class Shoyu extends Menu {
    /**
     * Material cost for Shoyu ramen.
     */
    public static final double COST_FOR_SHOYU = 3.50;

    /**
     * Constructs an object of Miso with a parameter.
     *
     * @param size as a Sting
     */
    public Shoyu(final String size) {
        super(size);
    }

    /**
     * Returns a cost for a Shoyu ramen.
     *
     * @return COST_FOR_SHOYU as a double
     */
    public double getCostForRamen() {
        return COST_FOR_SHOYU;
    }
}
