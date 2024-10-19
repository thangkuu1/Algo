//package image;
//
//
//import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
//
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.util.Random;
//
//public class CaptchaUtils {
//
//
//    // Defining Character Array you can change accordingly
//    private static final char[] chars = {
//            '1', 'A', 'a', 'B', 'b', 'C', 'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h',
//            'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n', 'O', 'o', '5', 'P', 'p', 'Q',
//            'q', 'R', 'r', 'S', 's', 'T', 't', '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X',
//            'x', 'Y', 'y', 'Z', 'z', '9'
//    };
//
//    private static final Color[] colors = {Color.black, Color.black, Color.BLUE};
//    private static final double[] rotate = {0.1, 0.1, 0.1};
//    private static final double[] weight = {1, -2.4,  4, -3.5 , 3, -5.2 ,2 , 2.1, 1, 5, -6, -4.9, 0.1};
//
//    // Method for generating the Captcha Code
//    public static String generateCaptchaText() {
//
//        String randomStrValue = "";
//
//        final int LENGTH = 6; // Character Length
//
//        StringBuffer sb = new StringBuffer();
//
//        int index = 0;
//
//        for (int i = 0; i < LENGTH; i++) {
//            // Getting Random Number with in range(ie: 60 total character present)
//            index = (int) (Math.random() * (chars.length - 1));
//            sb.append(chars[index]); // Appending the character using StringBuffer
//        }
//
//        randomStrValue = String.valueOf(sb); // Assigning the Generated Password to String variable
//
//        return randomStrValue;
//    }
//
//    // Method used to render the Image for Captcha
//    public static String renderImage(String value) throws Exception {
//        if (value != null && !value.isEmpty()) {
//            byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary("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");
//
//
//            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
//
//            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            Graphics2D g = ge.createGraphics(image);
//            Font font = new Font(Font.SERIF, Font.BOLD, 35);
//            g.setFont(font);
//
//            char[] c = value.toCharArray();
//
//            int x = 0;
//            int y = 45;
//            g.drawLine(120, 50, 360, 50);
//            Random r = new Random();
//            for (int i = 0; i < c.length; i++) {
//                if (i == 0) {
//                    x = x + 20;
//                } else {
//                    x = x + 25;
//                }
//                int lineHeight = g.getFontMetrics().getHeight();
//                g.setColor(colors[(int) (Math.random() * 3)]);
////                g.drawString(String.valueOf(c[i]), x, y += lineHeight );
//
//                // create image character
////                BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imageBytes));
//                BufferedImage bufferedImage = new BufferedImage(10,y,BufferedImage.TYPE_INT_RGB);
//                Graphics2D g_ = ge.createGraphics(bufferedImage);
//                g_.setFont(font);
//                g_.drawString(String.valueOf(c[i]), x,y);
////                g_.rotate(0.5);
//                g_.dispose();
//                g.drawImage(bufferedImage, 0, 0, null);
////                g.drawString(String.valueOf(c[i]), x, y += weight[(int) (Math.random() * weight.length)]);
////                g.rotate(10);
////                g.drawLine(r.nextInt(500), r.nextInt(100), r.nextInt(123), r.nextInt(100));
////                g.drawLine(r.nextInt(400), r.nextInt(100), r.nextInt(234), r.nextInt(100));
////                g.drawLine(r.nextInt(267), r.nextInt(100), r.nextInt(534), r.nextInt(100));
////                g.drawLine(r.nextInt(345), r.nextInt(100), r.nextInt(546), r.nextInt(100));
////                g.drawLine(r.nextInt(789), r.nextInt(100), r.nextInt(657), r.nextInt(100));
////                g.drawLine(r.nextInt(678), r.nextInt(100), r.nextInt(678), r.nextInt(100));
////                g.drawLine(r.nextInt(789), r.nextInt(100), r.nextInt(678), r.nextInt(100));
//                g.fillRoundRect(10, 200, 34,56, 12,10);
//
//            }
//            //
//            g.dispose();
//
//            try {
//                ByteArrayOutputStream os = new ByteArrayOutputStream();
//                ImageIO.write(image, "png", os);
//                return Base64.encode(os.toByteArray());
//            } catch (IOException e) {
//            }
//        }
//        return null;
//    }
//
//    public static BufferedImage redraw(BufferedImage img, Color bg, String character) {
//        BufferedImage rgbImage = new BufferedImage(img.getWidth(),
//                img.getHeight(),
//                BufferedImage.TYPE_3BYTE_BGR);
//        Graphics2D g2d = rgbImage.createGraphics();
//        g2d.drawImage(img, 0, 0, bg, null);
//        g2d.dispose();
//        return rgbImage;
//    }
//
//    public static void main(String[] args) throws Exception {
//
//        StringBuffer sb = new StringBuffer();
//        Random r = new Random();
//        for(int i = 0; i < 5; i++){
//            sb.append(chars[r.nextInt(chars.length - 1)]);
//        }
//        System.out.println(renderImage(sb.toString()));
//    }
//}
