public class Task1 {

    public static int[] task1(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == 4) {
                int[] outArray = new int[arr.length -1 - i];
                int k=0;
                for (int j = i+1; j < arr.length; j++) {
                    outArray[k] = arr[j];
                    System.out.print(outArray[k] + " ");
                    k++;
                }
                return outArray;
            }
        }
        throw new RuntimeException("4 not found");
    }
}
