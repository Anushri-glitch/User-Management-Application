package com.Shrishti.UserManagementApp.Service;

import com.Shrishti.UserManagementApp.Model.Manage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {

    private static List<Manage> manage = new ArrayList<>();

    private static int manageCount =0;

    static {
        manage.add(new Manage(++manageCount,"Anushka","Anushka@1234","Allahabad,India","8081009534"));
        manage.add(new Manage(++manageCount,"Prerna","prerna@365","Banglore,India","3478901245"));
        manage.add(new Manage(++manageCount,"Mitali","mitali@pandit13","Delhi,India","9999334210"));
        manage.add(new Manage(++manageCount,"Adhik","adhikMehta@444","Pune,India","5689347612"));
        manage.add(new Manage(++manageCount,"Mayuresh","mayuresh@90","Goa,India","7056234100"));
        manage.add(new Manage(++manageCount,"Nikhil","nikhil@45","Udaipur,India","6671235902"));
    }

    public List<Manage> getAllUser() {
        return manage;
    }

    public void addUser(Manage addOne){
        manage.add(addOne);
        System.out.println("User Saved!!");
    }

    public Manage getUserById(int id){
        Predicate<? super Manage> predicate = todo -> todo.getId() == id;
        Manage manageId = manage.stream().filter(predicate).findFirst().get();
        return manageId;
    }

    public void deleteUser(int id){
        Predicate<? super Manage> predicate = todo -> todo.getId() == id;
        manage.removeIf(predicate);
        System.out.println("User Removed!!");
    }

    public void updateUserInfo(int id, Manage newUser){

        //Step 1 : find todo to be Update
        //Step 2 : update todo

        Manage manageNew = getUserById(id);
        manageNew.setId(newUser.getId());
        manageNew.setName(newUser.getName());
        manageNew.setUsername(newUser.getUsername());
        manageNew.setAddress(newUser.getAddress());
        manageNew.setPhoneNum(newUser.getPhoneNum());
        System.out.println("User Updated!!");
    }
}

