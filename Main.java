import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
//over here i added scanner 
    System.out.println("whats your name");
    String name = scan.next();
//i asked the persons name using print
    System.out.println("are you at least 6,7 feet tall?");
    boolean height = scan.nextBoolean();
//here  aksed if thier 6,7 because thats the average for the nba
    if (height) {
      System.out.println("do you have at least 5 years of experience");
      boolean experience = scan.nextBoolean();
      if (experience) {
//i also used scanner for all of these and this one i just asked if he had any experience
        nbaTryout(name);
      }
    }
    System.out.println("how much money do you have to buy shoes?");
    double money = scan.nextDouble();
//this one is me starting my second method and asking about shoes
    System.out.println("this is how much money you have left : "  + shoes(money));
  }
//right here i asked them how much money they got to see what brands they ca afford
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
//if any of these return false they are not going to work correctly
  }

  static double shoes(double money) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println(
        "what brand are you intrested in?, we have nike shoes they are 100$ we also have jordans they are 200$ and lastly we have vans which are 50$. Enter the price of the brand you'd like to purchase.");
    double brand = scan.nextDouble();
    if (brand == 50.0) {
      System.out.println("great you want to buy vans!");
    }//i asksed over here what brands they are intreted to buy and i used scanner 
    if (brand == 200.0) {
      System.out.println("great you want to buy Jordans!");
//if they put 200 then they ask for jordans 
    }
    if (brand == 100.0) {
      System.out.println("great you want to buy Nike!");
    }//if they out 100 then they are askig for nike 
    return money - brand;
  }

}