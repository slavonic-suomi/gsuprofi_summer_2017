package by.gsu.lesson7;

public class PersonMain {

    public static void main(String[] args) {
        ScannerWrapper scanner = new ScannerWrapper();

        System.out.println("input person count");
        int count = scanner.readInt();


        Person[] persons = new Person[count];

        for (int i = 0; i < count; i++) {
            try {
                Person person = readPerson(scanner);
                persons[i] = person;
            } catch (SomeStrangeException strangeExc) {
                //nothing to do
            } catch (Exception paramExc) {
                System.out.println(paramExc.toString());
                paramExc.printStackTrace();
            }
        }

        for (int i = 0; i < count; i++) {
            if (persons[i] == null) {
                System.out.println("null");
            } else {
                System.out.println(persons[i].toString());
            }
        }

    }

    public static Person readPerson(ScannerWrapper scanner)
            throws IncorrectParameterException, SomeStrangeException {

        Person person = null;
        int type = 0;

        while (type != 1 && type !=2) {
            System.out.println("select person type: 1 - jural, 2 - individual");
            type = scanner.readInt();
            if (type == 1) {
                person = new Jural();
            } else if (type == 2) {
                person = new Individual();
            } else {
                System.out.println("wrong type number");
            }
        }


        System.out.println("input name");
        String name = scanner.readLine();

        System.out.println("input inn");
        int inn = scanner.readInt();

        person.setInn(inn);
        person.setName(name);

        if (type == 1) {
            System.out.println("input emp count");
            int count = scanner.readInt();

            ((Jural)person).setEmployersCount(count);

        } else if (type == 2) {
            System.out.println("input age");
            int age = scanner.readInt();

            if (age <=0) {
                throw new IncorrectParameterException("age");
            }

            ((Individual)person).setAge(age);
        } else {
            System.out.println("wrong type number");
        }

//        System.out.println(person.toString());

        return person;
    }

}
