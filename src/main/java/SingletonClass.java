public class SingletonClass {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               B b= B.getInstance(); // lazy loading
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                B b =B.getInstance(); // lazy loading
            }
        });


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                B b =B.getInstance(); // lazy loading
            }
        });
        t2.start();
        t1.start();
        t3.start();
        t1.join(5000);


//                B b1 = B.getInstance();

//                C c = C.INSTANCE; // using enum INSTANCE

            }

        }


        class B{
            private static B b;
            private B(){}
            public static synchronized B getInstance(){
                if(b==null)
                {
                    b = new B();
                    System.out.println("New Object Created");
                }
                return b;
            }
        }

        enum  C{
            INSTANCE;
    }

