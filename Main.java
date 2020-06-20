import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, my name is Addy! What is your name?");
    Scanner user_input = new Scanner(System.in);
    String request;
    do {
      double fnum, snum, answer;
      String name = user_input.nextLine();
      System.out.print("Let's do some additon " + name);
      System.out.println(", pick a number!");

      fnum = user_input.nextDouble();
      System.out.println("Pick another number");
      snum = user_input.nextDouble();
      answer = fnum + snum;
      System.out.print("The answer to that is ");
      System.out.println(answer);
      System.out.println("Congrats you did some addition!");
      System.out.println("Did you want to do another problem? Yes or No");
      request = user_input.next();
    } while (request.equalsIgnoreCase("Yes"));
  }
}