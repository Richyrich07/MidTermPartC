/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author richardeid
 */
public class TestUserprofile {
    
    private UserProfile [] user = new UserProfile[100];
    
    public static void main (String[] args){
        TestUserprofile self = new TestUserprofile();
       self.run();
    }
    
    private void run(){
        int userCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();
        String genre="";
        System.out.println("please choose your favourite Genre:");
        System.out.println("Comedy ,Drama, Action, Mystery");
        genre= sc.next();
        
        
        
         UserProfile newProfile = new UserProfile(userName, genre);
        user [userCount] = newProfile;//add the new user to the user list
        userCount++;
        
        System.out.println("New User Added");
        System.out.println("UserName: " + userName);
        System.out.println("The genre you selected is: "+genre);
    }
}
