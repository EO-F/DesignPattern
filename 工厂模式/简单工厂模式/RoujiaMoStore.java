package 简单工厂模式;

public class RoujiaMoStore {

    private SimpleRouJiaMoFactroy factroy;

    public RoujiaMoStore(SimpleRouJiaMoFactroy factroy) {
        this.factroy = factroy;
    }

    public RouJiaMo sellRouJiaMo(String type){
//        RouJiaMo rouJiaMo = null;
//        if (type.equals("Suan"))
//        {
//            rouJiaMo = new SuanRouJiaMo();
//
//        } else if (type.equals("Tian"))
//        {
//            rouJiaMo = new TianRouJiaMo();
//        } else if (type.equals("La"))
//        {
//            rouJiaMo = new LaRouJiaMo();
//        }
        RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
