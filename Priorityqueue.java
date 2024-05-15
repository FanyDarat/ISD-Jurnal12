import java.util.PriorityQueue;

public class Priorityqueue {
    private PriorityQueue<Data> qwerty;

    public Priorityqueue() {
        qwerty = new PriorityQueue<>();
    }

    public void addTask(int deadline, String task) {
        qwerty.add(new Data(deadline, task));
    }

    public void printTask() {
        if (qwerty.isEmpty()) {
            System.out.println("Tidak Ada Tugas");
        } else {
            System.out.println("Daftar Tugas:");
            for (Data data : qwerty) {
                System.out.printf(" - Prioritas: %d, Tugas: %s\n", data.priorotas, data.tugas);
            }
        }
    }

    public void removeTask() {
        if (qwerty.isEmpty()) {
            System.out.println("Tugas tidak ada");
            return;
        }

        Data removedData = qwerty.poll();

        System.out.printf("Tugas %s sudah selesai. ", removedData.tugas);

        if (!qwerty.isEmpty()) {
            System.out.printf("Selanjutnya tugas %s.\n", qwerty.peek().tugas);
            return;
        }

        System.out.println("Tidak ada tugas lagi");
    }
}
