
/**
 * FLV 视频格式
 */
public class FlvVedio implements Vedio {
    @Override
    public Vedio openVedio() {
        System.out.println("打开 FLV 格式视频");
        return new FlvVedio();
    }

    @Override
    public void showVedio() {
        System.out.println("当前视频格式是 FLV");
    }
}
