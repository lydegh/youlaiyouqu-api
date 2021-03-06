package spring.trade.dto.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class POrdersListResult {

    @ApiModelProperty(value = "ID主键")
    private Long id;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "发货时间")
    private Date sendTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "订单状态:0待支付,1支付成功,2支付失败,3待发货,4已发货,5确认收货,6订单完成,7申请退款,8退款中,9退款完成,10拒绝退款,11取消订单,12订单关闭")
    private String orderState;

    @ApiModelProperty(value = "商品总价(实付金额)")
    private BigDecimal orderPrice;

    @ApiModelProperty(value = "商品总数数量")
    private Integer goodsNum;

    @ApiModelProperty(value = "收件人姓名")
    private String receivedName;

    @ApiModelProperty(value = "收件人手机号码")
    private String phone;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String area;

    @ApiModelProperty(value = "详情地址")
    private String address;

    @ApiModelProperty(value = "省市区详情地址")
    private String detailedAddress;


    List<POrdersResult> list = new ArrayList<>();
}
