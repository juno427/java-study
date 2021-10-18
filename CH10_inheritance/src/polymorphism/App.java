package polymorphism;

public class App {

	public static void main(String[] args) {
		// ��ü�� ��ӹ��� Cat Ÿ������ ����
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Cat cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		//cats[0] = new HouseCat();
		//cats[1] = new RoadCat();
		//cats[2] = new TigerCat();

	}

}
