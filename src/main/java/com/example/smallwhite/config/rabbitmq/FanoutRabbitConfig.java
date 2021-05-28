package com.example.smallwhite.config.rabbitmq;import org.springframework.amqp.core.Binding;import org.springframework.amqp.core.BindingBuilder;import org.springframework.amqp.core.FanoutExchange;import org.springframework.amqp.core.Queue;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;/** * 扇形交换机 * @author: yangqiang * @create: 2020-10-14 13:51 */@Configurationpublic class FanoutRabbitConfig {    /**     *  创建三个队列 ：queueA   queueB  queueC     *  将三个队列都绑定在交换机 fanoutExchange 上     *  因为是扇型交换机, 路由键无需配置,配置也不起作用     */    @Bean    public Queue queueA(){        return new Queue("queueA");    }    @Bean    public Queue queueB(){        return new Queue("queueB");    }    @Bean    public Queue queueC(){        return new Queue("queueC");    }    @Bean    public FanoutExchange fanoutExchange(){        return new FanoutExchange("fanoutExchange");    }    @Bean    Binding bindingExchangeA(){        return BindingBuilder.bind(queueA()).to(fanoutExchange());    }    @Bean    Binding bindingExchangeB(){        return BindingBuilder.bind(queueB()).to(fanoutExchange());    }    @Bean    Binding bindingExchangeC(){        return BindingBuilder.bind(queueC()).to(fanoutExchange());    }}