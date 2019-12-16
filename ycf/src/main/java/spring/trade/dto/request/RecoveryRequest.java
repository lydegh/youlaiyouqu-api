package spring.trade.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import spring.goods.dto.request.PageBeanUtile;

@Data
public class RecoveryRequest extends PageBeanUtile {
    @ApiModelProperty("用户ID")
    private Long memberId;

    @ApiModelProperty("提交回收订单—>0:待确认—>1:已报价—>2:确认回收价格—>3:上门验收—>4:已验收—>5:完成->6:取消")
    private Integer orderState;
}
