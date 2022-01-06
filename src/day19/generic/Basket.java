package day19.generic;
//<F> <>안에 아무거나 써도됌 의미없음 제네릭타입
//제네릭 클래스
public class Basket<F> {

    private F f;
    
    public void setF(F f) {
        this.f = f;
    }

    public F getF() {
        return f;
    }
}
