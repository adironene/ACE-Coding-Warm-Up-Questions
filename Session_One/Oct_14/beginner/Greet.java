import java.util.Scanner;

class Greet {
    public static void main(String[] args) {
       Scanner writer = new Scanner(System.in);  
       System.out.println("Hello! what is your name?"); 
       String name = writer.nextLine(); 
       System.out.println("nice to meet you " + name + "!"); 
    }
}
