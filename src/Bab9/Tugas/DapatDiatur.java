package Bab9.Tugas;

public interface DapatDiatur {
    void aturNilai(int nilai);
    int getNilai();

    default void reset() {
        aturNilai(0);
    }
}

