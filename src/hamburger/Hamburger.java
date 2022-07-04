package hamburger;

/**
 * class Hamburger
 */
public class Hamburger {

  private String name;
  private String meat;
  private String breadRoll;
  private double price;

  private String addition1Name;
  private double addition1Price;

  private String addition2Name;
  private double addition2Price;

  private String addition3Name;
  private double addition3Price;

  private String addition4Name;
  private double addition4Price;

  /**
   * Hamburger constructor
   * @param name String
   * @param meat String
   * @param breadRoll String
   * @param price double
   */
  public Hamburger(String name, String meat, String breadRoll, double price) {
    this.name = name;
    this.meat = meat;
    this.breadRoll = breadRoll;
    this.price = price;
  }

  public void addHamburgerAddition1(String name, double price){
    this.addition1Name = name;
    this.addition1Price = price;
  }

  public void addHamburgerAddition2(String name, double price){
    this.addition2Name = name;
    this.addition2Price = price;
  }

  public void addHamburgerAddition3(String name, double price){
    this.addition3Name = name;
    this.addition3Price = price;
  }

  public void addHamburgerAddition4(String name, double price){
    this.addition4Name = name;
    this.addition4Price = price;
  }

  public double itemizeHamburger() {
    double hamburgerPrice = this.price;

    if (this.addition1Name != null) hamburgerPrice += this.addition1Price;
    if (this.addition2Name != null) hamburgerPrice += this.addition2Price;
    if (this.addition3Name != null) hamburgerPrice += this.addition3Price;
    if (this.addition4Name != null) hamburgerPrice += this.addition4Price;

    return hamburgerPrice;
  }
}