package base.domain;

import java.math.BigDecimal;

/**
 * Created by Satenik.Gevorgyan on 7/29/2015.
 */
public class Price {
    private BigDecimal amount;
    private Integer currencyID;

    //----------- Getters and Setters -----------//


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Integer currencyID) {
        this.currencyID = currencyID;
    }
}
