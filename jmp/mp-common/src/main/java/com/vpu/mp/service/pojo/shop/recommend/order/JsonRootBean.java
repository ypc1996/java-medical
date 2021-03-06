/**
  * Copyright 2019 bejson.com 
  */
package com.vpu.mp.service.pojo.shop.recommend.order;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Auto-generated: 2019-11-12 10:52:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonRootBean {

	@JsonProperty(value = "order_list")
    private List<OrderList> orderList;

}