public class Product {
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Price: " + price);
        System.out.println("Tag: " );

        for (String tag: tags) {
            System.out.println(tag);
        }
    }

     boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tag)) {
                return true;
            }
        }
        return false;
    }





}



