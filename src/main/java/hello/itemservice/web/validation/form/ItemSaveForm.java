package hello.itemservice.web.validation.form;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ItemSaveForm {

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 100, max = 1000000)
    private Integer price;

    @NotNull
    @Range(min = 10, max = 1000)
    private Integer quantity;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
