package entities;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<String, Object> map = new HashMap<>();
    
	@SuppressWarnings("unchecked")
	public <R> R get(String name) {	
		return (R) map.get(name);
	}
	
	public  void put(String name, Object input){
		this.map.put(name, input);
	}
	public void remove(String name) {
		map.remove(name);
	}
}
