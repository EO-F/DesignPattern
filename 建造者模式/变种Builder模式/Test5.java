package 变种Builder模式;

public class Test5 {
    public static void main(String[] args) {

        OldPerson oldPerson = new OldPerson();
        oldPerson.setName("张三");
        oldPerson.setShoes("");

        Person person = new Person.Builder("张三","男")
                .age("12")
                .money("1000000")
                .car("宝马")
                .build();

    }
}
