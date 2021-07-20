import java.util.Arrays;
public class Item_detail {

    int price;
    String[] ingredients;
    String name;
    int id;
    static int total_order=0;

    public Item_detail(int price,String name,int id,String... ingredients) {
        this.price = price;
        this.ingredients = ingredients;
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Item_detail [price=" + price + ", ingredients=" + Arrays.toString(ingredients) + ", name=" + name
                + ", id=" + id + "]";
    }


}
public class Person {
    String name;
    int mobile_no;
    int order_no;
    static int orders = 0;
    static Item_detail[][] orderedItemsHistory = new Item_detail[100][10];
    public Person(String name, int mobile_no) {
        super();
        this.name = name;
        this.mobile_no = mobile_no;
        this.order_no = 0;
    }
    void placeOrder(Item_detail[] a) {
        for (int i = 0; i < a.length; i++) {
            orderedItemsHistory[orders++][i] = a[i];
        }
    }
    void displayHistory() {
        for (int i = 0; i < orders; i++) {
            System.out.println("Order " + i + ":\n");
            for (int j = 0; j < orderedItemsHistory[i].length; j++) {
                System.out.print(orderedItemsHistory[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Restaurant {
    Item_detail[] items;
    Person[] customers;
    int count = 0;
    double revenue;
    Scanner sc = new Scanner(System.in);

    public Restaurant(Item_detail[] items) {
        this.items = items;
        customers = new Person[100];
        revenue = 0;
    }

    void addCustomer(Person p) {
        customers[count++] = p;
    }

    void placeOrder(Person p) {
        displayMenu();
        int k, l = 0;
        Item_detail[] a = new Item_detail[10];
        while ((k = sc.nextInt()) != -1) {
            System.out.println("Enter item_id to select the item or -1 to stop selecting");
            a[l++] = getItem(k);
        }
        p.placeOrder(a);
    }

    void displayPersonHistory(Person p) {
        p.displayHistory();
    }

    void displayMenu() {
        for (Item_detail i : items) {
            System.out.println(i);
        }
    }

    Item_detail getItem(int id) {
        for (Item_detail i : items) {
            if (i.id == id) {
                return i;
            }
        }
        return null;
    }

    void displaybill(Person p) {
        int sum = 0;
        for (int i = 0; p.orderedItemsHistory[p.orders - 1][i] != null; i++) {
            System.out.println(
                    p.orderedItemsHistory[p.orders - 1][i].name + " " + p.orderedItemsHistory[p.orders - 1][i].price);
            sum = sum + p.orderedItemsHistory[p.orders - 1][i].price;
        }
        System.out.println("Total bill : " + sum);
        revenue = revenue + sum;
    }

    void totalRevenue() {
        System.out.println("total revenue is : " + revenue);
    }

    void displayPremiumCustomer() {
        double sum = 0;
        for (int i = 0; i < customers.length && customers[i] != null; i++) {
            Person p = customers[i];
            for (int j = 0; p.orderedItemsHistory[j] != null; j++) {
                for (int k = 0; p.orderedItemsHistory[j][k] != null; k++) {
                    sum = sum + p.orderedItemsHistory[j][k].price;
                }
            }
            if (sum > 1000)
                System.out.println(p.name + " spends " + sum + " and is a premium customer");
        }
    }
    public static void main(String[] args)
    {
        Item_detail chin[]= new Item_detail[6];
        chin[0]=new Item_detail(250, "Biriyani", 1,"Chicken","Rice");
        chin[1]=new Item_detail(450, "Chowmein", 2,"Vegetables");
        chin[2]=new Item_detail(450, "Chicken Momo", 3,"Flour");
        chin[3]=new Item_detail(700, "Pizza", 4,"Cheese");
        chin[4]=new Item_detail(200, "Samosa", 5,"Potato");
        chin[5]=new Item_detail(200, "Maggi", 6,"Water","Vegetables");

        Person p1=new Person("Mr Ghose",99326999);
        Person p2=new Person("Mr.Sen",99330022);
        Restaurant r=new Restaurant(chin);
        r.displayMenu();

        r.addCustomer(p1);
        r.placeOrder(p1);
        r.displayPersonHistory(p1);
        r.displayPremiumCustomer();
        r.displaybill(p1);
        r.totalRevenue();


        r.addCustomer(p2);
        r.placeOrder(p2);
        r.displayPersonHistory(p2);
        r.displayPremiumCustomer();
        r.displaybill(p2);
        r.totalRevenue();
        System.out.println("The Total Quantiy Ordered: "+Item_detail.total_order);
    }
}

