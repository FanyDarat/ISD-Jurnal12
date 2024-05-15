public class Data implements Comparable<Data> {
    int priorotas;
    String tugas;

    public Data(int prirotas, String tugas) {
        this.priorotas = prirotas;
        this.tugas = tugas;
    }

    @Override
    public int compareTo(Data t) {
        return this.priorotas - t.priorotas;
    }

    public int getPrirotas() {
        return priorotas;
    }

    public String getTugas() {
        return tugas;
    }

}
