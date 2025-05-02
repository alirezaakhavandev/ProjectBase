public class User {
    String name;
    String gender;
    String email;
    int age;
    int id;

    //get amount of users each user userCount + 1 to this
    static int userCount; // == 0

    public User(String name, int age , String gender, String email ) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
        //each time you created a user add it to count
        userCount++;
        //each time you had a new user give it a new id
        id = userCount + 1000;
    }

    static int getAllTheUsers() {
        return userCount;
    }

    @Override
    public String toString() {
        return "( User name : " + name + ", age : " + age + ", gender : " + gender + ", email : " + email + ", id : " + id +" )";
    }
}
