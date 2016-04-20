package com.list;

import java.io.File;
        import java.io.FileInputStream;
        import java.io.InputStream;

/**
 * Created by Shadow on 2016/4/11.
 */
public class OutputStream {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream(new File("c:/1.txt"));
        byte[] b = new byte[1024];
        is.read(b);

    }
}
