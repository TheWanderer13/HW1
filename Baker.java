import pizzaHelper.CS331Pizza;

public class Baker {
    
    private int numPizza;

    public Baker() {

        this.numPizza = 0;

    }

    public CS331Pizza mushroom() {

        CS331Pizza ord = new CS331Pizza();
        ord.addMushrooms();
        numPizza++;
        return ord;

    }

    public CS331Pizza pineapple() {

        CS331Pizza ord = new CS331Pizza();
        ord.addPineapple();
        numPizza++;
        return ord;

    }

    public CS331Pizza pinePepper() {

        CS331Pizza ord = new CS331Pizza();
        ord.addPineapple();
        numPizza++;
        return ord;

    }

    public CS331Pizza spinach() {

        CS331Pizza ord = new CS331Pizza();
        ord.addSpinach();
        numPizza++;
        return ord;

    }

    public String report() {

    return "The baker has made " + numPizza + " pizzas.";

    }

}
