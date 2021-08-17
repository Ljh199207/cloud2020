package com.atguigu.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jinghailiang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("payment")
public class Payment extends Model<Payment> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("serial")
    private String serial;
}