package android.util;

public class Log {

    /**
     * Method to debug
     * @param tag
     * @param msg
     */
    public static void d(String tag, String msg) {
        System.out.println(tag + " : " + msg);
    }

    public static void e(String tag, String msg) {
        System.err.println(tag + " : " + msg);
    }

    public static void i(String tag, String msg) {
        System.out.println(tag + " : " + msg);
    }

}
