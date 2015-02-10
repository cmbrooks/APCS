package hw17;

import java.util.HashSet;

@SuppressWarnings("hiding")
public class GGeorgeFS{
	/**
	 * 
	 */
	HashSet<String> fs;
	GGeorgeFS (int size){
		fs= new HashSet<String>(size);
	}
	
	public Boolean create(String s){
		return !fs.add(s);
	}
	
	public Boolean erase(String s){
		return !fs.remove(s);
	}
	
	@SuppressWarnings("unchecked")
	public String[] dir(){
		String[] hi=new String[fs.size()];
		return fs.toArray(hi);
	}
}