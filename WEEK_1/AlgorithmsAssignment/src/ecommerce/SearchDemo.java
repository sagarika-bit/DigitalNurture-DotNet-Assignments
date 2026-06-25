package ecommerce;

public class SearchDemo {

        public static void main(String[] args) {

                Product[] products = {
                                new Product(101, "Laptop", "Electronics"),
                                new Product(102, "Mobile", "Electronics"),
                                new Product(103, "Mouse", "Accessories"),
                                new Product(104, "Tablet", "Electronics"),
                                new Product(105, "Watch", "Accessories")
                };

                Product linearResult = SearchOperations.linearSearch(products, "Mouse");

                if (linearResult != null) {
                        System.out.println("Linear Search Found: "
                                        + linearResult.productName);
                }

                Product binaryResult = SearchOperations.binarySearch(products, "Mouse");

                if (binaryResult != null) {
                        System.out.println("Binary Search Found: "
                                        + binaryResult.productName);
                }
        }
}