

 class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int row, int col){
        super("Массив должен быть 4х4 " + row + "x" + col);
    }
}
