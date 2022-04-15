package array.shift;

public class ShiftFromBackThenInsert {

    private boolean insert(int[] array, int x){
        if(array[array.length - 1] != 0 && x <= 0){
            return false;
        }
        int index = array.length - 2;
        while (index > 0 && array[index] > x){
            array[index + 1] = array[index];
            index = index - 1;
        }
        array[index + 1] = x;
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 7, 8, 9};
        ShiftFromBackThenInsert sfti = new ShiftFromBackThenInsert();
        System.out.println(sfti.insert(arr, 6));
    }
}
