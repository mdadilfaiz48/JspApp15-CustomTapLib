package com.adil.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PrintLabelTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	
	public PrintLabelTag() {
		 System.out.println("0-constractor param");
	}
   
	 public int doStartTag()throws JspException{
		 System.out.println("doStartTag method start");
		 JspWriter jw = pageContext.getOut();
		 try {
			 jw.println("<h1>The prime no are</h1>");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return SKIP_BODY;
		 
		 
	 }
	 public int doEndTag()throws JspException {
		 System.out.println("doEndTag method start");
		 return EVAL_PAGE;
	 }
}
