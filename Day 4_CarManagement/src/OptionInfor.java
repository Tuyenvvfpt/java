import java.util.Date;

public class OptionInfor {
    private Date create;
    private String addressProduct;
    private int amount;

    public OptionInfor() {
    }

    public OptionInfor(Date create, String addressProduct, int amount) {
        this.create = create;
        this.addressProduct = addressProduct;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public OptionInfor(Date create, String addressProduct) {
        this.create = create;
        this.addressProduct = addressProduct;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getAddressProduct() {
        return addressProduct;
    }

    public void setAddressProduct(String addressProduct) {
        this.addressProduct = addressProduct;
    }

    @Override
    public String toString() {
        return "OptionInfor{" + "create=" + create + ", addressProduct='" + addressProduct + '\'' + ", amount=" + amount + '}';
    }
}
