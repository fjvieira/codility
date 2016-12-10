package exercise;

public class BinaryGap2 {

    public static void main(String[] args) {
        assert 1 == solution(5);
        assert 0 == solution(6);
        assert 2 == solution(9);
        assert 1 == solution(20);
        assert 2 == solution(328);
        assert 4 == solution(529);
        assert 0 == solution(1024);
        assert 5 == solution(1041);

    }

    public static int solution(int n) {
        int nGap = 0;
        int nCurrentGap = -1;

        int div = n;

        int rest = 0;
        int lastRest = 0;

        do {

            rest = div % 2;

            div = div / 2;

            if (lastRest == 1 && rest == 0) {
                nCurrentGap = 0;
            }
            
            if(nCurrentGap >= 0 && rest == 0){
                nCurrentGap++;
            }
            
            if (nCurrentGap >= 0 && rest == 1) {
                if (nCurrentGap > nGap ) {
                    nGap = nCurrentGap;
                }
                nCurrentGap = -1;
            }
            lastRest = rest;
        } while (div >= 2);

        if (div == 1 && nCurrentGap >= 0) {
            if (nCurrentGap > nGap ) {
                nGap = nCurrentGap;
            }
        }

        System.out.printf("%d: %d\n", n, nGap);

        return nGap;
    }

}
