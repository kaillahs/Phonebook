// Name: Kaillah Selvaretnam
// CSE 145 1736
// Professor: Jeremiah Ramsey
// Assignment 2
// This program creates a Phonebook manager. This Phonebook Manager allows the user to add 
// entries in various ways as well as edit or delete fields of a specific entry. 
import java.util.*;
public class PhonebookManager1 {
    //fields
    private ListNode head;
    
    //this method is a constructor. There are no parameters. 
    public PhonebookManager1() {
        head = null;
    }
    
    //this method allows the user to add a contact to the beginning of the Phonebook. The 
    //parameters are several Strings representing the first name, last name, address, city, 
    //and phonenumber of the new contact. 
    public void addEntryAtBeginning(String firstName, String lastName, String address, 
                                    String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        newNode.next = head;
        head = newNode;
    }
    
    //this method allows the user to add a contact to the end of the Phonebook. The 
    //parameters are several Strings representing the first name, last name, address, city, 
    //and phonenumber of the new contact. 
    public void addEntryAtEnd(String firstName, String lastName, String address, String city,  
                              String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    //this method allows the user to add a contact to a specified index of the Phonebook. The 
    //parameters are several Strings representing the first name, last name, address, city, 
    //and phonenumber of the new contact as well as an integer representing the index at which the
    //contact should be added to. The phonebook is indexed at 1 not 0. 
    public void addEntryCustom (int index, String firstName, String lastName, String address, 
                                String city, String phoneNumber) {
         if (index <= 0) {
            System.out.println("Invalid index. Index must be greater than 0");
            return;
         } else if (index == 1) {
            addEntryAtBeginning(firstName, lastName, address, city, phoneNumber);
            return;
        }

        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        ListNode current = head;
        int currentIndex = 1;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Invalid index. Index out of bounds.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    //this method allows the user to modify specific fields of a contact specified by the contact's
    //first and last name. The user can indicate which fields they would like to edit and the 
    //parameters are two Strings representing the first and last name of the desired contact. 
    public void modifyFields(String firstName, String lastName) {
        Scanner scanner = new Scanner(System.in);
        ListNode current = head;
        while (current != null) {
            String field = "";

            if (current.firstName.equalsIgnoreCase(firstName) && current.lastName.equalsIgnoreCase(lastName)) {
               System.out.println("Which field would you like to modify?");
               System.out.println("F - First name");
               System.out.println("L - Last name");
               System.out.println("A - Address");
               System.out.println("C - City");
               System.out.println("P - Phone number");
               System.out.println("Q - Quit modify");
               field = scanner.nextLine();
               
               while (!field.equalsIgnoreCase("q")){
                  if (field.equalsIgnoreCase("f")) {
                     System.out.println("Enter new first name:");
                     String newFirstName = scanner.nextLine();
                     current.firstName = newFirstName;
                  } else if (field.equalsIgnoreCase("l")) {
                     System.out.println("Enter new last name:");
                     String newLastName = scanner.nextLine();
                     current.lastName = newLastName;
                  } else if (field.equalsIgnoreCase("a")) {
                     System.out.println("Enter new Address");
                     String newAddress = scanner.nextLine();
                     current.address = newAddress;
                  } else if (field.equalsIgnoreCase("c")) {
                     System.out.println("Enter new city:");
                     String newCity = scanner.nextLine();
                     current.city = newCity;
                  } else if (field.equalsIgnoreCase("p")) {
                     System.out.println("Enter new phone number:");
                     String newPhoneNumber = scanner.nextLine();
                     current.phoneNumber = newPhoneNumber;
                  } else {
                     System.out.println("This is not a valid option.");
                  }
                  
                  System.out.println("Which field would you like to modify?");
                  System.out.println("F - First name");
                  System.out.println("L - Last name");
                  System.out.println("A - Address");
                  System.out.println("C - City");
                  System.out.println("P - Phone number");
                  System.out.println("Q - Quit modify");
                  field = scanner.nextLine();

               }
               return;                
            }
            current = current.next;   
        }
        System.out.println("Entry with the given name not found in the phonebook.");
        System.out.println();
    }
    
    //this method allows the user to delete specific fields of a contact specified by the contact's
    //first and last name. The user can indicate which fields they would like to delete and the 
    //parameters are two Strings representing the first and last name of the desired contact. 
    public void deleteFields(String firstName, String lastName) {
        Scanner scanner = new Scanner(System.in);
        ListNode current = head;
        while (current != null) {
            String field = "";

            if (current.firstName.equals(firstName) && current.lastName.equals(lastName)) {
               System.out.println("Which field would you like to delete?");
               System.out.println("F - First name");
               System.out.println("L - Last name");
               System.out.println("A - Address");
               System.out.println("C - City");
               System.out.println("P - Phone number");
               System.out.println("Q - Quit modify");
               field = scanner.nextLine();
               
               while (!field.equalsIgnoreCase("q")){
                  if (field.equalsIgnoreCase("f")) {
                     current.firstName = "";
                  } else if (field.equalsIgnoreCase("l")) {
                     current.lastName = "";
                  } else if (field.equalsIgnoreCase("a")) {
                     current.address = "";
                  } else if (field.equalsIgnoreCase("c")) {
                     current.city = "";
                  } else if (field.equalsIgnoreCase("p")) {
                     current.phoneNumber = "";
                  } else {
                     System.out.println("This is not a valid option.");
                  }
                  
                  System.out.println("Which field would you like to delete?");
                  System.out.println("F - First name");
                  System.out.println("L - Last name");
                  System.out.println("A - Address");
                  System.out.println("C - City");
                  System.out.println("P - Phone number");
                  System.out.println("Q - Quit modify");
                  field = scanner.nextLine();

               }
               return;              
            }
            current = current.next;
        }
        System.out.println("Entry with the given name not found in the phonebook.");
        System.out.println();
    }

    
    //this method allows the user to print out their phonebook in a neat manner. There are
    //no parameters for this method. 
    public void displayPhonebook() {
        ListNode current = head;
        System.out.println("Phonebook Entries:");
        while (current != null) {
            System.out.println("   Name: " + current.firstName + " " + current.lastName);
            System.out.println("   Address: " + current.address);
            System.out.println("   City: " + current.city);
            System.out.println("   Phone Number: " + current.phoneNumber);
            System.out.println("   ------------------------");
            current = current.next;
        }
        System.out.println();
    }
    
}
