
public class Test7 {
    public static void main(String[] args) {
        // 在 Linux 平台打开 FLV 视频
        Platform linuxPlatform = new LinuxPlatform(new FlvVedio());
        Vedio linuxFlv = linuxPlatform.openVedio();
        linuxFlv.showVedio();

        System.out.println();

        // 在 Android 平台打开 MP4 视频
        Platform androidPlatform = new AndroidPlatform(new MP4Vedio());
        Vedio androidMp4 = androidPlatform.openVedio();
        androidMp4.showVedio();
    }
}
