public class Test{

    public static void main(String[] args){
        int test[] = new int[5];
        for(int i = 0; i < test.length; i++){
            test[i] = i;
            System.out.print(test[i] + " ");
        }
        System.out.println();
        int len = test.length;
        System.out.println(len);
    }
}