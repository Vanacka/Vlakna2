public class Pismomalir extends Thread {

    String napis;

    public Pismomalir(String napis) {
        this.napis = napis;
    }
    @Override
    public void run() {
        for(char ch : napis.toCharArray()) {
            System.out.println(ch);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Pismomalir p1 = new Pismomalir("Zmrde");
        Pismomalir p2 = new Pismomalir("Curomrde");
        Pismomalir p3 = new Pismomalir("Ty Klacku");

        System.out.println("startuji p1");
        p1.start();
        System.out.println("startuji p2");
        p2.start();
        System.out.println("startuji p3");
        p3.start();
        System.out.println("Hotovo ty mrdko!!!!!!!!!!!!!");

    }
}

