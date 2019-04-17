public class Main {

    // https://stackoverflow.com/questions/7091003/show-system-out-println-output-with-another-color
    // https://en.wikipedia.org/wiki/ANSI_escape_code

    public static void main(String[] args) {
        System.out.println("\033[0m BLACK");
        System.out.println("\033[31m RED");
        System.out.println("\033[32m GREEN");
        System.out.println("\033[33m YELLOW");
    }
}
