public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact("first", "1234");
        Contact contact2 = new Contact("second", "5678");
        Contact contact3 = new Contact("third", "91011");

        MobilePhone mobilePhone = new MobilePhone(contact1);
        mobilePhone.addContact(contact1);
        mobilePhone.addContact(contact2);
        System.out.println("-------------");
        mobilePhone.printContacts();
        mobilePhone.update(contact1, contact3);
        System.out.println("-----------");
        mobilePhone.printContacts();
        mobilePhone.removeContact(contact3);
        System.out.println("-----------");
        mobilePhone.printContacts();

    }
}
