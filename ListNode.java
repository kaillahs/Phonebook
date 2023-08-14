// Name: Kaillah Selvaretnam
// CSE 145 1736
// Professor: Jeremiah Ramsey
// Assignment 2
// This program creates a ListNode for a phonebook.  

public class ListNode {
    //fields
    String firstName;
    String lastName;
    String address;
    String city;
    String phoneNumber;
    ListNode next;
   
   //this method is a constructor. The parameters are several Strings each representing
   //the first name, last name, address, city, and phonenumber of a contact. 
    public ListNode(String firstName, String lastName, String address, String city, String 
                    phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}