public class MainTestThrd {

    public static void main(String[] args) {
        System.out.println("Start");
        mass();
        System.out.println();
        System.out.print("");
        massThrd();

    }

    static void massThrd() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] arrThrd1 = new float[h];
        float[] arrThrd2 = new float[h];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long before = System.currentTimeMillis();
        System.arraycopy(arr, 0, arrThrd1, 0, h);
        System.arraycopy(arr, h, arrThrd2, 0, h);

        new Thread(()-> method1(arrThrd1)).start();  // первый поток
        new Thread(() -> method2(arrThrd2)).start(); // второй поток

        try {
            new Thread(()-> method1(arrThrd1)).join();
            new Thread(() -> method2(arrThrd2)).join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(arrThrd1, 0, arr, 0, h);
        System.arraycopy(arrThrd2, 0, arr, h, h);

        long after = System.currentTimeMillis();
        long diff = after - before;

        System.out.println("Время выполнение с помощью потока " + diff + " ms");
    }

    static void method2(float[] arrThrd2) {
        for (int i = 0; i < arrThrd2.length; i++) {
            arrThrd2[i] = (float) (arrThrd2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    static void method1(float[] arrThrd1) {
        for (int i = 0; i < arrThrd1.length; i++) {
            arrThrd1[i] = (float) (arrThrd1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    static void mass() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long before = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long after = System.currentTimeMillis();
        long diff = after - before;
        System.out.println("Время выполнения целого массива " + diff + " ms");
    }
}

