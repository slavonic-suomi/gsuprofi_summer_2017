package by.gsu.lesson6.strings;



public class StringsMain {


    public static void main(String[] args) {
        char s[] = new char[3];
        s[0] = 'q';
        s[1] = 'w';
        s[2] = 'e';

        String s1 = new String(s);

        String s2 = "qwe";

        String s3 = "asd" + "qwe" + "zxc";

        StringBuilder builder = new StringBuilder();

        builder
                .append(123)
                .append('c')
                .append("qwe")
                .append(" ")
                .append(true)
                .insert(2, 'Z');

        String s4 = builder.toString();

        System.out.println(s4);

        //в каждой итерации создаётся новый объект
        String si = "res";
        for (int i = 0; i < 10; i++) {
            si += i;
        }

        System.out.println(si);

        String original = "01234567890";
        //подстрока
        System.out.println(original.substring(5));
        System.out.println(original.substring(5, 7));

        //поиск позиции
        int threePos = original.indexOf('3');
        int threeSeqPos = original.indexOf("345");

        System.out.println(threePos);
        System.out.println(threeSeqPos);

        System.out.println(original.indexOf('0'));
        System.out.println(original.lastIndexOf('0'));

        System.out.println(original.indexOf('0', 2));

        //"оканчивается на"
        String txtFileName = "file.txt";
        System.out.println(txtFileName.endsWith(".txt"));

        String stringWithWhitespaces = "  123   12345  45 6 7 ";
        //удаление обрамляющих пробелов
        String n1 = stringWithWhitespaces.trim();
        System.out.println(n1);

        //замена всех символов в строке
        System.out.println(n1.replaceAll(" ", ""));

        //разбиение по условию
        String fio = "Ivanov Ivan Ivanovich";
        String[] split = fio.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        System.out.println("qwe".indexOf("zqwe"));



    }

}
