package Peer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Main_Peer {
	private static final Map<String, Supplier<Starting>> factoryMap = new HashMap<>();

	static {
		factoryMap.put("Yining", Yining::new);
		factoryMap.put("Amber", Amber::new);
		factoryMap.put("Ayomide", Ayomide::new);
		factoryMap.put("Nat", Nat::new);
		factoryMap.put("Zarko", Zarko::new);
		factoryMap.put("Naima", Naima::new);
		factoryMap.put("Connor_3", Connor_3::new);
		factoryMap.put("Karolain", Karolain::new);
		factoryMap.put("Amjad", Amjad::new);
		factoryMap.put("Phuong_Tran", Phuong_Tran::new);
		factoryMap.put("Mateusz", Mateusz::new);
		factoryMap.put("Yasmine", Yasmine::new);
	}

	private static final Map<String, Starting> instanceMap = new HashMap<>();

	private static Starting getInstace(String key) {
		return instanceMap.computeIfAbsent(key, k -> factoryMap.getOrDefault(k, () -> null).get());
	}

	public static void main(String[] args) {
		getInstace("Yasmine").start();
	}

}
