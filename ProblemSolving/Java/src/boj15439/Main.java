package boj15439;

class Main {

    public static void main(String[] args) throws Exception {
        int N = read();
        System.out.println(N * (N - 1));
    }

    static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

}
