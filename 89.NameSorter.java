import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for list of names
        System.out.print("Enter list of names separated by commas: ");
        String[] names = input.nextLine().split(",");
        
        // Ask user for sort order
        System.out.print("Enter sort order (asc or desc): ");
        String sortOrder = input.nextLine();
        
        // Sort names in alphabetical order
        if (sortOrder.equalsIgnoreCase("asc")) {
            Arrays.sort(names);
        } 
        // Sort names in reverse alphabetical order
        else if (sortOrder.equalsIgnoreCase("desc")) {
            Arrays.sort(names, Collections.reverseOrder());
        }
        
        // Print sorted list of names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
