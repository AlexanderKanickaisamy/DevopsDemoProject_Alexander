package org.jboss.jdf.example.ticketmonster.model;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Performance.class)
public abstract class Performance_ {

	public static volatile SingularAttribute<Performance, Date> date;
	public static volatile SingularAttribute<Performance, Show> show;
	public static volatile SingularAttribute<Performance, Long> id;

}

