public class NumberGenerator implements Runnable{
    private  String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public NumberGenerator() {
    }

    @Override
    public void run() {
      int number = 10;
        for (int i = 0; i < number; i++) {
            System.out.println(this.name+i);
        }
         try {
             Thread.sleep(500);
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
    }
}
