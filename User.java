package model;

public abstract class User {

    
    
    public User(String firstName, String lastName, String midlleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midlleName = midlleName;
    }

    private String firstName;
    
    private String lastName;
    
    private String midlleName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidlleName() {
        return midlleName;
    }

    public void setMidlleName(String midlleName) {
        this.midlleName = midlleName;
    }
    
    
}
