import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int[] numbersPrimitive = new int[5];
        Integer[] numbersWrapper =new Integer[5];

        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;
        //Si quiero agregar una posición más o varias
        int[] newNumbersPrimitive = new int[numbersPrimitive.length + 1];
        System.arraycopy(numbersPrimitive, 0, newNumbersPrimitive, 0, numbersPrimitive.length);
        newNumbersPrimitive[5] =  500;

        numbersWrapper[0] = 10;
        numbersWrapper[1] = 20;

        for(int number: numbersPrimitive) {
            System.out.println(number);
        }

        for(Integer number: numbersWrapper) {
            System.out.println(number);
        }

        for(int number: newNumbersPrimitive){
            System.out.println(number);
        }

    }
}
