package com.cs425;

public class ArrayReversor {
    private ArrayFlattener arrayFlattener;

    public ArrayReversor(ArrayFlattener arrayFlattener) {
        this.arrayFlattener = arrayFlattener;
    }

    public int[] reverseArray(int[][] array){
        if(array == null)throw new NullPointerException();
        var flat = arrayFlattener.flattenArray(array);
        for(int i = 0, j = flat.length - 1; i < j; i++, j--){
            int temp = flat[i];
            flat[i] = flat[j];
            flat[j] = temp;
        }
        return flat;
    }
}
