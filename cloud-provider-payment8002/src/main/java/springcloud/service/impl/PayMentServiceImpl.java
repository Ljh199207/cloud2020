package springcloud.service.impl;


import com.atguigu.springcloud.entities.Payment;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import springcloud.mapper.PaymentMapper;
import springcloud.service.PayMentService;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2021-08-09
 */
@Service
public class PayMentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PayMentService {

    @Override
    public int create(Payment payment) {
        return   baseMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return baseMapper.getPaymentById(id);
    }
}
