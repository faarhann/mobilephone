import java.util.ArrayList;

public class MobilePhone {

  private ArrayList<Contact> myContacts;

    public MobilePhone(Contact contact) {
        this.myContacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
        }else {
            System.out.println("The contact is in the list");
        }
    }


    public void update(Contact oldContact, Contact newContact){
        if (myContacts.contains(newContact)){
            System.out.println("The contact already exists.");
        }else {
            for (int i = 0; i<myContacts.size(); i++){
                int index = myContacts.indexOf(oldContact);
               if (index < 0){
                   System.out.println("Contact: " + oldContact.getName() + " was not found!");
               }
               else {
                   myContacts.set(index, newContact);
               }
            }
        }
    }

    public void printContacts(){
        for (int i=0; i<myContacts.size(); i++){
            System.out.println("Contact name: " + myContacts.get(i).getName() + "\n" + "Contact number: " + myContacts.get(i).getPhoneNumber());
        }
    }
    public void removeContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(contact);
        }
    }
}
