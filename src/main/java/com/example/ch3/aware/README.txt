在实际项目中，你不可避免的要用到Spring容器本身的功能资源，这时你的Bean必须要意识到Spring容器的存在
，才能调用Spring所提供的资源，这就是所谓的Spring Aware。
spring提供的Aware接口
BeanNameAware				获取容器中Bean的名称
BeanFactoryAware			获得当前bean factory,这样可以调用容器的服务
ApplicationContextAware		当前的application context，这样可以调用容器的服务
		