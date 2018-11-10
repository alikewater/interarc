# interarc
互联网架构师技术栈学习包括：
  1.基本的多线程并发编程……
    1.1 线程概念
      线程发生异常如果不捕获的话，JVM会自动停止线程的后续工作。
      线程异常发生的处理方式：  日志记录后继续执行，或者回滚已经执行的内容。
    1.2 线程同步
    synchronized 线程同步锁重量级锁。锁是基于具体对象实例实现的，对象头部包含了锁的信息。具体又分为类锁和对象锁，
    类锁锁的是类class对象，对象锁锁的是具体class对象实例化出来的类的实例。sychronized结合notify和wait实现线程见同步。wait调用
    释放锁，notify调用不释放锁，因此notify实现同步不具备实时性。
    volatile关键字线程可见性，不保证原子性。结合volatile和CAS(Compare and Set)保证原子性。AtomicXXX数据类型通过该方法保证原子性。
    AQS通过采用CAS结合CLH队列实现高效率的线程并发控制，JUC包中的RetrenLock/Condition/CountDownLunch/Semaphore都属于这一体系。
    
  持续更新中……
  
  
