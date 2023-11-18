package Peer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Main_Peer {
	private static final Map<String, Supplier<Starting>>factoryMap = new HashMap<>();
	
	static {
		factoryMap.put("Yining", Yining::new);
		factoryMap.put("Amber", Amber_2::new);
		factoryMap.put("Ayomide", Ayomide::new);
	}
	
	private static final Map<String,Starting> instanceMap = new HashMap<>();
	
	private static Starting getInstace(String key) {
		return instanceMap.computeIfAbsent(key,k->factoryMap.getOrDefault(k,()->null).get());
	}
	
	public static void main(String[] args) {
		getInstace("Ayomide").start();
	}

}
