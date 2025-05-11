import  java.util.Scanner;

class SLList {
    private  static class Intnode{
        private int item;
        private Intnode next;

        public Intnode(int i, Intnode n){
            this.item = i;
            this.next = n;
        }
    }
    private Intnode sentinel;
    private int size;

    public SLList(){
        sentinel = new Intnode(-999,null);
        size = 0;
    }

    public void addNode(int x){
        Intnode p;
        p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new Intnode(x,null);
        size += 1;
    }

    public int getSize(){
        return size;
    }

    public void print(){
        Intnode p = sentinel;

        if (this.getSize() != 0){
            p = sentinel.next;
            while(p.next != null){
                System.out.printf(p.item+"->");
                p = p.next;
            }
            System.out.println(p.item);
        }else{
            System.out.println("Empty SLList");
        }
    }
}

public class Ch4_SLList {
    public static void main(String[] agrs) {
        SLList l = new SLList();
        Scanner scanner = new Scanner(System.in);  // 全局 Scanner
        while(true) {
            menu(l, scanner);
        }
    }

    public static void menu(SLList list, Scanner scanner) {
        System.out.println("Menu: \n1. Add integer\n2. Print the SLList\n3. Get size");
        int choice = scanner.nextInt();
        scanner.nextLine();  // 关键修复：清除输入缓冲区
        switch(choice) {
            case 1:
                System.out.println("Input the integer: ");
                int number = scanner.nextInt();
                scanner.nextLine();  // 再次清除缓冲区
                list.addNode(number);
                break;
            case 2:
                list.print();
                break;
            case 3:
                System.out.println("Size :" + list.getSize());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
