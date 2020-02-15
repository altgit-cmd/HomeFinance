package model;

import exception.ModelException;

import java.util.Objects;

public class Currency extends Common {
    private String titile;
    private String code;
    private double rate;
    private boolean on;
    private boolean base;

    public Currency(String titile, String code, double rate, boolean on, boolean base) throws ModelException {
        if (titile.length() == 0) throw new ModelException(ModelException.TITLE_EMPTY);
        if (code.length() == 0) throw  new ModelException(ModelException.CODE_EMPTY);
        if (rate <= 0) throw new ModelException(ModelException.RATE_INCORRECT);
        this.titile = titile;
        this.code = code;
        this.rate = rate;
        this.on = on;
        this.base = base;
    }

    public Currency(){}

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean on() {
        return on;
    }

    public void setOn(boolean on) {
        on = on;
    }

    public boolean base() {
        return base;
    }

    public void setBase(boolean base) {
        base = base;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "titile='" + titile + '\'' +
                ", code='" + code + '\'' +
                ", rate=" + rate +
                ", on=" + on +
                ", base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;
        Currency currency = (Currency) o;
        return getCode().equals(currency.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String getValueFromComboBox() {
        return titile;
    }
    public double getRateByCurrency(Currency currency){
        return rate /currency.rate;
    }

}
