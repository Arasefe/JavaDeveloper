package lambdaLinkedin.courseShaun.chapter2;

public class LambdaIntro4 {
    protected static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age){
            this.name=name;
            this.age=age;
        }
    }

    protected static class DataLoader{
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment){
            this.loadPerson=isDevelopment?this::loadPersonFake:this::loadPersonReal;
        }

        private Person loadPersonReal(){
            System.out.println("Loading real Person...");
            return new Person("Aras",7);
        }

        private Person loadPersonFake(){
            System.out.println("Loading fake Person...");
            return new Person("Yaman",44);
        }
    }

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT=true;
        DataLoader dataLoader=new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
