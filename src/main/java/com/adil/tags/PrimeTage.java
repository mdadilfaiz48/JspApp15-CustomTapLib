package com.adil.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PrimeTage extends TagSupport {
	private static final long serialVersionUID = 1L;
	private int n = 20;
	public void setN(int n) {
		System.out.println("setN(---)");
		this.n = n;
	}
	
	public PrimeTage() {
		 System.out.println("PrimeTag : 0-constractor param");
	}
	
	private boolean isPrime(int x) {
		 for(int i=2;i<x;++i) {
			 if(x%i==0)
			  return false;
		 }
		 return true;
	}
   
	 public int doStartTag()throws JspException{
		 JspWriter jw = pageContext.getOut();
		 try {
			 
			  for(int i=1;i<=n;++i) {
				  if(isPrime(i)) {
					  jw.println(i+"&nbsp;&nbsp;");
				  }
			  }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return SKIP_BODY;
		 
		 
	 }
	 public int doEndTag()throws JspException {
		 
		 return EVAL_PAGE;
	 }
}
