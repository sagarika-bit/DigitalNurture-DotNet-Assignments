package ecommerce;

public class SearchOperations {

    public static Product linearSearch(Product[] items, String targetName) {

        for (Product item : items) {
            if (item.productName.equalsIgnoreCase(targetName)) {
                return item;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] items, String targetName) {

        int left = 0;
        int right = items.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int result = items[mid].productName.compareToIgnoreCase(targetName);

            if (result == 0) {
                return items[mid];
            }

            if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}