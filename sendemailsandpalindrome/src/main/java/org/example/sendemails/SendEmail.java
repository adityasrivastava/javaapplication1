package org.example.sendemails;

import java.util.*;

public class SendEmail {

    final HashMap<String, LinkedList<String>> addressbook;

    SendEmail() {
        addressbook = new HashMap<>();
    }

    private void addContact(String owner, String friendsEmail) {
        if (!addressbook.containsKey(owner))
            addressbook.put(owner, new LinkedList<String>());

        if(!addressbook.get(owner).contains(friendsEmail))
            addressbook.get(owner).add(friendsEmail);

        if (!addressbook.containsKey(friendsEmail))
            addressbook.put(friendsEmail, new LinkedList<String>());

        if(!addressbook.get(friendsEmail).contains(owner))
            addressbook.get(friendsEmail).add(owner);

    }

    public void printOwnersEmailGroups(String sendEmailAddress) {

        LinkedList<String> contacts = addressbook.get(sendEmailAddress);

        System.out.println("Owner Email " + sendEmailAddress);

        ListIterator<String> stringListIterator = contacts.listIterator();

        while (stringListIterator.hasNext()) {
            System.out.println("Send Email ---> " + stringListIterator.next());
        }
    }

    public void printAllOwnersEmailGroups() {

        for (Map.Entry<String, LinkedList<String>> entry : addressbook.entrySet()) {
            System.out.println("Owner Email " + entry.getKey());

            ListIterator<String> stringListIterator = entry.getValue().listIterator();

            while (stringListIterator.hasNext()) {
                System.out.println("Send email to ---> " + stringListIterator.next());
            }
            System.out.println("\n");
        }

    }

    public void sendEmail(String senderEmail, String message, Map<String, String[]> friendsArray) {
        for (Map.Entry<String, String[]> owner : friendsArray.entrySet()) {
            String[] contacts = owner.getValue();
            for (String contact : contacts) {
                addContact(owner.getKey(), contact);
            }
        }

        printOwnersEmailGroups(senderEmail);

    }


    public static void main(String[] args) {
        SendEmail emails = new SendEmail();

        Map<String, String[]> contacts = new HashMap<>();
        contacts.put("a@gmail.com", new String[]{"b@gmail.com", "c@gmail.com"});
        contacts.put("b@gmail.com", new String[]{"d@gmail.com", "e@gmail.com"});
        contacts.put("c@gmail.com", new String[]{"a@gmail.com", "b@gmail.com"});

        emails.sendEmail("a@gmail.com", "test", contacts);
    }

}
