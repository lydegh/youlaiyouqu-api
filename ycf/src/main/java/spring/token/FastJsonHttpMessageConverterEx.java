package spring.token;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

public class FastJsonHttpMessageConverterEx extends FastJsonHttpMessageConverter {
    public FastJsonHttpMessageConverterEx() {}

    @Override
    protected boolean supports(Class<?> clazz) {
        return super.supports(clazz);
    }
}
