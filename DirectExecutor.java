

class DirectExecutor implements Executor
{
     public void execute(Runnable r)
     {
         r.run();
     }

 }