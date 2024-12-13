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
            if (((String) (current.getValue().getName())).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null; // No se encontró el contacto
    }

    public void deleteContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();

        if (current == null) {
            return; // No hay contactos en la lista
        }

        // Caso 1: El contacto es la cabeza de la lista
        if (((String) (current.getValue().getName())).equalsIgnoreCase(name)) {
            contacts.setHead(current.getNext());
            contacts.setSize(contacts.getSize() - 1); // Actualizar el tamaño
            return;
        }

        // Caso 2: El contacto está en el medio o al final
        while (current.getNext() != null) {
            if (((String) (current.getNext().getValue().getName())).equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize() - 1); // Actualizar el tamaño
                return; // Ya encontramos y eliminamos el contacto
            }
            current = current.getNext();
        }
    }
}
