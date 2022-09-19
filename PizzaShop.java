import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

/**
 * This is our top-level class that represents a PizzaShop!
 */
public class PizzaShop extends PizzaShopHelper{
    
    // this declares our instance variable "toppings"
    private CS331Toppings toppings;
    private Baker employee;

    /**
     * This is the constructor of the PizzaShop class. You should initialize all your instalce variables here,
     * and be sure to open shop!
     */

    public PizzaShop() {
        super();
        openShop();
        displayShopUpdate("The shop is open!");
        //this initializes our instance variable "toppings"
        this.toppings = new CS331Toppings();
        this.employee = new Baker();
    }

    /**
     * This method is called automatically when the user clicks "Order 1". Check out
     * the Javadocs for more information.
     */

    @Override
    public void order1() {
        CS331Pizza temp;
        temp = employee.mushroom();
        displayPrice(temp);
        displayShopUpdate(employee.report());
    }

    /**
     * This method is called automatically when the user clicks "Order 2". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order2() {
        CS331Pizza temp;
        temp = employee.pineapple();
        toppings.addPeppers(temp);
        displayPrice(temp);
        displayShopUpdate(employee.report());
    }

    /**
     * This method is called automatically when the user clicks "Order 3". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order3(){
        CS331Pizza temp;
        temp = employee.pineapple();
        toppings.addPeppers(temp);
        toppings.addTomatoes(temp);
        displayPrice(temp);
        displayShopUpdate(employee.report());
    }

    /**
     * This method is called automatically when the user clicks "Order 4". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order4() {
        CS331Pizza temp;
        temp = employee.spinach();
        toppings.addPeppers(temp);
        toppings.addTomatoes(temp);
        displayPrice(temp);
        displayShopUpdate(employee.report());
    }
}
