/* 
 * Copyright 2011 Antidot opensource@antidot.net
 * https://github.com/antidot/db2triples
 * 
 * DB2Triples is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * DB2Triples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/***************************************************************************
 *
 * R2RML Model : TriplesMap Interface
 *
 * A triples map specifies a rule for translating each
 * iteration of a logical source to zero or more RDF triples.
 * 
 * Modified by mielvandersande
 *
 ****************************************************************************/
package be.ugent.mmlab.rml.model;

import java.util.Set;
import net.antidot.semantic.rdf.rdb2rdf.r2rml.exception.InvalidR2RMLStructureException;


public interface TriplesMap extends Comparable<TriplesMap> {

	/**
	 * It must have exactly one logical source, which specifies a
	 * collection of values to be mapped to triples.
	 */
	public LogicalSource getLogicalSource();
	public void setLogicalSource(LogicalSource logicalSource);
        

	
	/**
	 * It must have exactly one subject map that specifies how to generate
	 * the subjects for each row of the logical table.
	 */
	public SubjectMap getSubjectMap();
	public void setSubjectMap(SubjectMap stdSubjectMap) throws InvalidR2RMLStructureException;

	/**
	 * It may have zero or more rr:predicateObjectMap properties, whose values 
	 * must be predicate-object maps. Each specifies a predicate-object pair 
	 * that, together with the subjects generated by the subject map,
	 * may form one RDF triple for each row.
	 * 
	 * @return
	 */
	public Set<PredicateObjectMap> getPredicateObjectMaps();
	public void addPredicateObjectMap(PredicateObjectMap predicateObjectMap);
	
	/**
	 * The triplesMap name.
	 */
	public String getName();
	public void setName(String name);

	

}
