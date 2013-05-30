/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority.util;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Tree  implements java.io.Serializable
{
	String identifier;
	List<Tree> children;
	public String getIdentifier()
	{
		return identifier;
	}
	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}
	public List<Tree> getChildren()
	{
		return children;
	}
	public void setChildren(List<Tree> children)
	{
		this.children = children;
	}
	public Tree()
	{		
	}
	
	public Tree(String identifier, List<Tree> children)
	{	
		this.identifier = identifier;
		this.children = children;
	}
	
	public Tree(String identifier)
	{	
		this.identifier = identifier;
		this.children = new ArrayList<Tree>();
	}
	
	public void addChild(Tree someNode)
	{
		if(children==null)
		{
			children=new ArrayList<Tree>();
		}
		children.add(someNode);
	}
	
//	public String toString()
//	{
//		StringBuilder temp=new StringBuilder("");
//		if(identifier!=null)
//		{
//			temp.append("{");
//			temp.append("\"node\":\""+identifier.toString()+"\"");
//			if(parent!=null)
//			{
//				if(parent.size()>0)
//				{					
//					temp.append(",\"parent\":[");
//					for(int i=0;i<parent.size();i++)
//					{
//						Tree par=parent.get(i);
//						if(par!=null)
//						{
//							String childStr=par.toString();
//							if(childStr.length()>0)
//							{
//								temp.append(childStr);
//							}
//							if(i!=parent.size()-1)
//							{
//								temp.append(",");
//							}							
//						}
//					}
//					temp.append("]");
//				}
//			}			
//			temp.append("}");
//		}
//		
//		return temp.toString();
//	}
	
	public String toString(boolean flag)
	{
		StringBuilder temp=new StringBuilder("");
		if(identifier!=null)
		{
			if(flag)
			{
			temp.append("<ul>"+"<li>");
			}
			temp.append(identifier.toString());			
			if(children!=null)
			{
				if(children.size()>0)
				{					
					temp.append("<ul>");
					for(int i=0;i<children.size();i++)
					{
						temp.append("<li>");
						Tree par=children.get(i);
						if(par!=null)
						{
							String childStr=par.toString(false);
							if(childStr.length()>0)
							{
								temp.append(childStr);
							}														
						}
						temp.append("</li>");
					}
					temp.append("</ul>");
				}
			}
			if(flag)
			{
			temp.append("</li>");
			temp.append("</ul>");
			}
		}
		
		return temp.toString();
	}
	
}
