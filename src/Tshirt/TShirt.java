package Tshirt;

import java.util.ArrayList;
import java.util.Arrays;

    public class TShirt {
        String name;
        int productCode;
        double price;
        String brand;
        String description;
        ArrayList<String> sizes;

        public TShirt(String name, int productCode, double price, String brand, String description, String[] sizes) {
            this.name = name;
            this.productCode = productCode;
            this.price = price;
            this.brand = brand;
            this.description = description;
            this.sizes = new ArrayList<>(Arrays.asList(sizes));
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String describeTShirt() {
            return String.format("Item name: %s\nDescription: %s\nProduct code: %d\nBrand: %s\nPrice: %.2f\nSizes: %s",
                    name, description, productCode, brand, price, sizes.toString());
        }
    }
