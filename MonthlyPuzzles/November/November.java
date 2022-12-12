public class November {
    public static boolean isPrime(int n) {
        if (n % 2 == 0 || n % 3 == 0) 
        {
            return false;
        }
        for (int i=5; i<=Math.sqrt(n); i+=6) {
            if (n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int day = 24;
        int count = 0;
        for (int i=2022; i<=3022; i++) {
            String r = "11" + Integer.toString(day) + Integer.toString(i);
            String result = "11/" + Integer.toString(day) + "/" + Integer.toString(i);
            System.out.println(result);
            
            int check = Integer.parseInt(r);
            if (isPrime(check)) {
                count++;
            }
            
            if (i % 400 == 399) {
                day-=2;
            } else if (i % 100 == 99) {
                day--;
            } else if (i % 4 == 3) {
                day -= 2;
            } else {
                day--;
            }
            if (day < 22) {
                int diff = 22 - day;
                day = 28 - diff + 1;
            }
        }
        System.out.println("There are " + count + " prime Thanksgiving days.");
    }
}

// There are 51 prime Thanksgiving days.