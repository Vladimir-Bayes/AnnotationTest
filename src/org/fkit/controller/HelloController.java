package org.fkit.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */

/**
 *  HelloController��һ������ע��Ŀ�����,
 *  ����ͬʱ����������������������ʵ���κνӿڡ�
 *  org.springframework.stereotype.Controllerע������ָʾ������һ��������
 */
@Controller
public class HelloController{

	 private static final Log logger = LogFactory
	            .getLog(HelloController.class);
	 
	 /**
	  * org.springframework.web.bind.annotation.RequestMappingע��
	  * ����ӳ������ĵ�URL������ķ����ȡ���������ӳ��"/hello"
	  * helloֻ��һ����ͨ������
	  * �÷�������һ��������ͼ·������ͼ·����ģ�͵�ModelAndView����
	  * */
	 @RequestMapping(value="/hello")
	 public String hello(Model model) {
		 logger.info("hello���� ������");
		 model.addAttribute("message","Hello World!");
		 return "welcome";
	 }
	 
	 @RequestMapping(value="/thankyou")
	 public String thankyou(Model model) {
		 logger.info("thankoyou����������");
		 model.addAttribute("message","лл");
		 return "welcome";
	 }
	 
//	 public ModelAndView hello(){
//		 logger.info("hello���� ������");
//		 // ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
//		 ModelAndView mv = new ModelAndView();
//		 //���ģ������ �����������POJO����  
//	     mv.addObject("message", "Hello World12313123!");  
//	     // �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
//	     mv.setViewName("/WEB-INF/content/welcome.jsp"); 
//		// ����ModelAndView����
//		return mv;
//	 }

}

