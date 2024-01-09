import java.util.Stack;

public class ExamReview {
    public static void main(String[] args) {
        Stack s = new Stack();
//
//        int arr[] = {1, 2, 3, 4, 5, 6};
//        for(int i = 0; i < arr.length; i++){
//            i+= 2;
//            s.push(arr[i]);
//        }
//        while(!s.empty())
//            System.out.println(s.pop());
//
        for(int i = 0; i < 10; i++){
            s.push(i);
        }
        for(int i = 0; i < s.size(); i++){
            s.pop();
            System.out.println(s.peek());
        }

    }
}
