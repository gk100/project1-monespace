package com.monespace.DAO;

import java.util.List;

import com.monespace.model.ShortListedProperty;

public interface ShortListedPropertyDAO {

	public void createPropertyShortList (ShortListedProperty shortListedProperty);
	//public void addToShortList(ShortListedProperty shortListedProperty);
	public List<ShortListedProperty> shortListedList();
	public String ShortListedPropertyList();
	//public String stringShortListedProperty();
	//public SaveOrUpdate (ShortListedProperty shortListedProperty);
	//public ShortListedPropert getshortListedPropertyId (int shortListeID)
	
	public void deleteShortListedList(int shortListedPropertyId); //may be need to delete
	
}
