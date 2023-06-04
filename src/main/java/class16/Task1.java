package class16;

public class Task1 {

    public int array (int [] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        int result = obj.array(new int []{10,10,10});
        System.out.println(result);
    }

}
