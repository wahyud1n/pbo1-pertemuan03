package operator;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs    :\"Terima kasih pak\"");
                System.out.println("Dosen  :\"Selamat ya\"");
                break;
            case 'B':
                System.out.println("Mhs    :\"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen  :\"hah kada kedangaran\"");
                break;
            case 'C':
                System.out.println("Mhs    :\"ulun turun pul pak ae, tugas pul jua pak ae\"");
                System.out.println("Dosen  :\"tapi menjawab ujian bisa lah?\"");
                System.out.println("Mhs    :\"Hihihi Tekurihing\"");
                break;
            default:
                System.out.println("Mhs    :\"ulun turun pul pak ae, tugas pul jua pak ae\"");
                System.out.println("Dosen  :\"Bujur jua kah\"");
                System.out.println("Mhs    :\"Tapi boong hahaha begaya pak ae\"");
                break;
        }
    }
}
