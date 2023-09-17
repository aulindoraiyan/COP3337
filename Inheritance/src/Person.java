public class Person {
    private String name;

    public Person(){
        this("No name");
    }
    public Person(String name){
        setName(name);
    }
    public Person(Person other){
        this(other.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Enter a valid name please");
            System.exit(0);
        }
        this.name = name;
    }
    public String toString(){
        return getName();
    }
    public boolean equals(Person other){
        return (getName().equals(other.name));
    }
}
