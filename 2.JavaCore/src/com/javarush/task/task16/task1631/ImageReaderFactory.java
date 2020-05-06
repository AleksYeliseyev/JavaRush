package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) {

        ImageReader reader = null;
        if (ImageTypes.JPG.equals(imageTypes)) {
            reader = new JpgReader();
        } else if (ImageTypes.BMP.equals(imageTypes)) {
            reader = new BmpReader();
        } else if (ImageTypes.PNG.equals(imageTypes)) {
            reader = new PngReader();
        } else throw new IllegalArgumentException();

        return reader;
    }
}
