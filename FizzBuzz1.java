class FizzBuzz {
    private int n;
    private volatile int count=1;
    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(count<=n){
            synchronized(FizzBuzz.class){
                if(count<=n&&count%3==0&&count%5!=0){
                    printFizz.run();
                    count++;
                    FizzBuzz.class.notifyAll();
                }
                
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(count<=n){
            synchronized(FizzBuzz.class){
                if(count<=n&&count%3!=0&&count%5==0){
                    printBuzz.run();
                    count++;
                    FizzBuzz.class.notifyAll();
                }
                
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(count<=n){
            synchronized(FizzBuzz.class){
                if(count<=n&&count%3==0&&count%5==0){
                    printFizzBuzz.run();
                
                    count++;
                    FizzBuzz.class.notifyAll();
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(count<=n){
            synchronized(FizzBuzz.class){
                if(count<=n&&count%3!=0&&count%5!=0){
                    printNumber.accept(count);
                    count++;
                    FizzBuzz.class.notifyAll();
                }
            }
        }
    }
}