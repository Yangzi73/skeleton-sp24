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
    public static void main(String[] agrs){
        SLList l = new SLList();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        System.out.println("size: "+l.getSize());
        l.print();
    }
}
