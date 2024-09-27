import java.util.Scanner;

public class Driver
{
    public static void main(String args[])
    {
        int choice; 

        Person P1 = new Person("Husnain Mehmood", "03104165498");
        Address A1 = new Address("7", "Lahore", "54000");

        

        PharmacyShop p1 = new PharmacyShop(A1, 9, P1);

        
        System.out.println("1. Add medicine");
        System.out.println("2. Update Medicine");
        System.out.println("3. Remove medicine4");
        System.out.println("4. Sell medicine");
        System.out.println("5. Display medicines");
        System.out.println("6. Search by ID or Nmae");
        System.out.println("7. Print total revenue");
        System.out.println("8. Display expired medicine");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
            Medicine M1 = new Medicine();

                System.out.println("Enter Batch number : ");
                M1.setBatchNumber(sc.nextLine());
                System.out.println("Enter Expiry date : ");
                M1.setExpiryDate(new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                System.out.println("Enter Medicine ID : ");
                M1.setMedicineId(sc.nextLine());
                System.out.println("Enter Name : ");
                M1.setName(sc.nextLine());
                System.out.println("Enter Price : ");
                M1.setPrice(sc.nextDouble());
                System.out.println("Enter Quantity : ");
                M1.setQuantity(sc.nextInt());
                System.out.println("Enter Manufacturer : ");
                M1.setmanufacturer(sc.nextLine());

                p1.addMedicine(M1);
            
                
                break;
            case 2:
            Medicine M2 = new Medicine();

                System.out.println("Enter Batch number : ");
                M2.setBatchNumber(sc.nextLine());
                System.out.println("Enter Expiry date : ");
                M2.setExpiryDate(new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                System.out.println("Enter Medicine ID : ");
                M2.setMedicineId(sc.nextLine());
                System.out.println("Enter Name : ");
                M2.setName(sc.nextLine());
                System.out.println("Enter Price : ");
                M2.setPrice(sc.nextDouble());
                System.out.println("Enter Quantity : ");
                M2.setQuantity(sc.nextInt());
                System.out.println("Enter Manufacturer : ");
                M2.setmanufacturer(sc.nextLine());




                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
            for(int i = 0; i < p1.returnCount(); i++)
            {
                p1.list[i].Display();
                System.out.println("---------------------------------");
            }
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
                
        
            default:
                break;
        }
        

    }
}