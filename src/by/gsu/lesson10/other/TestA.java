package by.gsu.lesson10.other;

public class TestA {

    private int testAfield;

    public int getTestAfield() {
        return testAfield;
    }

    public void setTestAfield(int testAfield) {
        this.testAfield = testAfield;
    }

    //
    public static class TestNestedTopLevelA {
        public String someName;

        public TestNestedTopLevelA() {
            //testAfield - error!
        }
    }

    public class InnerClassA {

        private int innerFieldA;

        public InnerClassA() {
            testAfield = 123;
        }
    }
}
