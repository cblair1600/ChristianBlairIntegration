//Christian Blair, Class to use StringBuilder
public class StrBuilder {

    public void doSB() {
        StringBuilder sb = new StringBuilder();
        int oct1 = 192;
        int oct2 = 168;
        int oct3 = 1;
        String dot = ".";
        for (int i = 1; i < 25; i++) {
            sb.append(oct1);
            sb.append(dot);
            sb.append(oct2);
            sb.append(dot);
            sb.append(oct3);
            sb.append(dot);
            sb.append(i);
            System.out.println(sb);
            sb.setLength(0);

        }
    }

}