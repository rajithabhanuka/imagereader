package com.java.imagereader.img;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ImageCracker {

    public static String crackImage(String filePath) {
        File imageFile = new File(filePath);
        ITesseract instance = new Tesseract();

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/usr/share/tesseract-ocr/4.00/tessdata");

        try {
            String result = tesseract.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }

    public static void main(String[] args) {

        System.out.println(crackImage("/home/bhanuka/Documents/CodeByB/Repos/imagereader/src/main/resources/testImage.PNG"));
    }
}