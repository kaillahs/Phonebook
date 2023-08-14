// Name: Kaillah Selvaretnam
// CSE 145 1736
// Professor: Jeremiah Ramsey
// Assignment 2
// This program is a test program that implements the PhonebookManager. 
public class TestClass {
    public static void main(String[] args) {
        //create and print blank phonebook
        PhonebookManager1 phonebook = new PhonebookManager1();
        phonebook.displayPhonebook();
        
        //testing add entry at the end of list
        System.out.println("TEST ADD-ENTRY-AT-END");
        phonebook.addEntryAtEnd("mary", "bay", "342 real", "NJ", "54345");
        phonebook.addEntryAtEnd("John", "Doe", "123 Main St", "New York", "555-1234");
        phonebook.displayPhonebook();
        
        //testing add entry at the beginning of list
        System.out.println("TEST ADD-ENTRY-AT-BEGINNING");
        phonebook.addEntryAtBeginning("Jane", "Smith", "456 Park Ave", "Los Angeles", "555-5678");
        phonebook.displayPhonebook();
       
        //testing add entry in custom index
        System.out.println("TEST ADD-CUSTOM-ENTRY");
        phonebook.addEntryCustom(3, "alyyl", "john", "325 trea", "KA", "34534");
        phonebook.displayPhonebook();
        phonebook.addEntryCustom(1, "BO", "fruit", "325 trea", "KA", "34534");
        phonebook.displayPhonebook();
        phonebook.addEntryCustom(0, "res", "jaz", "124 tar", "Lo", "12323213");
        phonebook.displayPhonebook();
        
        //testing modifying fields of specified entry
        System.out.println("TEST MODIFY-FIELDS");
        phonebook.modifyFields("BO", "fruit");
        phonebook.displayPhonebook();
        phonebook.modifyFields("Jane", "Smith");
        phonebook.displayPhonebook();
        
        //testing deleting fields of specified entry
        System.out.println("TEST DELETE-FIELDS");
        phonebook.deleteFields("mary", "bay");
        phonebook.displayPhonebook();
        phonebook.deleteFields("Jane", "Does");
        phonebook.displayPhonebook();
        
   }
}