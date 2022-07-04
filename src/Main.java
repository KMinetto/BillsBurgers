import hamburger.Hamburger;

public class Main {
  public static void main(String[] args) {

    Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.56);
    hamburger.addHamburgerAddition1("Tomato", 0.27);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese", 1.12);
    hamburger.addHamburgerAddition4("Carrot", 1.26);
    System.out.println(hamburger.itemizeHamburger() + " €");
  }
}