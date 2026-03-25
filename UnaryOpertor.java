public class UnaryOpertor {
    public static void main(String[] args){
        int x=5;
        System.out.println("Original:"+x);
        //x++(post increment)
        System.out.println("Post Increment:"+(x++));//5
        System.out.println("After increment:"+x);//6
        System.out.println("pre increment:"+(++x));
        System.out.println("After increment:"+x);
        System.out.println("pre decrement:"+(--x));
        System.out.println("After decrement:"+x);
        System.out.println("post decrement:"+(x--));
        System.out.println("After decrement:"+x);
        

    }
}
