
public class Test {

    public static void main(String[] args) {
        GenericStack<Integer> gs= new GenericStack<Integer>(Integer.class,5);
        gs.push(5);
        gs.push(6);
        gs.push(2);
        gs.display();
        GenericStackOps<Integer> sops= new GenericStackOps<Integer>();
        System.out.println(sops.search(gs,6));
        GenericStackOps<String> sos = new GenericStackOps<String>();
        System.out.println(GenericStackOps.bracketControl("{[]}()[[]]"));
        System.out.println(GenericStackOps.postfixCalculate("231*+9-"));

        /*Stack s = new Stack(5);
        s.push(5);
        s.push(6);
        s.push(2);
        //s.pop();
        s.display();
        System.out.println(StackOperations.search(s,6));
        s.display();
        StackOperations stack = new StackOperations();
        s.display();*/

    }
}
