package de.l3s.souza.annotation;

import java.util.Vector;


public class EntityUtils {
	
	private Annotations annotation;

	public EntityUtils() throws Exception {
		annotation = new Annotations ();
		annotation.initialize();
	}
	
	public void setLanguage (String input)
	{
		annotation.setLanguage(input);
	}
	
	public Vector<String> getLanguage ()
	{
		return annotation.getLanguage();
	}
	
	public String getLanguage (String str)
	{
		return annotation.getLanguage(str);
	}
	
	public String getEntities (String text)
	{
		annotation.annotate(text);
		return annotation.getAnnotationText();
	}
	
}
