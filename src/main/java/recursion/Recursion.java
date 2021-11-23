package recursion;

public class Recursion {

    public static void main(String[] args) {

        int result=fibbonacci(4);
        System.out.println(result);

    }



    static int powerOfTwo(int n){
        if(n==0){
            return 1;
        }else{
            var power=2*powerOfTwo(n-1);
            return power;
        }
    }


    static int factorial(int n){
        if(n==1){
            return 1;
        }else {
            int fact=n*factorial(n-1);
            return fact;
        }
    }

    static int fibbonacci(int n){

        if(n<0){
            return -1;
        }

        if(n==0||n==1){


            return n;
        }

        return fibbonacci(n-1)+fibbonacci(n-2);



    }





    static void recursiveMethod(int n){
        if(n<1){
            System.out.println("the value is less than 1");
        }else{
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
}
