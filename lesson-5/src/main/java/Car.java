public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.startWaiter.countDown();
            MainClass.waiter.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            if (race.getStages().get(i).getClass().getName().equals("Tunnel")){
                try {
                    MainClass.smp.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                race.getStages().get(i).go(this);
                MainClass.smp.release();
            }
            else race.getStages().get(i).go(this);
            if(i == race.getStages().size() - 1) MainClass.finishWaiter.countDown();
        }
    }
}