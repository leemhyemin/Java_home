package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {

    public static void main(String[] args) {

        MemberController mc = new MemberController();
        mc.insertMember("ggg", "고길동", "1234", "zzz", 'M', 33);

//        Member[] members = mc.printAll();
//        for (Member m : members) {
//            if (m == null) break;
//            System.out.println(m.inform());
//        }
//        Member[] members = mc.searchName("고길동");
//        for (Member m : members) {
//            System.out.println(m.inform());
//        }
        mc.delete("gfi");
        mc.delete("def");

        Member[] members = mc.printAll();
        for (Member m : members) {
            if (m == null) break;
            System.out.println(m.inform());
        }

    }
}
