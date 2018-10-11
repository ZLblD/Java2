
class MyArrayDataException extends NumberFormatException {
    int i,j;

    public MyArrayDataException(int i, int j) {
        super("Ошибка в ячейке " + i + "х" + j);
        this.i = i;
        this.j = j;
    }
}
