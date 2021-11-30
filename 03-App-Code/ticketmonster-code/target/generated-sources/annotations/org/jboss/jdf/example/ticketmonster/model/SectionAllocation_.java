package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SectionAllocation.class)
public abstract class SectionAllocation_ {

	public static volatile SingularAttribute<SectionAllocation, Performance> performance;
	public static volatile SingularAttribute<SectionAllocation, Section> section;
	public static volatile SingularAttribute<SectionAllocation, Long> id;
	public static volatile SingularAttribute<SectionAllocation, Long> version;
	public static volatile SingularAttribute<SectionAllocation, boolean[][]> allocated;

}

