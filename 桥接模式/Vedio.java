
public interface Vedio {
    /**
     * 打开视频
     *      可以打开 MP4 / FLV 格式视频
     *      视频 ( 格式 ) 是个 抽象
     * @return
     */
    Vedio openVedio();

    /**
     * 查看视频信息
     */
    void showVedio();
}
