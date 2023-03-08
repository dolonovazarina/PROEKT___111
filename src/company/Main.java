package company;

import company.model.GENDER;
import company.model.User;
import company.service.UserService;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User ( 2, "Asan", "tasfdbh", GENDER.MALE );
        User user2 = new User ( 1, "Asan", "tasfdbh", GENDER.MALE );
        User user3 = new User ( 3, "Asan", "gffdjggggggg", GENDER.MALE );

        UserServiceImpl userService = new UserServiceImpl ( );
        userService.addUser ( user1 );
        userService.addUser ( user2 );
        userService.addUser ( user3 );
        System.out.println ( "-------------------------" );
        try {
            System.out.println ( userService.findById ( 5 ) );
        } catch (MyException e) {
            System.out.println ( e.getMessage ( ) );
        }
        System.out.println ("-----------------------------" );
        try {
       userService.deleteUserById ( 3 );
        }catch (MyException e){
            System.out.println (e.getMessage () );
        }
        userService.getAllUser ();


    }
}