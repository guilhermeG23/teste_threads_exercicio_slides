public class teste4 {


    public static void main(String args[]) {
        
        new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 20000; i++) {
                    System.out.println(i);
                }
            }
        }).start();


        new Thread(new Runnable() {
            public void run() {
                for (int i = 10000; i < 20000; i++) {
                    System.out.println(i);
                }
            }
        }).start();


    }

}