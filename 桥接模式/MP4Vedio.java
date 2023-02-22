
/**
 * MP4 格式
 */
public class MP4Vedio implements Vedio {
    @Override
    public Vedio openVedio() {
        System.out.println("打开 MP4 格式视频");
        return new MP4Vedio();
    }

    @Override
    public void showVedio() {
        System.out.println("当前视频格式是 MP4");
    }
}
