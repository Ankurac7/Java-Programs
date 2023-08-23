import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;
    String uniqueID;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
        System.out.println();
    }
}

public class q14 {
    public static void main(String[] args) {
        ArrayList<Person> directory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter unique ID: ");
                    String uniqueID = scanner.nextLine();

                    Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    directory.add(person);
                    System.out.println("Entry created successfully!");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter unique ID of the entry to edit: ");
                    String editID = scanner.nextLine();
                    boolean found = false;

                    for (Person p : directory) {
                        if (p.uniqueID.equals(editID)) {
                            System.out.print("Enter new name: ");
                            p.name = scanner.nextLine();
                            System.out.print("Enter new address: ");
                            p.address = scanner.nextLine();
                            System.out.print("Enter new telephone number: ");
                            p.telephoneNumber = scanner.nextLine();
                            System.out.print("Enter new mobile number: ");
                            p.mobileNumber = scanner.nextLine();
                            System.out.print("Enter new head of family: ");
                            p.headOfFamily = scanner.nextLine();
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Entry edited successfully!");
                    } else {
                        System.out.println("Entry not found!");
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    boolean foundKeyword = false;

                    for (Person p : directory) {
                        if (p.name.contains(keyword) || p.address.contains(keyword) || p.telephoneNumber.contains(keyword) ||
                                p.mobileNumber.contains(keyword) || p.headOfFamily.contains(keyword) || p.uniqueID.contains(keyword)) {
                            p.displayInformation();
                            foundKeyword = true;
                        }
                    }

                    if (!foundKeyword){
                        System.out.println("No matching entries found!");
                    }

                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    System.out.println();
                    break;
            }
        }
    }
}
