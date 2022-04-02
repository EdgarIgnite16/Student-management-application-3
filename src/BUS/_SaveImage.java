package BUS;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class _SaveImage {
    // cho phép chỉnh sửa kích thước của ảnh
    public static Image resize(Image originalImage, int width, int height) {
        return originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    // chuyển hình ảnh thành các byte
    public static byte[] toByteArray(Image img, String type) throws Exception{
        BufferedImage bImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bImage.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bImage, type, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    // chuyển mảng bytes về img => hiển thị trên GUI
    public static Image createImageFromByteArray(byte[] data) throws Exception{
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        BufferedImage bImage = ImageIO.read(byteArrayInputStream);
        return bImage.getScaledInstance(bImage.getWidth(), bImage.getHeight(), Image.SCALE_SMOOTH);
    }
}
