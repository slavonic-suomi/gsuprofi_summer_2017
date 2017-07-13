package by.gsu.lesson11;

public class FirstGenericExampleMain {
    public static void main(String[] args) {

        Phone phone1 = Phone.builder()
                .name("Iphone")
                .price(123.34f)
                .size(5)
                .build();

        System.out.println(phone1.toString());

        Container container1 = new Container();
        container1.add(phone1);

        Container container2 = new Container();
        container2.add("qwe");


        Phone object = (Phone) container1.getObject();

        GenericContainer<Phone> phoneContainer =
                new GenericContainer<Phone>();

        phoneContainer.add(phone1);
        Phone phone2 = phoneContainer.getObject();

        //phoneContainer.add("qwe");

        GenericContainer rawContainer = new GenericContainer();
        rawContainer.add(new Object());
        Object object1 = rawContainer.getObject();

        //........
        GenericContainer fakePhoneContainer = phoneContainer;
        fakePhoneContainer.add("wqeqwe");


        Phone phone3 = phoneContainer.getObject();


    }
}
