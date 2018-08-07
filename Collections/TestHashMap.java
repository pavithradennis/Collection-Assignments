package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class TestHashMap {

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		//adding objects to the map
		
		map.put("Pavithra", "banana");
		map.put("Rima", "watermelon");
		map.put("Catherine", "grapes");
		map.put("Dennis","melon");
		
		Set<Entry<String,String>> set = map.entrySet();
		set.stream().forEach((e)->System.out.println(e.getKey() + " "+e.getValue()));
		Set <String> keyset = map.keySet();
		System.out.println("Key set values are:" + keyset);
		
	}

}
