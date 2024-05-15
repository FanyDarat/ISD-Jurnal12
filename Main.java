import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Priorityqueue taskManager = new Priorityqueue();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Pilih Opsi");
            System.out.println("1. Input Tugas");
            System.out.println("2. Cetak Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            int opsi = sc.nextInt();
            sc.nextLine();
            switch (opsi) {
                case 1:
                    System.out.println("Masukkan Dengan Input Seperti prioritas(angka), deskripsi Tugas");
                    String input = sc.nextLine();
                    if (input.trim().isEmpty())
                        continue;
                    String[] parts = input.split(", ");
                    if (parts.length == 2) {
                        try {
                            int deadline = Integer.parseInt(parts[0]);
                            String task = parts[1];
                            taskManager.addTask(deadline, task);
                            System.out.println("Data Telah Masuk");
                            System.out.println();
                        } catch (NumberFormatException e) {
                            System.out.println("Format input tidak valid. Pastikan deadline adalah angka.");
                        }
                    } else {
                        System.out.println("Format input tidak valid. Gunakan format: deadline, deskripsi task.");
                    }
                    break;
                case 2:
                    taskManager.printTask();
                    break;
                case 3:
                    taskManager.removeTask();
                case 4:
                    break;
                default:
                    System.out.println("Input Salah");
                    break;
            }
        }
    }
}
