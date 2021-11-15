import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoonNo2439_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for (int i = 1; i <= input; i++) {
            bw.write(" ".repeat(input - i));
            bw.write("*".repeat(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
