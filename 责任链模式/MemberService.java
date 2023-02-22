public class MemberService {

    public void login(String loginName, String loginPass) {
/*        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        Member member = new Member(loginName, loginPass);

        //  validate -> login -> auth
        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(member);*/

        Handler.Builder builder = new Handler.Builder();

        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        builder.build().doHandler(new Member(loginName, loginPass));

/*          auth -> login -> validate
        authHandler.next(loginHandler);
        loginHandler.next(validateHandler);
        member.setRoleName("管理员");
        authHandler.doHandler(member);*/
    }

}
