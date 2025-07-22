import java.util.Scanner;
public class UserInfo{
    // Create these variables with proper access modifiers
    public static String name;
    public static int age;
     public static String email;
     public static boolean isActive;

    // Create constructor that takes all parameters
    public void userConstructor(){
        name="John Doe";
        age=21;
        email="JohnDoe@mail.com";
        isActive = true;
    }
    // Create getter and setter methods for all variables
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public boolean getIsActive(){
        return isActive;
    }

    public static void setUserInfo(String newName, int newAge, String newEmail, boolean newIsActive){
        name = newName;
        age = newAge;
        email = newEmail;
        isActive = newIsActive;
    }

    // Create a method that displays user info nicely formatted
    public static void displayInfo() {
    System.out.println("--------User Info---------");
    System.out.println("--------Name---------");
    System.out.println(name);
    System.out.println("--------Age---------");
    System.out.println(age);
    System.out.println("--------Email---------");
    System.out.println(email);
    System.out.println("--------is Active---------");
    System.out.println(isActive);
    }
    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Create 3 different users

// Display their information
// Test your getters and setters

    }
}

