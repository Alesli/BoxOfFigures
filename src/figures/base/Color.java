package figures.base;

public interface Color {

    /**
     * Possible colours for painting a figures.
     */
    enum Colour {
        WHITE, BLACK, RED, GREEN, YELLOW, AQUAMARINE, UNPAINTED
    }

    /**
     * The method which shows the colour of the figure.
     *
     * @return color
     */
    Colour getColour();

    /**
     * The method which paints a figure.
     *
     * @param colour figure
     */
    void setColour(Colour colour);

}
