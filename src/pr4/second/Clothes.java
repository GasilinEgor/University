package pr4.second;

abstract class Clothes {
    private Sizes size;
    private int cost;
    private String colour;


    public Clothes(Sizes size, int cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }


    public Sizes getSize() {
        return size;
    }


    public int getCost() {
        return cost;
    }


    public String getColour() {
        return colour;
    }
}
