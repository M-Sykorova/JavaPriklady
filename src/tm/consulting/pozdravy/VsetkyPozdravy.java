package tm.consulting.pozdravy;

import tm.consulting.pozdravy.anglicky.PozdravAnglicky;
import tm.consulting.pozdravy.madarsky.PozdravMadarsky;
import tm.consulting.pozdravy.nemecky.PozdravNemecky;
import tm.consulting.pozdravy.slovensky.PozdravSlovensky;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        PozdravSlovensky.pozdravujem();
        PozdravMadarsky.pozdravujem();
        PozdravNemecky.pozdravujem();
        PozdravAnglicky.pozdravujem();
    }
}
