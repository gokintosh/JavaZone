package stack.array;

public class Stack {

    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr=new int[size];
        this.topOfStack=-1;
        System.out.println("The stack is created with size of : "+size);
    }

}
