import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveArraylistAtGivenIndex {
/**
Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public static void main(String[] args) {


    ArrayList<String> vegetableList = new ArrayList<>();
    vegetableList.add("CUCUMBER");
    vegetableList.add("POTATO");
    vegetableList.add("CAULIFLOWER");
    vegetableList.add("BRIGLE");
    vegetableList.add("ONION");
    vegetableList.add("BEETROOT");
    vegetableList.add("MASHROOM");
    vegetableList.add("BITTER GUARD");
    System.out.println(vegetableList);
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter an index number : ");
    int index = scan.nextInt();
    if (index < vegetableList.size()){
        System.out.println(vegetableList.get(index));
    }else {
        System.out.println("Invalid Index!!");
    }
    scan.close();

}

}
