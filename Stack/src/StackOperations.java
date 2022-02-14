public class StackOperations {


    public static boolean search(Stack s, int val){
        Stack temp = new Stack(s.size());
        boolean found=false;
        while(!s.isEmpty()){
            int topElement=s.pop();
            temp.push(topElement);
            if(topElement==val){
                found=true;
                break;
            }
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }

        return found;
    }

    /*public static void remove(Stack s,int val){
        if (search(s,val)){
            val = s.pop();
        }*/

    /*int maximumValue(Stack stack) {
        Stack temp = new Stack(stack.size());
        int maximum = Integer.MIN_VALUE;

        for (int value :  ) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }*/
    /*public void enBuyukSayiyiGoster(Stack s)
    {
        if(s.isEmpty() )
            System.out.println("stack boş  ! ");
        else
        {
            Stack temp = new Stack(s.size());

            int buyuk= s.peek();
            temp = s;
            while(temp!= null  )
            {
                if( buyuk < temp.peek())
                    buyuk = temp.peek() ;
            }
                temp.display();
            System.out.println("en büyük sayi : " + buyuk);
        }
    }*/



}

