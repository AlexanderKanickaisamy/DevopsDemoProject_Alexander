package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Seat.class)
public abstract class Seat_ {

	public static volatile SingularAttribute<Seat, Integer> number;
	public static volatile SingularAttribute<Seat, Section> section;
	public static volatile SingularAttribute<Seat, Integer> rowNumber;

}

