
public class AndroidPlatform extends Platform {
    public AndroidPlatform(Vedio account) {
        super(account);
    }

    @Override
    Vedio openVedio() {
        System.out.println("在 Android 平台打开视频");
        return account;
    }
}
