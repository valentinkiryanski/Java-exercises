package com.myproject;
import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts){
        this.myNumber = myNumber;

    }

    public boolean addNewContact(Contact contact){
        boolean isTrue = true;
        for(Contact el : myContacts){
            if(contact.getName().equals(el.getName())){
                isTrue = false;
            }
        }
        myContacts.add(contact);
        return isTrue;

    }

    public boolean updateContact (Contact contact, Contact contact1){
        boolean isTrue = false;
        for(Contact el : myContacts){
            if(contact.getName().equalsIgnoreCase(el.getName())){
                myContacts.remove(el);
                myContacts.add(contact1);
                isTrue = true;
            }
        }
        return isTrue;
    }

    public boolean removeContact (Contact contact){
        boolean isTrue = false;
        for(Contact el : myContacts){
            if(contact.getName().equalsIgnoreCase(el.getName())){
                myContacts.remove(el);
                isTrue = true;
            }
        }
        return isTrue;
    }

    public int findContact(Contact contact1){
        int result = -1;
        for(Contact contact : myContacts){
            if(contact.getName().equalsIgnoreCase(contact1.getName())){
                result = myContacts.indexOf(contact);
            }
        }
        return result;
    }

    public int findContact(String name){
        int result = -1;
        for(Contact contact : myContacts){
            if(contact.getName().equalsIgnoreCase(name)){
                result = myContacts.indexOf(contact);
            }
        }
        return result;
    }

    public Contact queryContact(String name){
        for(Contact contact : myContacts){
            if(name.equalsIgnoreCase(contact.getName())){
                return contact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(Contact contact : myContacts){
            System.out.println(myContacts.indexOf(contact)+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());

        }
    }


}
