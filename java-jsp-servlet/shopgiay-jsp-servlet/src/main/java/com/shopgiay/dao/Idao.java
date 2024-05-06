package com.shopgiay.dao;

import java.util.ArrayList;

public interface Idao<T> {
	public int Insert(T t);
	public int Update(T t);
	public int Delete(T t);
	public ArrayList<T> SelectAll();
	public T SelectByID(T t);
}
