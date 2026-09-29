public class NumbersAlgos {


    public static void main(String[] args) {

        int[] numbers = {4, 13, 43, 23, 65, 68, 453, 0, 123, -1234, 2, 3, 7};

        int smallestNumber = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < smallestNumber){
                smallestNumber = numbers[i];
            }
        }

        System.out.println("The smallest number is: " + smallestNumber);

    }
}
