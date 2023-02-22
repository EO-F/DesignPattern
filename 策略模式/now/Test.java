package now;

public class Test {
    public static void main(String[] args) {
        Role roleA  = new RoleA("A");

        roleA.setIAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setIRunBehavior(new RunJCTQ());

        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
    }
}
