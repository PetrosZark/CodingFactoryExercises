package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class UserMain {

    public static void main(String[] args) {
        User alice = new User(12345, "Alice", "W.");
        UserCredentials aliceCredentials = new UserCredentials(67890, "AliceW", "Rabbithole8");

        System.out.println("Firstname = " + alice.getFirstname() + ", Lastname = " + alice.getLastname() +", Id = " + alice.getId());
        System.out.println("Username = " + aliceCredentials.getUsername() + ", Password = " + aliceCredentials.getPassword() + ", Id = " +
                aliceCredentials.getId());


    }



}
