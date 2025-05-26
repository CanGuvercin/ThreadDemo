package eu.guvercin;

public class MyTask implements Runnable{

    private String name;

    public MyTask (String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(name + " - step " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(name + " interrupted.");
            }
        }
    }
}
