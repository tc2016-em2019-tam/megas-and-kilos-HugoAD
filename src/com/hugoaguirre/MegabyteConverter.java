package com.hugoaguirre;

public class MegabyteConverter {

    private int kilobytes = 0;

    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception {
        if (kilobytes <= 0) {
            throw new Exception("Kilobytes must be positive numbers");
        }

        int KKilobytes = kilobytes % 1024;

        if (KKilobytes > 0) {
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + KKilobytes + " KB");
        } else {
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB");
        }
    }

    public MegabyteConverter(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            throw new Exception("Kilobytes must be positive numbers");
        }
        this.kilobytes = kilobytes;
    }

    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception {
        this.kilobytes = kilobytes;
    }
}