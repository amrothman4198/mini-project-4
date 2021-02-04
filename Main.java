import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("whats your name");
    String name = scan.next();

    System.out.println("are you at least 6,7 feet tall?");
    boolean height = scan.nextBoolean();

    if (height) {
      System.out.println("do you have at least 5 years of experience");
      boolean experience = scan.nextBoolean();
      if (experience) {

        nbaTryout(name);
      }
    }
    System.out.println("how much money do you have to buy shoes?");
    double money = scan.nextDouble();

    System.out.println("this is how much money you have left : "  + shoes(money));
  }

  static boolean nbaTryout(String name) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("how high can you jump" + name);
    double jump = scan.nextDouble();
    if (jump >= 5.0) {
      System.out.println("great! now whats your shot%" + name);
      double shot = scan.nextDouble();
      if (shot >= 30.0) {
        System.out.println("amazing! whats your wingspan" + name);
        double wingspan = scan.nextDouble();
        if (wingspan >= 6.1) {
          return true;
        }
        return false;
      }
      return false;
    }
    return false;

  }

  static double shoes(double money) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println(
        "what brand are you intrested in?, we have nike shoes they are 100$ we also have jordans they are 200$ and lastly we have vans which are 50$. Enter the price of the brand you'd like to purchase.");
    double brand = scan.nextDouble();
    if (brand == 50.0) {
      System.out.println("great you want to buy vans!");
    }
    if (brand == 200.0) {
      System.out.println("great you want to buy Jordans!");

    }
    if (brand == 100.0) {
      System.out.println("great you want to buy Nike!");
    }
    return money - brand;
  }

}