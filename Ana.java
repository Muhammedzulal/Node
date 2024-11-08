package Node;

public class Ana {
    public static void main(String[] args) {
        // Nesneler
        Sinif A = new Sinif();
        Sinif B = new Sinif();
        Sinif C = new Sinif();

        A.number = 11;
        B.number = 22;
        C.number = 33;

        // Düğümleri birbirine bağlama
        A.next = B;
        B.next = C;
        C.next = null;

        Sinif temp = A;
        // Düğümleri dolaştık
        while (temp != null) {
            System.out.println(temp.number);
            temp = temp.next;
        }

    }
}
