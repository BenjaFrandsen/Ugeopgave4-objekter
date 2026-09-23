import java.sql.SQLOutput;

public class Main {

    public static void main() {
        /*
        //Opgave 1:
        //ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("John Olsen", 60);
        Student s2 = new Student("Niels Erik" , 80);
        Student s3 = new Student("Freja Nielsen", 20);

        Student[] studentList = {s1, s2, s3};

        //studentList.add(s1);
        //studentList.add(s2);
        //studentList.add(s3);

        for (Student student: studentList){
            student.printStudentInfo();
        }

        Student oldestStudent = studentList[0];
        for (Student currentStudent : studentList) {
            if (currentStudent.age > oldestStudent.age) {
                oldestStudent = currentStudent;
            }

        }

        System.out.println("\nOldest student: " + oldestStudent.name );

         */


    //Opgave 2;
        /*

        Product p1 = new Product("Laptop", 5999, new String[]{"electronics", "new"});
        Product p2 = new Product("Hair Spray", 69,new String[]{"Hair product", "sale"});
        Product p3 = new Product("Mango Loco", 10, new String[]{"Beverage", "sale"});
        Product p4 = new Product("Supreme Cheese", 2499, new String[]{"Extreme Supreme Min holes chees deluxe"});

        Product[] productList = {p1, p2, p3, p4};

        System.out.println("Items for sale");
        for(Product product: productList) {
            if(product.hasTag("sale")) {
                product.printInfo();
            }
        }

        Product mostExpensiveProduct = productList[0];
        for (Product currentProduct : productList) {
            if (currentProduct.price > mostExpensiveProduct.price) {
                mostExpensiveProduct = currentProduct;
            }
        }
        System.out.println("Most expensive product: "+mostExpensiveProduct.name);

         */

        //Opgave 3
        /*
        BankAccount ba1 = new BankAccount("Benjas Bank", 1500);

        ba1.deposit(1500);
        ba1.withdraw(200);
        ba1.deposit(250);
        ba1.withdraw(600);
        ba1.deposit(5000);

        ba1.printTransactionHistory();

        System.out.println("Current balance " + ba1.balance);

         */


        //Opgave 4
        /*
        Team boys = new Team("Bang Bros");
        Team girls = new Team("Girthy Girls");

        boys.addPlayer(new Player("Gunstige Gert", 69));
        boys.addPlayer(new Player("Sprøjte Søren", 13));
        boys.addPlayer(new Player("Lumre Lars", 40));

        girls.addPlayer(new Player("Frejdige Frederikke", 50));
        girls.addPlayer(new Player("Lystige Laura", 20));
        girls.addPlayer(new Player("Slidte Gitte", 30));

        boys.compete(girls);

         */

        //Opgave 6
        Inventory p1 = new Inventory("Mage", 9);
        Inventory p2 = new Inventory("Warrior", 15);

        p1.addItem(new Item("Wand", 300, "weapon"));
        p1.addItem(new Item("Health Potion", 50, "potion"));
        p1.addItem(new Item("Cloak", 100, "armor"));

        p2.addItem(new Item("Wooden Sword", 50, "weapon"));
        p2.addItem(new Item("Wooden Shield", 60, "armor"));
        p2.addItem(new Item("Health Potion", 50, "potion"));

        p1.printIventory();
        p2.printIventory();

        System.out.println("Total items created: " + Item.getTotalItemsCreated());



    }


}
