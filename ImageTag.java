package customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ImageTag extends SimpleTagSupport {
	
	String url="";
	boolean showBorder=false;
	boolean showUrl=false;
	public void setShowUrl(boolean showUrl) {
		this.showUrl=showUrl;
	}
	public void setShowBorder(boolean showBorder) {
		this.showBorder=showBorder;
	}
	public void setUrl(String url) {
		this.url=url;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		PageContext ctx=(PageContext) getJspContext();
		JspWriter out=ctx.getOut();
		String str="";
		try {
			if(showUrl) {
				str+="<h3>"+url+"</h3>\n";
			}
			str+="<img alt=\"Oh no,there is no image\" src=\""+url+"\"";
			if(showBorder) {
				str+="border=\"1\" />";
			}
			else {
				str+="/>";
			}
			
			out.println(str);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		super.doTag();
	}
}
