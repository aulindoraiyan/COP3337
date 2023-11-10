public class InvalidNumberExceptionPractice extends Exception{
    public InvalidNumberExceptionPractice(){
        super();
    }
    public InvalidNumberExceptionPractice(String msg){
        super(msg);
        System.out.println("Invalid practice number here. ");
    }
}
