package tadak4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Practice {
    static void main(String[] args) throws IOException {
        InputStream in = System.in;// byte 단위로 받고
        InputStreamReader reader = new InputStreamReader(in); //byte를 원래 글자로
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
    }
}
