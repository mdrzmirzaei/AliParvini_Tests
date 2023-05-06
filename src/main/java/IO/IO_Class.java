package IO;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class IO_Class {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        //read bytes from Keyboard!!!!
        //readByt(System.in);

        // read bytes form Files!!!!!
        //readByt(new FileInputStream("C:\\Users\\Mirza\\Desktop\\national code.sql"));

        //read bytes from URL!!!!!
        //readByt(new URL("https://www.bing.com/").openStream());

        //  copyFile();

        // copyBlockFile();

        //copyBufferedFile();

        //copyBufferedFilewithsize();

        //copyFileChannel();

        copyFiles();
    }

    static void readByt(InputStream in) throws IOException {
        int d;
        while ((d = in.read()) != -1) {
            System.out.printf("%c", d);
        }
    }

    static void copyFile() throws FileNotFoundException, IOException {

        InputStream is = new FileInputStream("C:\\Users\\Mirza\\Desktop\\piremard.mp4");
        OutputStream os = new FileOutputStream("C:\\Users\\Mirza\\Desktop\\piremard_new_1.mp4");

        long before = System.currentTimeMillis();

        try {
            int c = 0;
            while ((c = is.read()) != -1)
                os.write(c);

            long after = System.currentTimeMillis();

            System.out.println("file is copied....   Duration is " + (after - before));
        } finally {
            is.close();
            os.close();
        }
    }

    static void copyBlockFile() throws FileNotFoundException, IOException {

        InputStream is = new FileInputStream("C:\\Users\\Mirza\\Desktop\\piremard.mp4");
        OutputStream os = new FileOutputStream("C:\\Users\\Mirza\\Desktop\\piremard_new.mp4");

        long before = System.currentTimeMillis();
        byte[] block = new byte[8 * 1024]; //8k
        try {
            int length = 0;
            while ((length = is.read(block)) != -1)
                os.write(block, 0, length);


            long after = System.currentTimeMillis();
            System.out.println("block of file is copied....   Duration is " + (after - before));
        } finally {
            is.close();
            os.close();
        }

    }


    static void copyBufferedFile() throws FileNotFoundException, IOException {

        InputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\Mirza\\Desktop\\piremard.mp4")); //8k
        OutputStream os = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Mirza\\Desktop\\Buffered_piremard.mp4")); //8k

        long before = System.currentTimeMillis();

        try {
            int c = 0;
            while ((c = is.read()) != -1)
                os.write(c);


            long after = System.currentTimeMillis();
            System.out.println("block of file is copied....   Duration is " + (after - before));
        } finally {
            is.close();
            os.close();
        }

    }

    static void copyBufferedFilewithsize() throws FileNotFoundException, IOException {

        InputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\Mirza\\Desktop\\piremard.mp4"), 16 * 1024); //8k
        OutputStream os = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Mirza\\Desktop\\Size_Buffered_piremard.mp4"), 16 * 1024); //8k

        long before = System.currentTimeMillis();

        try {
            int c = 0;
            while ((c = is.read()) != -1)
                os.write(c);


            long after = System.currentTimeMillis();
            System.out.println("block of file is copied....   Duration is " + (after - before));
        } finally {
            is.close();
            os.close();
        }

    }

    static void copyFileChannel() throws FileNotFoundException, IOException {

        FileInputStream is = new FileInputStream("C:\\Users\\Mirza\\Desktop\\piremard.mp4");
        FileOutputStream os = new FileOutputStream("C:\\Users\\Mirza\\Desktop\\File_Channel_piremard.mp4");


        long before = System.currentTimeMillis();

        FileChannel s = is.getChannel();
        FileChannel d = os.getChannel();

        try {
            s.transferTo(0, s.size(), d);

            long after = System.currentTimeMillis();
            System.out.println("block of file is copied....   Duration is " + (after - before));
        } finally {
            s.close();
            d.close();
        }

    }


    static void copyFiles() throws FileNotFoundException, IOException {

        long before = System.currentTimeMillis();

        Files.copy(new File("C:\\Users\\Mirza\\Desktop\\piremard.mp4").toPath(), new File("C:\\Users\\Mirza\\Desktop\\API_Files_piremard.mp4").toPath());

        long after = System.currentTimeMillis();
        System.out.println("block of file is copied....   Duration is " + (after - before));

    }


}
