package tv.danmaku.ijk.media.player.services;


import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class IjkFileZipArchive {

    public static boolean unzipIjkFile(String path, String destination, String filename) {
        IjkMediaPlayer.loadLibrariesOnce(IjkMediaPlayer.sLocalLibLoader);
        return unzipFile(path, destination, true, filename);
    }

    public static boolean unzipIjkFile(String path, String destination, boolean overwrite, String filename) {
        IjkMediaPlayer.loadLibrariesOnce(IjkMediaPlayer.sLocalLibLoader);
        return unzipFile(path, destination, overwrite, filename);
    }

    public static native boolean unzipFile(String path, String destination, boolean overwrite, String filename);

}
