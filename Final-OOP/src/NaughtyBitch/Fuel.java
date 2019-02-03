package NaughtyBitch;

abstract class Fuel {

    private double price, interest, gallon, fund;

    public Fuel(double price, double interest, double gallon, double fund) {
        this.price = price;
        this.interest = interest;
        this.gallon = gallon;
        this.fund = fund;
    }

    public double getPrice() {
        return price;
    }

    public double getInterest() {
        return interest;
    }

    public double getGallon() {
        return gallon;
    }

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public Double calFund() {
        return calInterest() + getPrice()*getGallon();
    }

    public Double calInterest() {
        return getInterest()*getPrice()*getGallon();
    }


}

class Ron95IV extends Fuel {

    public Ron95IV(double price, double interest, double gallon, double fund) {
        super(price, interest, gallon, fund);
    }

    @Override
    public Double calFund() {
        return super.calFund();
    }

    @Override
    public Double calInterest() {
        return super.calInterest();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getInterest() {
        return super.getInterest();
    }

    @Override
    public double getGallon() {
        return super.getGallon();
    }

    @Override
    public double getFund() {
        return super.getFund();
    }

    @Override
    public void setFund(double fund) {
        super.setFund(fund);
    }

}

class Ron95III extends Fuel {

    public Ron95III(double price, double interest, double gallon, double fund) {
        super(price, interest, gallon, fund);
    }

    @Override
    public Double calFund() {
        return super.calFund();
    }

    @Override
    public Double calInterest() {
        return super.calInterest();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getInterest() {
        return super.getInterest();
    }

    @Override
    public double getGallon() {
        return super.getGallon();
    }

    @Override
    public double getFund() {
        return super.getFund();
    }

    @Override
    public void setFund(double fund) {
        super.setFund(fund);
    }

}

class E5 extends Fuel {

    public E5(double price, double interest, double gallon, double fund) {
        super(price, interest, gallon, fund);
    }

    @Override
    public Double calFund() {
        return super.calFund();
    }

    @Override
    public Double calInterest() {
        return super.calInterest();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getInterest() {
        return super.getInterest();
    }

    @Override
    public double getGallon() {
        return super.getGallon();
    }

    @Override
    public double getFund() {
        return super.getFund();
    }

    @Override
    public void setFund(double fund) {
        super.setFund(fund);
    }

}
