import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MapTest12 {
	
	public static void test(){
		List<Map<String,Integer>> mapslist=new ArrayList<Map<String,Integer>>();
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("test1", 3);
		hm.put("test2", 4);
		Map<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.put("test3", 5);
		mapslist.add(hm);
		mapslist.add(hm1);
		for(int i=0;i<mapslist.size();i++){
			Map<String,Integer> mymap=mapslist.get(i);
		for(Entry<String, Integer> entry:hm.entrySet()){
			System.out.println("key:"+entry.getKey()+"\n"+"value:"+entry.getValue());
		
		}
	}}
	
	
	public static void main(String[] args){
		test();
	}

}
