public class Main {
    public static void main(String[] args) {
        int array[] = {1,5,2,6,7,9};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}