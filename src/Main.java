import hamburger.Hamburger;
import hamburger.deluxe.DeluxeBurger;
import hamburger.healthy.HealthyBurger;

public class Main {
  public static void main(String[] args) {

    Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.56);
    hamburger.addHamburgerAddition1("Tomato", 0.27);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese", 1.12);
    hamburger.addHamburgerAddition4("Carrot", 1.26);
    System.out.println(hamburger.itemizeHamburger() + " €");

    HealthyBurger healthy = new HealthyBurger("Bacon", 5.67);
    healthy.addHamburgerAddition1("Egg", 5.43);
    healthy.addHealthAddition1("Salad", 0.64);
    healthy.addHealthAddition2("Tomato", 0.27);
    System.out.println(healthy.itemizeHamburger() + " €");

    DeluxeBurger deluxe = new DeluxeBurger();
    deluxe.addHamburgerAddition1("Tomato", 500.3);
    System.out.println(String.format("%.2f", deluxe.itemizeHamburger()));
  }
}