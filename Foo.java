class Foo {
    volatile int sum=0;
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
         synchronized(Foo.class){
           while(sum%3!=0){
                Foo.class.wait();
            } 
            sum++;
            printFirst.run();
            Foo.class.notifyAll();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized(Foo.class){
            while(sum%3!=1){
                Foo.class.wait();
            }
            sum++;
           printSecond.run(); 
           Foo.class.notifyAll();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized(Foo.class){
            while(sum%3!=2){
                Foo.class.wait();
            }
            sum++;
            printThird.run();
            Foo.class.notifyAll();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        
    }
}