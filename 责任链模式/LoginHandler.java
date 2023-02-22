public class LoginHandler extends Handler {
   public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if (next != null) {
            next.doHandler(member);
        }
    }
}
