package ex1.builder.product;

/* "Product" */
public class Pizza {
    private String type;
    private String dough = "";
    private String sauce = "";
    private String topping = "";
    private String crust = "";

    public Pizza(String type) {
        this.type = type;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getType() {
        return type;
    }
}

