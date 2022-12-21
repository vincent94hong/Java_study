package ch12_map.hashmap_1024;

import java.util.HashMap;
import java.util.Iterator;

import ch12_collection_1024.Member;

public class AnimalHashMap {

	private HashMap<Integer, Animal> hashMap;
	
	public AnimalHashMap()
	{
		hashMap = new HashMap<Integer, Animal>();
	}
	
	public void addAnimal(Animal animal){
		
		hashMap.put(animal.getAnimalId(), animal);
		
	}
	
	public boolean removeAnimal(int animalId){
		
		if(hashMap.containsKey(animalId)){
			hashMap.remove(animalId);
			return true;
		}
		
		System.out.println(animalId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllAnimal(){
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Animal animal = hashMap.get(key);
			System.out.println(animal);
		}	
		System.out.println();
	}
}
