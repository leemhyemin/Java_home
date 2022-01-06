package day15.poly.basic;

class Monitor {}
class LGMonitor extends Monitor {}
class HPMonitor extends Monitor {}
// 폭이 좁아지니까 상속처리 하면 폭이 넓어진다.

public class Computer {

    public Monitor monitor;

    public Computer() {
        this.monitor = new HPMonitor();
    }
}
