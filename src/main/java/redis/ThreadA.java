package redis;

/**
 * Created by chunchen.meng on 2019/3/12.
 */
public class ThreadA  extends Thread{

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.seckill();
    }
}
