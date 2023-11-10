public class PracticeInvalidNumberException extends Exception{
        public PracticeInvalidNumberException(){
            super("No negative number allowed");
            System.out.println();
        }
        public PracticeInvalidNumberException(String str){
            System.out.println("No negative number allowed and this is paramitized constructor");
        }
}
