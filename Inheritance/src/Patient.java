public class Patient extends Person{
    private Doctor docName;
    public Patient(){
        this("No name for Patient", "No doctor's name");
    }
    public Patient(String name, Doctor docName){
        super(name);
        setDocName(docName);
    }
    public Patient(Patient other){
        super(other);
        setDocName(other.docName);
    }

    public Doctor getDocName() {
        return docName;
    }

    public void setDocName(Doctor docName) {
        if(docName == null){
            System.out.println("Enter valid Doctor's name");
            System.exit(0);
        }
        this.docName = docName;
    }
    public String toString(){
        return ("*Patient's Information" + "\n" +
                "The name is: " + getName() + ", Primary doctor is: " + getDocName()
        );
    }
    public Boolean equals(Patient other){
        return (getName().equals(other.getName()) && getDocName().equals(other.getDocName()));
    }
}
