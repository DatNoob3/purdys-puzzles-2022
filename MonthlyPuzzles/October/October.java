public class October
{
    public static void main(String[] args)
    {
        String pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831";
        int total = 0;
        for (int i=0; i<pi.length(); i++) {
            int add = Integer.parseInt(pi.substring(i, i+1));
            total += add;
            if (total == 998) {
                int days = i + 1;
                System.out.println("After " + days + " days");
            }
        }
    }
}

// After 221 days