public class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        super();
    }
    public InvalidNumberException(int i){
        super(String.valueOf(i));
        System.out.println();

    }
}
