package register;

import bean.Wife;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author LiGuanda
 * @date PM 3:31:41
 * @description This is a description of MyRegister
 * @since version-1.0
 */


public class MyRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

        RootBeanDefinition beanDefinition = new RootBeanDefinition(Wife.class);
        registry.registerBeanDefinition("IU", beanDefinition);

    }
}
