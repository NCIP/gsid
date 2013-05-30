/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

public class Pair<T>
{
	public T start;
	public T finish;
	public Pair()
	{		
	}
	public Pair(T start, T finish)
	{	
		this.start = start;
		this.finish = finish;
	}
	
}
