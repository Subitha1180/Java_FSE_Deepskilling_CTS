import java.util.*;
import java.util.stream.Collectors;
public class SearchFunction {

    public static void main(String[] args) {
        List<String> products = Arrays.asList(
            "iPhone 15", "Samsung Galaxy S24", "OnePlus Nord CE 4",
            "MacBook Air", "Dell Inspiron 14", "HP Pavilion x360",
            "Sony Headphones","Boat Wireless Earbuds"
        );

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product keyword to search: ");
        String keyword = sc.nextLine().trim().toLowerCase();
        List<String> matches = products.stream()
            .filter(p -> p.toLowerCase().contains(keyword))
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .collect(Collectors.toList());

        if (matches.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println("Matching products:");
            matches.forEach(p -> System.out.println(p));
        }

        sc.close();
    }
}
