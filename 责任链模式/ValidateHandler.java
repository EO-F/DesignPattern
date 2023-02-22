public class ValidateHandler extends Handler {
    
    public void doHandler(Member member) {
        if ((member.getLoginName()) != "" ||
                (member.getLoginPass()) != "") {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        if (next != null) {
            next.doHandler(member);
        }
    }
    
}
