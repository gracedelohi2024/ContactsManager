public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Flora";
        contact1.phoneNumber = "0707090864";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Ariane";
        contact2.phoneNumber = "0505234567";
        Contact contact3 = new Contact();
        contact3.name = "Joel";
        contact3.phoneNumber = "0707684250";
        Contact contact4 = new Contact();
        contact4.name = "Latif";
        contact4.phoneNumber = "0707689076";


        myContactsManager.addContact(contact2);
        myContactsManager.addContact(contact3);
        myContactsManager.addContact(contact4);


        Contact result = myContactsManager.searchContact("Latif");
        if (result != null) {
            System.out.println("Le numéro de Latif est: " + result.phoneNumber + ",");
        } else {
            System.out.println("Impossible de retrouver ce contact.");
        }
    }
}
