package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 만원을 넘지 말라")
/**
 * 그런데 실제 사용해보면 제약이 많고 복잡하다. 그리고 실무에서는 검증 기능이 해당 객체의 범위를
 * 넘어서는 경우들도 종종 등장하는데, 그런 경우 대응이 어렵다.
 * 따라서 오브젝트 오류(글로벌 오류)의 경우 @ScriptAssert 을 억지로 사용하는 것 보다는 다음과 같이
 * 오브젝트 오류 관련 부분만 직접 자바 코드로 작성하는 것을 권장한다.
 * */
public class Item {

    /**
     *
     * @NotBlank : 빈값 + 공백만 있는 경우를 허용하지 않는다
     * @Notnull : null을 허용하지 않는다
     * @Range( min = 1000, max = 1000000 ) : 범위 안의 값이어야 한다
     * @Max(9999) : 최대 9999까지만 허용된다.
     *
     * */

    private Long id;
    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 1000000)
    private Integer price;
    @Range(min = 10, max = 1000)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
