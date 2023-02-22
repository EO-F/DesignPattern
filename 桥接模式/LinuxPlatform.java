
public class LinuxPlatform extends Platform {
    public LinuxPlatform(Vedio account) {
        super(account);
    }

    @Override
    Vedio openVedio() {
        System.out.println("在 Linux 平台播放视频");
        return account;
    }
}
