import java.util.Scanner;

public class GetTheInput{
    public GetTheInput(){

    }
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of cards: ");

    String deskSizeStr= scanner.nextLine();
    System.out.println("deckSize is: "+deskSizeStr);
    }
}