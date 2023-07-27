public class Parent {
        public int add(int i, int j){
            return i+j;
        }

        public void add(int i, int j,int k){
            System.out.println(i+j+k);
        }
    }

class Child extends Parent {
    public int add(int i, int j) {
        return i * j;
    }
}


class Temp{
    public static void main(String[] args) {
      Parent p1 = new Parent();
      Parent p2 = new Child();

      Child c1 = new Child();
//    Child c2 = new Parent();
        System.out.println(p2.add(1,9));
        try {

            System.out.println(p1.add(1, 2));
            System.out.println(p2.add(2, 9));
            System.out.println(c1.add(7, 2));
        }catch (Exception e){}

    }
}
