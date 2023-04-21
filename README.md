# User-Management-Application
##### :purple_square: Its a Web Application
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA
    3. Postman
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :two: Dataflow (Functions Used In)
### :purple_square: 1. Model - We have used one model which is Manage.java
#### :o: Manage.java
```java
package com.Shrishti.UserManagementApp.Model;

public class Manage {
    private int id;
    private String name;
    private String username;
    private String address;
    private String phoneNum;
    
     public String toString(){
        return "manage{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",username='" + username + '\'' +
                ",address='" + address + '\'' +
                ",phoneNumber='" + phoneNum +
                "}";
    }
}
```
##### To See Model
:heavy_check_mark: [Model](https://github.com/Anushri-glitch/User-Management-Application/tree/master/src/main/java/com/Shrishti/UserManagementApp/Model)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### :purple_square: 2. Service - We have used one service which is UserService.java
#### :o: UserService.java
```java
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
}
```
#### To See Service
:heavy_check_mark: [Service](https://github.com/Anushri-glitch/User-Management-Application/tree/master/src/main/java/com/Shrishti/UserManagementApp/Service)
-----------------------------------------------------------------------------------------------------------------------------------------------------------

### :purple_square: 3. Controller - We have used one controller which is UserController.java
#### :o: UserController.java
```java
@RestController
@RequestMapping("/api/userManagement/manage-app")
public class UserController {

    private final UserService newUserServe;

    public UserController(UserService newUserServe){
        this.newUserServe = newUserServe;
    }
    
    @PostMapping("/add-user")
    public void addUser(@RequestBody Manage newManage){
        newUserServe.addUser(newManage);
    }
    
    @GetMapping("/get-User/id/{id}")
    public Manage getUserById(@PathVariable int id){
        return newUserServe.getUserById(id);
    }
}
```
#### To See Controller
:heavy_check_mark: [Controller](https://github.com/Anushri-glitch/User-Management-Application/tree/master/src/main/java/com/Shrishti/UserManagementApp/Controller)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: DataStructures Used in Project
    1. List
    2. ARRAYLIST
-------------------------------------------------------------------------------------------------------------------------------------------------------
## :four: Project Summary
### :o: Project result 
#### :purple_square: Add User By Postman - localhost:8080/api/userManagement/manage-app/add-user
![A2](https://user-images.githubusercontent.com/47708011/233684901-f5aff389-cccd-45ff-a5b8-12cf504d7650.png)

#### :purple_square: Get All Users By Browser - http://localhost:8080/api/userManagement/manage-app/get-allUser
![A1](https://user-images.githubusercontent.com/47708011/233685153-262f5b6f-393b-48c0-a132-e5959d12b841.png)

#### :purple_square: Update User By Postman - localhost:8080/api/userManagement/manage-app/update-User/id/{id}
![A3](https://user-images.githubusercontent.com/47708011/233685479-6c3ba4a1-0b92-4edb-93ef-7d4b78170662.png)
![A4](https://user-images.githubusercontent.com/47708011/233685761-734b7247-601a-405b-b868-e57de2bf12a3.png)

#### :purple_square: Delete User By Postman - localhost:8080/api/userManagement/manage-app/delete-User/id/{id}
![A5](https://user-images.githubusercontent.com/47708011/233686091-798000ba-9dd2-4ae6-848f-10fd58cd8a3f.png)
![A6](https://user-images.githubusercontent.com/47708011/233686356-875c7d70-217f-4fb9-b74f-c5bde2de2aac.png)



