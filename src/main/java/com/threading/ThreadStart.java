package com.threading;

// Java code to see that all threads are
// pushed on same stack if we use run()
// instead of start().
class ThreadTest extends Thread
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
public class ThreadStart
{
    public static void main(String[] args)
    {
        int n = 8;
        for (int i=0; i<8; i++)
        {
            ThreadTest object = new ThreadTest();
            //object.start();
            object.run();
        }
    }
}

