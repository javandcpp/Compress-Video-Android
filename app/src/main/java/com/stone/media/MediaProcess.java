package com.stone.media;

import android.provider.MediaStore;
import android.util.Log;

public final class MediaProcess {

    static {
        System.loadLibrary("coremedia");
    }

    private static VideoCompress videoCompress;

    private MediaProcess() {

    }



    private static MediaProcess mInstance = null;

    public static MediaProcess getMediaProcess() {
        if (null == mInstance) {
            synchronized (MediaProcess.class) {
                if (null == mInstance) {
                    videoCompress = new VideoCompress();
                    return (mInstance = new MediaProcess());
                }
            }
        }
        return mInstance;
    }

    public VideoCompress getVideoCompress(){
        return videoCompress;
    }




}
