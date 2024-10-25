package lab3.sort;

public class LabSorter {
    /**
     * Метод для сортировки массива целых чисел.
     *
     * @param source исходный массив для сортировки.
     * @return отсортированный массив
     */
        public int[] sort(int[] source) {
        int length = source.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            swapper(source, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int tmp = source[0];
            source[0] = source[i];
            source[i] = tmp;
            swapper(source, i, 0);
        }

        return source;

    }


    private void swapper(int[] list, int listLength, int enterPoint) {
        int biggest = enterPoint;
        int left = 2*enterPoint + 1;
        int right = 2*enterPoint + 2;

        if (left < listLength && list[left] > list[biggest]){
            biggest = left;
        }
        if (right < listLength && list[right] > list[biggest]){
            biggest = right;
        }

        if (biggest != enterPoint) {
            int tmp = list[enterPoint];
            list[enterPoint] = list[biggest];
            list[biggest] = tmp;
            swapper(list, listLength, biggest);
        }

    }

}
