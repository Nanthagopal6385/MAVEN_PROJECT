package Com.testing;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.reporters.jq.ResultsByClass;

public class Transformer_class implements IAnnotationTransformer {
	
    @Override
    public void transform(ITestAnnotation annotation,
    		Class testClass, Constructor testConstructor, Method testMethod) {
    	
   
          annotation.setRetryAnalyzer((Class<? extends IRetryAnalyzer>) ResultsByClass.class);
          
        }
}
