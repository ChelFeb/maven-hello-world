package com.mycompany.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //почему XmlBeanFactory зачеркнута
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springCfg.xml"));

        Гетьман гетьман = (Гетьман) factory.getBean("getman");

        гетьман.сходитьВПоход();
    }
}
