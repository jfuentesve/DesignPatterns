package org.jfuentes.design.pattern.io.decorator;

import java.io.*;

/**
 * Created by jfuentes on 4/20/14.
 */
public class InputTest {
    public static void main (String[] args) throws IOException{

        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("Decorator/test.txt")));
            while((c = in.read()) >=0){
                System.out.print((char)c);

            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
