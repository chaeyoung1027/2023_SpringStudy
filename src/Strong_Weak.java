import java.util.Date;

public class Strong_Weak {
    public static void main(String[] args) {
        Date date = new Date(); //강한결합
        System.out.println("date1:"+date);
    }

    public static void getDate(Date d) {
        Date d2 =d; //약한결합
        System.out.println("date2:"+d2);
    }
    public static void MemberUse1(){
        Member m1 = new Member();   //강한결합
    }
    public static void MemberUse2(Member m){
        Member m2 = m;  //약한결합  //느슨하다. -> 스프링: 인터페이스 사용
    }
}
class Member{
    String name;
    String nickName;
    public Member(){};
}

//Cat c = new cat();
//Animal c2 = new dog();
//부모의 참조변수로 자식객체를 생성한다.
//->좋은점 : dog 만 바꾸면 됨.