import java.util.ArrayList;
public class InputNumber {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        System.out.println("Cac phan tu co trong arr la : ");
        for (int number:arr) {
            System.out.print( number+ " ");
        }
        System.out.println("");
        arr.add(3,666888    );
        System.out.println("Cac phan tu co trong arr sau khi them");
        for (int number : arr) {
            System.out.print(number+" ");
        }
    }
}


