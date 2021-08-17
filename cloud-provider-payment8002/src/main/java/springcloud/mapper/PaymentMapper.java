package springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper  extends BaseMapper<Payment> {


     Payment getPaymentById(@Param("id") Long id);
}
