import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Priorityqueue taskManager = new Priorityqueue();

        System.out.println("Masukkan Tugas Dengan Format: Prioritas, Deskripsi Tugas.");
        System.out.println("Akhiri dengan CTRL+Z (Windows)");

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.trim().isEmpty())
                continue;
            String[] parts = input.split(", ");
            if (parts.length == 2) {
                try {
                    int deadline = Integer.parseInt(parts[0]);
                    String task = parts[1];
                    taskManager.addTask(deadline, task);
                } catch (NumberFormatException e) {
                    System.out.println("Format Tidak Valid. Pastikan Input Adalah Angka.");
                }
            } else {
                System.out.println("Format Tidak Valid. Gunakan Format: Prioritas, Deskripsi Tugas.");
            }
        }

        sc.close();

        System.out.println("Input selesai. Berikut adalah daftar task sesuai urutan deadline:");
        taskManager.printTasks();

        // Menunjukkan task terdekat yang harus diselesaikan dan task berikutnya
        taskManager.printAndRemoveClosestTask();
    }
}
