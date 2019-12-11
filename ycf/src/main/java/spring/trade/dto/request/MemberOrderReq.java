package spring.trade.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import spring.goods.dto.request.PegeBeanUtile;

@Data
public class MemberOrderReq extends PegeBeanUtile {
    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty(value = "订单状态:0待支付,1支付中,2支付失败,3支付成功,4待发货,5已发货,6确认收货,7订单完成,8申请退款,9退款中,10退款完成,11拒绝退款,12取消订单,13订单关闭")
    private String orderState;
}
