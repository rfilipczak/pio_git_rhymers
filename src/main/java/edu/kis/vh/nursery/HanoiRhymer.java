package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}

// Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
// Odp: 5,7-9,11-17

//    Zweryfikuj działanie kombinacji klawiszy alt + ← oraz alt + →. Komentarz na ten temat zamieść w
//        ostatnio edytowanym pliku (automatyczna generacja komentarza na zaznaczeniu ctrl+/).
// Odp: U mnie na moim IDE ta kombinacja klawiszy to przelaczanie miedzy otwartymi plikami.
