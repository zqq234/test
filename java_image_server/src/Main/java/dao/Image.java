package dao;

/**
 * @className Image
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/4 19:55
 * @Version 1.0
 **/
public class Image {
    private int imageId;
    private String imageName;
    private int size;
    private String uploadTime;
    private String contentType;
    private String path;
    private String mad5;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageId=" + imageId +
                ", imageName='" + imageName + '\'' +
                ", size=" + size +
                ", uploadTime='" + uploadTime + '\'' +
                ", contentType='" + contentType + '\'' +
                ", path='" + path + '\'' +
                ", mad5='" + mad5 + '\'' +
                '}';
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMad5() {
        return mad5;
    }

    public void setMad5(String mad5) {
        this.mad5 = mad5;
    }
}
