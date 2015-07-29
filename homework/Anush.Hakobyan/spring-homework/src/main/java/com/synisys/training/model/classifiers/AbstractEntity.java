package com.synisys.training.model.classifiers;


import com.synisys.training.model.classifiers.api.Entity;

/**
 * Created by anush.hakobyan on 7/25/2015.
 */
public class AbstractEntity implements Entity {
	private int id;
	private String name;
	
	public AbstractEntity(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

//	@Override
//	public String toString() {
//		return Objects.toStringHelper(getClass()).add("id", id).add("name", name).toString();
//	}

	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		return obj==this || obj != null && getClass().equals(obj.getClass()) && id==((Entity)obj).getId();
	}		
	
}
