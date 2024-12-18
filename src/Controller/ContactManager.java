package Controller;

import materia.models.Contact;
import materia.models.LinkedList;
import materia.models.NodeGeneric;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public void printList() {
        if (contacts.getSize() == 0) {
            System.out.println("No contacts available.");
            return;
        }
        contacts.print();
    }

    public Contact<?, ?> findContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            if (current.getValue() != null && current.getValue().getName() != null &&
                ((String) current.getValue().getName()).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null; // No encontrado
    }

    public void deleteContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();

        if (current == null) {
            return;
        }

        // Caso 1: el contacto es la cabeza
        if (current.getValue() != null && current.getValue().getName() != null &&
            ((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(current.getNext());
            contacts.setSize(contacts.getSize() - 1);
            return;
        }

        // Caso 2: el contacto está en el resto
        while (current.getNext() != null) {
            if (current.getNext().getValue() != null && current.getNext().getValue().getName() != null &&
                ((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize() - 1);
                return;
            }
            current = current.getNext();
        }
    }
}
