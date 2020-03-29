/**
 * @className SequencePrint
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/29 15:20
 * @Version 1.0
 **/
public class SequencePrint {
    public static class Print implements Runnable{
        String[] arr;
        int count;
        int i;
        volatile  static int index;
        public Print(String[] arr,int count,int i){
            this.arr=arr;
            this.count=count;
            this.i=i;
        }
        @Override
        public void run() {
            for(int j=0;j<count;j++){
                synchronized (SequencePrint.class){
                    while(index%arr.length!=i){
                        try {
                            SequencePrint.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    index++;
                    System.out.print(arr[i]);
                    if(i==arr.length-1){
                        System.out.println("===="+j);
                    }
                    SequencePrint.class.notifyAll();
                }
            }
        }
    }
    public static void print(String[] arr,int count){
        Print.index=0;
        for(int i=0;i<arr.length;i++){
            //final int k=i;
            new Thread(new Print(arr,count,i)).start();
        }
    }
    public static void main(String[] args) {
        print(new String[]{"A","B","C"},20);
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        print(new String[]{"d","e","f","g"},10);
    }
}
