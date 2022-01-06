package day13.inherit;
// 상속 키워드 extends
public class Hunter extends Player{


    public int arrowCount;

    public Hunter() {
    }

    public Hunter(String name) {
        super(name);
        System.out.println("Huneter 객체 생성!");
        this.arrowCount = 100;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("# 화살: "+ arrowCount);

    }
    public void frozenShot() {

    }
}
