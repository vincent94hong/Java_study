package ch12_map.hashmap_1024;

import ch12_collection_1024.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		AnimalHashMap animalHashMap = new AnimalHashMap();

		Animal animalLee = new Animal(2001, "이지원");
		Animal animalSon = new Animal(2002, "손민국");
		Animal animalPark = new Animal(2003, "박서훤");
		Animal animalHong = new Animal(2004, "홍길동");
		
//		Member memberLee = new Member(1001, "이지원");
//		Member memberSon = new Member(1002, "손민국");
//		Member memberPark = new Member(1003, "박서훤");
//		Member memberHong = new Member(1004, "홍길동");
		
		animalHashMap.addAnimal(animalLee);
		animalHashMap.addAnimal(animalSon);
		animalHashMap.addAnimal(animalPark);
		animalHashMap.addAnimal(animalHong);
		
//		memberHashMap.addMember(memberLee);
//		memberHashMap.addMember(memberSon);
//		memberHashMap.addMember(memberPark);
//		memberHashMap.addMember(memberHong);
		
		animalHashMap.showAllAnimal();
		
//		memberHashMap.showAllMember();
		
		animalHashMap.removeAnimal(2004);
		animalHashMap.showAllAnimal();
		
//		memberHashMap.removeMember(1004);
//		memberHashMap.showAllMember();
	}
}
