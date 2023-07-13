/**
 * q1_choclateProblem
 */
public class q1_choclateProblem {

    static boolean isDivisionPossible(int a[], int m, int maxChoclateAllowed) {
        int numOfStudents = 1;
        int choclate = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxChoclateAllowed)
                return false;
            if (choclate + a[i] <= maxChoclateAllowed) {
                choclate += a[i];
            } else {
                numOfStudents++;
                choclate = a[i];
            }
        }
        return numOfStudents <= m;
    }

    static int distributeChoclate(int a[], int m) {
        int ans = 0;
        int st = 1;
        int end = (int) 1e9;
        if (a.length < m)
            return -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isDivisionPossible(a, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int student = 2;
        int numberOfChoclate[] = { 12, 34, 67, 90 };

        System.out
                .println("\nminimal maxima of all the divisions is:- " + distributeChoclate(numberOfChoclate, student));
        System.out.println();
    }
}