import java.util.PriorityQueue;

public class Priorityqueue {
    private PriorityQueue<Data> qwerty;

    public Priorityqueue() {
        qwerty = new PriorityQueue<>();
    }

    public void addTask(int deadline, String task) {
        qwerty.add(new Data(deadline, task));
    }

    public Data getNextTask() {
        return qwerty.peek();
    }

    public Data removeNextTask() {
        return qwerty.poll();
    }

    public boolean hasTasks() {
        return !qwerty.isEmpty();
    }

    public void printTasks() {
        while (hasTasks()) {
            Data t = removeNextTask();
            System.out.println("Prioritas: " + t.getPrirotas() + ", Tugas: " + t.getTugas());
        }
    }

    public void printAndRemoveClosestTask() {
        if (!hasTasks()) {
            System.out.println("Tidak Ada Tugas Lagi.");
            return;
        }

        Data closestTask = getNextTask();
        System.out.println("Tugas Terdekat Yang Harus Diselesaikan: " + closestTask.getTugas());
        removeNextTask();

        if (hasTasks()) {
            Data nextTask = getNextTask();
            System.out.println("Ketika task " + closestTask.getTugas() + " dihapus:");
            System.out.println(closestTask.getTugas() + " selesai dilaksanakan, berikutnya " + nextTask.getTugas());
        } else {
            System.out.println("Ketika task " + closestTask.getTugas() + " Dihapus:");
            System.out.println(closestTask.getTugas() + " Sudah Selesai Dikerjakan, Tidak Ada Tugas Lainnya.");
        }
    }
}
