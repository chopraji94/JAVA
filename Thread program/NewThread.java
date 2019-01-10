class NewThread implements Runnable
{
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String t_name)
    {
        name = t_name;
        t = new Thread(this,name);
        System.out.println("New Thread "+t+" has begun");
        suspendFlag = false;
        t.start();
    }

    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println(name+" "+i);
                Thread.sleep(1000);
                synchronized(this)
                {
                    while(suspendFlag)
                    {
                        wait();
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Thread interrupted "+e);
        }

        System.out.println("Thread "+ name +" has exited");
    }

    void threadSuspend()
    {
        suspendFlag = true;
    }

    synchronized void threadResume()
    {
        suspendFlag = false;
        notify();
    }
}