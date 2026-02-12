class FoolException extends Exception {
}

public class Sample4 {
    public void sayNick(String nick) {
        try {
            if("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        Sample4 sample = new Sample4();
        sample.sayNick("바보");
        sample.sayNick("야호");
    }
}
