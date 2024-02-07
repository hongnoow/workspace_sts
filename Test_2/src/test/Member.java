package test;

public class Member {
    String name;
    String id;
    String pw;
    int age;

    void setInfo(String name, String id, String pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    void showInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(pw);
        System.out.println(age);
    }

    boolean isLogin(String id, String pw) {
        String login = "";
        boolean canLogin = true;
        if (id.equals(this.id) && pw.equals(this.pw)) {
            System.out.println("로그인 가능");
        }
        else{
            System.out.println("로그인 불가능");
            canLogin = false;
        }
        return canLogin;
    }
}
