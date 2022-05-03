package com.education.mosbach.classes.class10examprep;

import java.util.Date;

public class Portfolio implements DHBWSubmission {

    @Override
    public String getModule() {
        return "Portfolio";
    }

    @Override
    public Date getDate() {
        return
                new Date("04-05-2022");
    }

    // Calculates only before/after, not the real difference
    @Override
    public int calculateDatesBeforeSubmissionIsDue() {
        return
                getDate().compareTo(new Date());
    }
}
