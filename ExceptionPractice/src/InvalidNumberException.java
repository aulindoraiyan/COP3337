
public class InvalidNumberException extends  Exception{
    public InvalidNumberException(){
        super();

    }
    public InvalidNumberException(String msg){
        super(msg);
        System.out.println("Be careful, it's invalid number!");
    }
}
