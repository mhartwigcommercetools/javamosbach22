package com.education.mosbach.classes.class10examprep;

public class Exam {

    // TODO Getter/Setter

    private String module;
    private int difficulty;   // von 0 bis superleicht bis 10 sehr schwer

    public Exam(String module, int difficulty) {
        this.module = module;
        this.difficulty = difficulty;
    }

    @Override
    public int hashCode() {
        // Wer equals implementiert, muss auch hashCode implementieren

        return
                difficulty;
    }

    @Override
    public boolean equals(Object obj) {

        // null
        if (obj == null) return false;

        // falsche Klasse
        if (obj.getClass() != this.getClass()) return false;

        // vergleich
        Exam otherExam = (Exam) obj;
        return
                (otherExam.module.equals(this.module) && otherExam.difficulty == this.difficulty);
    }

    @Override
    public String toString() {
        return
                "Module: " + module + " ist so schwer: " + difficulty;
    }
}
