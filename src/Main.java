public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Sitde", "POP", "CS64", 100.0f, 116);
        Book book = new Book("Java", "Lap trinh da luong", "T5_12", 35.0f, "KhanhHuyen", 5, "A");

        System.out.println("MP3 Information:");
        mp3.showInfo();

        System.out.println("\nBook Information:");
        book.showInfo();
    }
