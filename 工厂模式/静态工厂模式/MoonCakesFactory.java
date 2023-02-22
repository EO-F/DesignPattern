package 静态工厂模式;

public class MoonCakesFactory {
//    public static MoonCakes makeMoonCakes(String type){
//        MoonCakes moonCakes = null;
//        switch (type){
//            case "FiveKernel":
//                moonCakes = new FiveKernel();
//                break;
//            case "BeanSand":
//                moonCakes = new BeanSand();
//                break;
//        }
//        return moonCakes;
//    }

    public static <T extends MoonCakes> T makeMoonCakes(Class<T> clz){
        MoonCakes moonCakes = null;
        try{
            moonCakes = (MoonCakes) Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) moonCakes;
    }
}
