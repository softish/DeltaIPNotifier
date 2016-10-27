/**
 * Created by softish on 2016-10-27.
 */
public class DeltaManager extends Thread {

    private final static int INTERVAL = 60 * 60 * 1000;
    private String ip;

    public void run() {
        Checker checker = new Checker();
        Notifier notifier = new Notifier();

        while (true) {
            String newIp = checker.getIP();
            if(ipHasChanged(newIp)) {
                ip = newIp;
                //notifier.send();
            }
            try {
                sleep(INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean ipHasChanged(String newIp) {
        return !ip.equals(newIp);
    }
}
