/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1.pkg7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Chris
 */
public class Lab_17 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String orgPic = "C:\\temp\\pocahontas.jpg";
        String newPic = "C:\\temp\\newFile2.txt";
        String newerPic = "C:\\temp\\pocahontas2.jpg";

        File oP = new File(orgPic);
        File nP = new File(newPic);
        File nnP = new File(newerPic);

        try {

            FileInputStream fis = new FileInputStream(oP);
            FileOutputStream fos = new FileOutputStream(nP);
            FileOutputStream foss = new FileOutputStream(nnP);

            try {
                int p =(int) fis.read();
                while (p != (int)-1) {
                    fos.write(p);
                    p =(int) fis.read();
                    foss.write(p);
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            } finally {
                fis.close();
                fos.close();
                foss.close();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    
}
