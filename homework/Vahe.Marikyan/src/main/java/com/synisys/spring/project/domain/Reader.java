package com.synisys.spring.project.domain;

import java.sql.Date;
import java.util.List;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class Reader extends Person {

    private String cardNumber;

    private Date registrationDate;

    private List<BookReader> finishedBooks;

    public Reader(Integer id) {
        super(id);
    }



    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<BookReader> getFinishedBooks() {
        return finishedBooks;
    }

    public void setFinishedBooks(List<BookReader> finishedBooks) {
        this.finishedBooks = finishedBooks;
    }
}
