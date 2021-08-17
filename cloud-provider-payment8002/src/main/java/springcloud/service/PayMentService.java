package springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;


/**

 * @author ljh
 * @since 2021-08-09
 */
public interface PayMentService extends IService<Payment> {

     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
