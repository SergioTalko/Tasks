public class MakeMiddle {
    public int[] makeMiddle(int[] array) {
        if (array.length % 2 != 0) {
            System.err.println("Array of integers not of even length");
            return null;
        }
        int half = array.length / 2;
        int[] middle = new int[2];
        middle[0] = array[half - 1];
        middle[1] = array[half];
        return middle;
    }
}
