public class InheritanceClass3{
    public String firstname, lastname;

    public InheritanceClass3(){
        firstname = "Bob";
        lastname = "Wood";
    }

    public InheritanceClass3(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public void setName(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString(){
        return firstname + " " + lastname;
    }

    public void printReverse(){
        System.out.println(lastname + "," + firstname);
    }

    public void printRegular(){
        System.out.println(this.toString());
    }

    public boolean equals(Object ob){
        if(ob instanceof InheritanceClass3){
            InheritanceClass3 person = (InheritanceClass3)ob;
            return (person.getFirstName().equals(this.firstname) && person.getLastName().equals(this.lastname));
        }
        return false;
    }

    public InheritanceClass3 getCopy(){
        return new InheritanceClass3(firstname, lastname);
    }

    public void copy(InheritanceClass3 person){
        this.firstname = person.getFirstName();
        this.lastname = person.getLastName();
    }
}