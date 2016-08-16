package com.homlee.utils;

/**
 * Created by homlee on 8/11/2016.
 */
public class MyFilesHelper {

    /**
     * @param context
     * @param fileName
     * @return 返回一个临时文件
     * @throws IOException
     */
    public static File createTempFile(Context context, String fileName)
            throws IOException {
        File file;
        file = File.createTempFile(fileName, null, context.getCacheDir());
        return file;
    }

    public static InputStream getAssetFile(String fileName) {
        AssetManager am = null;
        am = TraderApplication.mTradeApi.mAppContext.getAssets();
        InputStream is = null;
        try {
            is = am.open(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return is;
    }

    public static File downFile(final String downUrl, final String savePath,
                                final String saveName) throws IOException {
        File file = null;
        HttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(downUrl);
        HttpResponse response;
        response = client.execute(get);
        HttpEntity entity = response.getEntity();
        // long length = entity.getContentLength();
        InputStream is = entity.getContent();
        FileOutputStream fileOutputStream = null;
        if (is != null) {
            file = new File(savePath, saveName);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            byte[] b = new byte[1024];
            int charb = -1;
            while ((charb = is.read(b)) != -1) {
                fileOutputStream.write(b, 0, charb);
            }
        }
        fileOutputStream.flush();
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        return file;
    }


}
