package day20.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student{

    String name; // 학생이름
    int grade; //학년

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

}

public class MapExample {

    public static void main(String[] args) {
        //Map은 key, value쌍으로 데이터를 관리 key는 중복불가, value는 중복가능
        Map<String, Student> studnets = new HashMap<>();
        
        //put(k,v) : 맵에 데이터를 추가
        studnets.put("짹짹이",new Student("김철수",3));
        studnets.put("냥냥이",new Student("도우너",5));
        studnets.put("멍멍이",new Student("고길동",1));

        System.out.println(studnets);

        System.out.println(studnets.size());

        // 중복된 key를 넣으면 value가 수정됩니다.
        studnets.put("냥냥이", new Student("홍길동", 6));
        System.out.println(studnets);

        //get(key) : map에 저장된 객체 참조
        Student student = studnets.get("멍멍이");
        System.out.println("student = " + student);
        System.out.println(student.name);

        //.뒤에 있는게 핵심
        int g = studnets.get("냥냥이").grade;
        System.out.println("=====================================================");
        //contatinsKey(key) : map에 해당 key가 존재하는지 유무확인.
        System.out.println(studnets.containsKey("깩깩이"));
        System.out.println(studnets.containsKey("짹짹이"));

        //map의 반복문처리
        Set<String> keySet = studnets.keySet();
        System.out.println("keySet = " + keySet);

        System.out.println("=====================####===================");
        for (String key : keySet) {
            System.out.println(studnets.get(key));
        }

        //remove(key): key에 해당하는 데이터셋(Entry) 삭제
        studnets.remove("냥냥이");
        System.out.println(studnets);

        studnets.clear();
        System.out.println(studnets.isEmpty());
    }
}
