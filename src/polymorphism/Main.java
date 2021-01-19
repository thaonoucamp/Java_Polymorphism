package polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Person p = new Employee();

        emp.setName("A");
        emp.setLuong(1000);
        emp.thongTin();

        p.setName("B");
        p.thongTin();
  //      p.setLuong(2000); (bien kieu Cha chi goi Ham cua Cha);

        Person person = new Person();
        person.thongTin();
    }
}
// 5.7_ (Obj) ton tai nhieu (kieu) du kieu khac nhau;

// Tinh da hinh chi ap dung cho lop con co (1) lop cha;

// 15_ (Bien) tao ra o (kieu Class) nao thi chi (goi) duoc Ham cua Class do;

// 11.14_ Obj (kieu) cha goi ham con thi phai (Override) Ham trong lop con;

// Sub extends Super.

// 11.14_ Super does not extends Sub;

// 11.14_ (Ham) Override chi (goi) duoc tu cac Obj tao ra trong lop cua no;