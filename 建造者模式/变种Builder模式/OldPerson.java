package 变种Builder模式;

public class OldPerson {
    /*名字（必须）*/
    private String name;
    /*性别（必须）*/
    private String gender;
    /*年龄（非必须）*/
    private String age;
    /*鞋子（非必须）*/
    private String shoes;
    /*衣服（非必须）*/
    private String clothes;
    /*钱（非必须）*/
    private String money;
    /*房子（非必须）*/
    private String house;
    /*汽车（非必须）*/
    private String car;
    /*职业（非必须）*/
    private String career;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

}