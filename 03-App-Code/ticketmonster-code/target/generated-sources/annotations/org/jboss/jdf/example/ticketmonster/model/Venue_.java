package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Venue.class)
public abstract class Venue_ {

	public static volatile SingularAttribute<Venue, Address> address;
	public static volatile SingularAttribute<Venue, String> name;
	public static volatile SingularAttribute<Venue, String> description;
	public static volatile SingularAttribute<Venue, Long> id;
	public static volatile SetAttribute<Venue, Section> sections;
	public static volatile SingularAttribute<Venue, MediaItem> picture;
	public static volatile SingularAttribute<Venue, Integer> capacity;

}

