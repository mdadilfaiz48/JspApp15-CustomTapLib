package com.adil.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class DisplayTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	private int size =20;
	private String font;

	public void setSize(int size) {
		this.size = size;
	}

	public void setFont(String font) {
		this.font = font;
	}


  
	public int doStartTag()throws JspException {
		  // get out object
		 JspWriter jw = pageContext.getOut();
		   try {
			     jw.println("<span style='font-family:"+font+";font-size:"+size+"+px;'>");
		   }catch(Exception e){
			    e.printStackTrace();
		   }
		return EVAL_BODY_INCLUDE;
	}//doStartTag()
	
	public int doEndTag()throws JspException {
		  // get out object
		 JspWriter jw = pageContext.getOut();
		   try {
			     jw.println("</span>");
		   }catch(Exception e){
			    e.printStackTrace();
		   }
		 return EVAL_PAGE;
	}// doEndTag()
}//End class
