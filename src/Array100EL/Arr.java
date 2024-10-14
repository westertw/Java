package Array100EL;

public class Arr {
    int[] array = new int[10];
    int size;


    public Arr() {

        size = array.length;

        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
    }

    public void Conclusion() {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
    public void delete(int del) {
        for (int i = 0; i < size; i++) {
            if (array[i] == del) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = 0;
                size--;
                return;
            }
        }
    }
}
