
    public class question7 {
        static String firstname;
        static String lastname;
        static int age;
        static{
            firstname="Payal";
            lastname= "Nigam";
            age= 21;
        }
        static void p(int age,String firstname,String lastname)
        {
            System.out.println("Firstname- " + firstname + " Lastname- " + lastname + " Age- " + age);
        }
        public static void main(String[] args) {

            question7 a=new question7();
            a.p(age,firstname,lastname);
        }
    }
