package com.education.mosbach.classes.class10examprep;

import com.google.common.util.concurrent.AtomicDouble;

import java.util.Date;

public class ExamSubmitter implements Runnable {

    // shared variables
    private Date submissionDate;
    private AtomicDouble numberOfSubmissions;   // brauche ich nicht schützen
    
    @Override
    public void run() {

        synchronized (submissionDate) {
            // jetzt kann ich auf submissionDate zugreifen
        }

    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ExamSubmitter());
        /*
        thread1.run();
        thread1.start();
        thread1.join();
        thread1.setDaemon();
        thread1.setPriority();

         */
    }


}
