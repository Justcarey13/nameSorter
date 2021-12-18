import java.util.Arrays;
import java.util.List;

public class Person {
    /**
     * Constructor for person
     */
    private String lastName;
    private String fullName;
    private String firstName;
    
    public Person() {
        this.lastName = getLastName();
        this.fullName = getFullName();
        this.firstName = getFirstName();
    }

    /**
     * Getter for full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter for full name
     * @param fullName
     * @throws Exception
     */
    public void setFullName(String fullName) throws Exception {
        this.fullName = fullName;
        String[] s = fullName.split(" ");
        List<String> fullNameList = Arrays.asList(s);  

        // A name must have at least 1 given name 
        // and may have up to 3 given names
        if (fullNameList.size() == 1) {
            throw new Exception("A name must have at least 1 given name");
        } 
        if (fullNameList.size() > 4) {
            throw new Exception("A name only up to 3 given names");
        }

        this.setLastName(fullNameList);
        this.setFirstName(fullNameList);
    }

    /**
     * Getter for last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for last name
     * @param fullNameList
     */
    public void setLastName(List<String> fullNameList) {
        this.lastName = fullNameList.get(fullNameList.size()-1);
    }
    
    /**
     * Getter for first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for first name
     * @param fullNameList
     */
    public void setFirstName(List<String> fullNameList) {
        String givenName = new String();
        for (String given : fullNameList) {
            if (given != this.getLastName()) {
                if (givenName.isEmpty()) {
                    givenName += given;
                } else {
                    givenName += " ";
                    givenName += given;
                }
            }
        }
        this.firstName = givenName;
    }
}