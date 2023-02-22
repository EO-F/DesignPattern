
import java.util.HashSet;
import java.util.Set;

public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Content bus = new Content();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}
//抽象表达式类
interface IExpression
{
    public boolean interpret(String info);
}
//终结符表达式类
class TerminalExp implements IExpression{

    private Set<String> set = new HashSet<>();

    public TerminalExp(String[] data) {
        for (int i = 0; i < data.length; i++){
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        if (set.contains(info)){
            return true;
        }
        return false;
    }
}
//非终结符表达式类
class AndExpression implements IExpression{

    private IExpression city = null;
    private IExpression person = null;

    public AndExpression(IExpression city, IExpression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}

//环境类
class Content{
    private String[] cities = {"韶关","广州"};
    private String[] persons = {"老人","妇女","儿童"};
    private IExpression cityPerson;

    public Content() {
        IExpression city = new TerminalExp(cities);
        IExpression person = new TerminalExp(persons);
        cityPerson = new AndExpression(city,person);
    }

    public void freeRide(String info){
        boolean ok = cityPerson.interpret(info);
        if (ok){
            System.out.println("您是"+info+",您本次乘车免费!");
        }else {
            System.out.println(info+",您不是免费人员,本次乘车扣费2元!");
        }
    }
}
