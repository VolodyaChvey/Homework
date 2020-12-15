package src.Homework7_1;

import java.time.LocalDate;

public class Journal {
    private int numberTicket;
    private String titleAuthorOfBook;
    private LocalDate dateOfIssue;
    private int periodOfIssue;
    private LocalDate dateReturn;
    private boolean indebtedness;

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getTitleAuthorOfBook() {
        return titleAuthorOfBook;
    }

    public void setTitleAuthorOfBook(String titleAuthorOfBook) {
        this.titleAuthorOfBook = titleAuthorOfBook;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public int getPeriodOfIssue() {
        return periodOfIssue;
    }

    public void setPeriodOfIssue(int periodOfIssue) {
        this.periodOfIssue = periodOfIssue;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {

        this.dateReturn = dateReturn;
    }

    public boolean getIndebtedness() {
        return indebtedness;
    }

    public void setIndebtedness(boolean indebtedness) {
        this.indebtedness = indebtedness;
    }

    public void debtor() {
        indebtedness = dateOfIssue.plusDays(periodOfIssue).isBefore(dateReturn);
    }
}
