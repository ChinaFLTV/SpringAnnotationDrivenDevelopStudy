package selector;

/**
 * @author LiGuanda
 * @date PM 3:24:07
 * @description This is a description of MySelector
 * @since version-1.0
 */


import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MySelector implements ImportSelector {


    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"bean.Wife"};

    }


}
