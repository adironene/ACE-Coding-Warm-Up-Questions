import java.util.Scanner;

class Greet {
    public static void main(String[] args) {
       Scanner writer = new Scanner(System.in);  
       System.out.println("Hello! what is your name?"); 
       String name = writer.nextLine(); 
       System.out.println("nice to meet you " + name + "."); 
       System.out.println("What is your favorite Pokemon?"); 
       String pokemon = writer.nextLine(); 
       System.out.println(name + "\'s favorite Pokemon is " + pokemon + "."); 
    }
}
