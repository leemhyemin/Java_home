package day12.encap;

public class Car {
    // 필드에 프라이빗 제한 이상한모드를 할까봐.
    //메서드를 통해 우회 세텀메서드
    private String model; //모델명
    private int speed; //현재 속도
    private char mode; //변속모드 ( D, N, R, P)
    boolean start; //시동 온오프 상태

    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    //속도값 얻기 //get + 필드명 set + ?
    //getter : private 으로 된 필드값을 참조하기 위한 메서드
    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    //변속 모드 설정기능
    // 매개변수로 설정하고 싶은것
    //setter: 필드가 private 으로 감춰져 있을 때 필드값을 변경 해주는 메서드
    public void setMode(char mode) {
        switch (mode) {
            case 'D': case 'R': case 'N': case 'P':
                System.out.println("변속모드가" + mode + "로 정상 변경됩니다.");
                this.mode = mode;
                break;
            default:
                System.out.println("잘못된 변속 설정입니다. P모드로 자동설정 합니다.");
                this.mode = 'P';
        }
    }

    //가속 기능
    public void accelerator() {
        if (this.mode != 'D') {
            System.out.println("변속 모드를 D로 설정하세요!");
            return;
        }

        if (this.speed >= 200) {
            this.speed = 100;
            System.out.println("과속은 위험합니다");
            return;
        }
        
        this.speed += 50;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n",this.speed);
    }
    //* ECU 맵팅 불법코딩 300마력으로 나온차가 240마력 양카

    //감속기능
    public void slowdown() {
        this.speed -= 30;
        if (this.speed >= 0) this.speed = 0;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n",this.speed);
    }
    // 시동을 거는 기능 (시동버튼을 누름)
    public void enginStart() {
        System.out.println("시동버튼을 눌렀습니다.");
        injectoil();
        injectGasoline();
        this.start = true;
        moveCylinder();
        // 이래야 시동 걸리는걸로.
        // 호출 순서도 조절
        // 캡슐화
    }

    // 연료가 엔진에 분사되는 기능
    private void injectGasoline() {
        System.out.println("연료가 엔진에 주입됩니다.");
    }

    // 엔진 오일이 순환하는 기능
    private void injectoil() {
        System.out.println("엔진 오일이 순환합니다.");
    }

    //실린더가 작동하는 기능
    private void moveCylinder() {
        if (start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("차가 고장났습니다.");
        }
    }
}
